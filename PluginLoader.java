import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import factory.* ;


public class PluginLoader {
	
	public static void load(){
		FileInputStream fi;
		try {
			File folder = new File("Plugin");
			File[] listOfFiles = folder.listFiles();

			for (int i = 0; i < listOfFiles.length; i++) {
			  if (listOfFiles[i].isFile()) {
					fi = new FileInputStream(new File("Plugin\\"+listOfFiles[i].getName()));
					ObjectInputStream oi = new ObjectInputStream(fi);

					ShapeFactory factory = (ShapeFactory) oi.readObject();
					oi.close();
					fi.close();
					
			  } else if (listOfFiles[i].isDirectory()) {
			    System.out.println("Directory " + listOfFiles[i].getName());
			  }
			}
			fi = new FileInputStream(new File("Plugin\\Hexagon.txt"));
			ObjectInputStream oi = new ObjectInputStream(fi);

			ShapeFactory factory = (ShapeFactory) oi.readObject();
			oi.close();
			fi.close();
			
			Data.addToFactory(factory);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
