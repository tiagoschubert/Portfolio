public class Shape {
    protected String name;
    protected int id;
    protected String position;

    /**
     * Creates a Shape with id and dimensions
     * @param id is id of the shape
     * @param position of the shape
     */
    Shape(int id, String position) {
        this.id = id;
        this.position = position;
        this.name = "";
    }

    /**
     * Gets the id of the Shape
     * @return the id of the Shape
     */
    public int getId() {

        return id;
    }

    /**
     * Gets the getPosition of the Shape
     * @return the position of the Shape
     */
    public String getPosition() {

        return position;
    }

    /**
     * Gets the name of the Shape
     * @return the name of the Shape
     */
    public String getName() {

        return name;
    }

    /**
     * return toString
     */
    @Override
    public String toString() {

        return name + " " + id + " " + position + " ";
    }
}
