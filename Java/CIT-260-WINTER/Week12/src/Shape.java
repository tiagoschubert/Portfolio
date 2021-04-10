
public abstract class Shape {

    private int id;

    /**
     * Create a Shape using the provided id
     * @param id id of the Shape
     */
    public Shape(int id) {

        this.setId(id);
    }

    /**
     * Gets the id of the Shape
     * @return the id of the Shape
     */
    public int getId() {

        return id;
    }

    /**
     * Sets the id of the Shape
     * @param id set id of the Shape
     */
    public void setId(int id) {

        this.id = id;
    }

    /**
     * Formats the data and displays it
     */
    public void display() {

        System.out.format("%d           %.2f sq. inches\n", this.getId(), this.getArea());
    }

    /**
     * Calculates the area of a Shape
     * @return the area of the Shape
     */
    public abstract double getArea();
}
