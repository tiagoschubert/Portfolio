public class Circle extends Shape {
    private double radius_cir;

    /**
     * Creates a square with id and dimensions
     * @param radius is id of the circle
     */
    public Circle(int id, String position, double radius) {
        super(id, position);
        this.radius_cir = radius;
        name = "Circle";
    }

    /**
     * Gets the radius of he circle
     * @return radius
     */
    public double getRadius() {

        return radius_cir;
    }

    /**
     * calculates the area of the circle
     * @return the are of the circle
     */
    public double calculateArea() {

        return Math.PI * radius_cir * radius_cir;
    }

    /**
     * return toString
     */
    @Override
    public String toString() {

        return super.toString() + radius_cir;
    }
}