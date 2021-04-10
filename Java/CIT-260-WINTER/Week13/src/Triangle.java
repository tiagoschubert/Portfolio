public class Triangle extends Shape {
    private double base_tri;
    private double height_tri;

    /**
     * Creates a Triangle with id and dimensions
     * @param id is id of the Triangle
     * @param height of the triangle
     * @param base of the triangle
     */
    public Triangle(int id, String position, double base, double height) {

        super(id, position);
        this.base_tri = base;
        this.height_tri = height;
        name = "Triangle";
    }
    /**
     * Gets the base
     * @return base
     */
    public double getBase() {

        return base_tri;
    }

    /**
     * Gets the height
     * @return height
     */
    public double getHeight() {

        return height_tri;
    }

    /**
     * Calculates the area of the Triangle
     * @return the area of the Triangle
     */
    public double calculateArea() {

        return base_tri * height_tri * (1 / 2.0);
    }

    /**
     * return toString
     */
    @Override
    public String toString() {

        return super.toString() + base_tri + " " + height_tri;
    }
}

