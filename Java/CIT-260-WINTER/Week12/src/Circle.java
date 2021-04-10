
public class Circle extends Shape {

    private double radius;
    double pi = Math.PI;

    /**
     * Creates a Circle with the provided id and radius
     * @param id is id of the Circle
     * @param radius is radius of the Circle
     */
    public Circle(int id, double radius) {

        super(id);
        this.setRadius(radius);

    }

    /**
     * Gets the radius of a Circle
     * @return the radius of a Circle
     */
    public double getRadius() {

        return radius;
    }

    /**
     * Sets the radius of a Circle
     * @param radius set radius of a Circle
     */
    public void setRadius(double radius) {

        this.radius = radius;
    }

    /**
     * Calculates the area of a Circle
     * @return the area of the Circle
     */
    public double getArea(){

        return pi * (this.getRadius() * this.getRadius());
    }
}
