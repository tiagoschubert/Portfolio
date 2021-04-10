
/***************************************************
 GeometricObject                                   *
 --------------------------------------------------*
 - color: String                                   *
 - filled: boolean                                 *
 - dateCreated: java.util.Date                     *
 --------------------------------------------------*
 + GeometricObject()                               *
 + GeometricObject(color: String,filled: boolean)  *
 + getColor(): String                              *
 + setColor(color: String): void                   *
 + isFilled(): boolean                             *
 + setFilled(filled: boolean): void                *
 + getDateCreated(): java.util.Date                *
 + data(): String                                  *
 **************************************************/

// Implement GeometricObject class
public class GeometricObject {
    private String color = "black";
    private boolean filled;
    private java.util.Date dateCreated;

    /** Construct a default geometric object */
    public GeometricObject() {
        dateCreated = new java.util.Date();
    }


    /** get color */
    public String getColor() {
        return color;
    }

    /** get filled */
    public boolean getFilled() {
        return filled;
    }

    /** get date created */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    /** set color */
    public void setColor(String color) {
        this.color = color;
    }

    /** set filled */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /** Construct a geometric object with the specified color and filled value */
    public GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.setColor(color);
        this.setFilled(filled);
    }


    /** Return date created, color, and filled */
    public String data() {
        return "\ncreated on " + getDateCreated() +
                "\ncolor: " + getColor() +
                " and filled = " + getFilled() ;
    }


}
