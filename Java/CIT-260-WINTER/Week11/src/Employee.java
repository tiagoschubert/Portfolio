public class Employee {

    //Variables
    private String name;
    private int serialNumber;

    /**
     * create constructor Employee
     */
    public Employee() {}

    /**
     * @param name
     * @param serialNumber
     */
    public Employee(String name, int serialNumber) {
        super();
        this.name = name;
        this.serialNumber = serialNumber;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the serialNumber
     */
    public int getSerialNumber() {
        return serialNumber;
    }

    /**
     * @return initial gross pay = 0
     * */
    public double getGrossPay()
    {
        return 0;
    }

    /**
     * @return initial FedWithholding = 0
     * */
    public double getFedWithholding()
    {
        return 0;
    }

    /**
     * @return initial StateWithholding = 0
     * */
    public double getStateWithholding()
    {
        return 0;
    }
}
