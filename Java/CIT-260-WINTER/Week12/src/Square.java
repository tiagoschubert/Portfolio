
public class Square extends Shape {
    private double size;

    /**
     * Creates a Square with the provided id and size
     * @param id is id of the square
     * @param size is size of the square
     */
    public Square(int id, double size) {

        super(id);
        this.setSize(size);
    }

    /**
     * Gets the size of the Square
     * @return the size of the square
     */
    public double getSize() {

        return size;
    }

    /**
     * Sets the size of the Square
     * @param size set size of the square
     */
    public void setSize(double size) {

        this.size = size;
    }

    /**
     * Calculates the are of the square
     * @return the are of the square
     */
    public double getArea(){

        return this.getSize() * this.getSize();
    }
}

