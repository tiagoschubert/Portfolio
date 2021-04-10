public class Hourly extends Employee{

    //Variables
    private double hourlyWage;
    private double hoursWorked;

    /**
     * create constructor Hourly
     */
    public Hourly() {}

    /**
     * @param name
     * @param serialNumber
     * @param hourlyWage
     * @param hoursWorked
     */
    public Hourly(String name, int serialNumber, double hourlyWage, double hoursWorked) {
        super(name, serialNumber);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    /**
     * @return the hourlyWage
     */
    public double getHourlyWage() {
        return hourlyWage;
    }

    /**
     * @return the hoursWorked
     */
    public double getHoursWorked() {
        return hoursWorked;
    }

    /**
     * @return the Gross pay
     * */
    public double getGrossPay()
    {
        return hourlyWage * hoursWorked;
    }

    /**
     * @return FedWithholding
     * */
    public double getFedWithholding()
    {
        return 0.15 * getGrossPay();
    }

    /**
     * @return StateWithholding
     * */
    public double getStateWithholding()
    {
        return 0.07 * getGrossPay();
    }

}

