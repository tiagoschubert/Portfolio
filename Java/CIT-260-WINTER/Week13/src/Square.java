public class Square extends Shape {
    private double side_squ;

    /**
     * Creates a Triangle with id and dimensions
     * @param id is id of the Triangle
     * @param position of the triangle
     * @param side of the triangle
     */
    public Square(int id, String position, double side) {
        super(id, position);
        this.side_squ = side;
        name = "Square";
    }

    /**
     * Gets the side of the square
     * @return side of the square
     */
    public double getSide() {

        return side_squ;
    }

    /**
     * calculates the area of the shape
     * @return the are of the square
     */
    public double calculateArea() {

        return side_squ * side_squ;
    }

    /**
     * return toString
     */
    @Override
    public String toString() {

        return super.toString() + side_squ;
    }
}
