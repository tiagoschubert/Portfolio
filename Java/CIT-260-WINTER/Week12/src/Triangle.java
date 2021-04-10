
public class Triangle extends Shape {

    private double side1;
    private double side2;

    /**
     * Creates a Triangle with id and dimensions
     * @param id is id of the Triangle
     * @param side1 is length of the  side 1
     * @param side2 is length of the  side 2
     */
    public Triangle (int id, double side1, double side2){

        super(id);

        this.setSide1(side1);
        this.setSide2(side2);
    }

    /**
     * Gets the length of the  side 1
     * @return the length of the  side 1
     */
    public double getSide1() {

        return side1;
    }

    /**
     * Gets the length of the  side 2
     * @return the length of the  side 2
     */
    public double getSide2() {

        return side2;
    }

    /**
     * Sets the length of the  side 1
     * @param side1 set length of the  side 1
     */
    public void setSide1(double side1) {

        this.side1 = side1;
    }

    /**
     * Sets the length of the  side 2
     * @param side2 set length of the  side 2
     */
    public void setSide2(double side2) {

        this.side2 = side2;
    }

    /**
     * Calculates the area of the Triangle
     * @return the area of the Triangle
     */
    public double getArea() {

        return ( this.getSide1() * this.getSide2() ) / 2;
    }
}