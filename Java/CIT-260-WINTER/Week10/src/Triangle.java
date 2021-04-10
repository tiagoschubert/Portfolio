
/**********************************************************
 * Triangle                                               *
 *--------------------------------------------------------*
 * - side1: double                                        *
 * - side2: double                                        *
 * - side3: double                                        *
 *--------------------------------------------------------*
 * + Triangle()                                           *
 * + Triangle(side1: double, side2: double, side3: double)*
 * + getSide1(): double                                   *
 * + getSide2(): double                                   *
 * + getSide3(): double                                   *
 * + getArea(): double                                    *
 * + SetSide1(side1:double):void                          *
 * + SetSide2(side2:double):void                          *
 * + SetSide3(side3:double):void                          *
 * + SetSide3(side3:double):void                          *
 * + toString(): String                                   *
 *********************************************************/

// Implement Triangle class
public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;


    /** get side1 */
    public double getSide1() {
        return side1;
    }

    /** get side2 */
    public double getSide2() {
        return side2;
    }

    /** get side3 */
    public double getSide3() {
        return side3;
    }

    /** set side1 */
    public void setSide1(double side1) {
        this.side1 = side1;
    }

    /** set side2 */
    public void setSide2(double side2) {
        this.side2 = side2;
    }

    /** set side3 */
    public void setSide3(double side3) {
        this.side3 = side3;
    }

    /** Construct default Triangle object */
    Triangle() {

        side1 = side2 = side3 = 1.0;
    }

    /** Construct a triangle with specified side1, side2 and side3 */
    Triangle(double side1, double side2, double side3) {
        this.setSide1(side1);
        this.setSide2(side2);
        this.setSide3(side3);
    }

    /** Return area of this triangle */
    public double getArea() {
        double s = (getSide1() + getSide2() + getSide3()) / 2;
        return Math.sqrt(s * (s - getSide1()) * (s - getSide2()) * (s - getSide3()));
    }

    /** Return a string description for the triangle */
    public String toString() {
        return "side1 = " + getSide1() + ", side2 = " + getSide2() + ", side3 = " + getSide3() +
                data() + "\nArea: " + getArea() +"\nGoodbye";
    }



}
