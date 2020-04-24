import java.util.HashMap;
import java.util.Map;

import factory.*;

public class Data {
	private static Map<String, ShapeFactory> factories = new HashMap<String, ShapeFactory>();
	public static Map<String, ShapeFactory> getFactories() {
		return factories;
	}

	public static void addToFactory(ShapeFactory fac )
	{
		factories.put(fac.getName(),fac);
	}
	
	public static void loadData() {
		addToFactory(new RectFactory());
		addToFactory(new RectByPointsFactory());
		addToFactory(new CircleFactory());
		addToFactory(new TriangleFactory());
	}
	
	
}
