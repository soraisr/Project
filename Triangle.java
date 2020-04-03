
public class Triaaextends Shape {
		double radius;
		Circle(double radius){
			this.radius = radius ;
		}
		Circle(String radius){
			this.radius = Double.parseDouble(radius) ;
		}
		@Override
		public double calculate()
		{
			double area = Math.pow(radius,2)*Math.PI ;
			return area ;
		}
	}


}
