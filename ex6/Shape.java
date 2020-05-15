package ex6;

public interface Shape {
    // Use a price in cents to avoid floating point round-off error
    double calculate(double[] params);

    // Normal billing strategy (unchanged price)
    static Shape rect() {
        return params -> (params[0]*params[1]);
    }
    static Shape circle() {
        return params -> (params[0]*params[0]*Math.PI);
    }
    static Shape triangle() {
        return params -> (0.25 * Math.sqrt((params[0]+params[1]+params[2])*(-params[0]+params[1]+params[2])*
        		(params[0]-params[1]+params[2])*(params[0]+params[1]-params[2])));
    }
    static Shape rectByPoints() {
        return params -> (Math.abs(params[2]-params[0])* Math.abs(params[3]-params[1]));
    }
    static Shape hexagon() {
        return params -> Math.pow(params[0],2) * 1.5 * Math.sqrt(3);
    }
}
