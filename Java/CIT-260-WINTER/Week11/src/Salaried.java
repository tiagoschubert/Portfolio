public class Salaried extends Employee{

    //Variables
    private double annualSalary;

    /**
     * create constructor Salaried
     */
    public Salaried() {}

    /**
     * @param name
     * @param serialNumber
     * @param annualSalary
     */
    public Salaried(String name, int serialNumber, double annualSalary) {
        super(name, serialNumber);
        this.annualSalary = annualSalary;
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

    /**
     * @return Gross Pay
     * */
    public double getGrossPay()
    {
        return annualSalary / 52;
    }


    /**
     * @return the annualSalary
     */
    public double getAnnualSalary() {
        return annualSalary;
    }

}
