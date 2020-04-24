package pluginFactories;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



public class NewFactories {

	public static void main(String[] args) {

		HexagonFactory fac = new HexagonFactory();


		try {
			FileOutputStream f = new FileOutputStream(new File("Plugin\\"+fac.getName()+".txt"));
			ObjectOutputStream o = new ObjectOutputStream(f);

			// Write objects to file
			o.writeObject(fac);


			o.close();
			f.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Error initializing stream");
		} 
	}

}