
import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) {

        // create ArrayList employee
        ArrayList <Employee> employees = new ArrayList<Employee>();

        //Create employees
        Hourly hourlyEmployee1 = new Hourly("Harry Hacker", 123, 15, 30);
        Hourly hourlyEmployee2 = new Hourly("Isabel Intern", 233, 12.5, 20);
        Salaried salariedEmployee = new Salaried("Cathy Coder", 611, 80000);

        //Add employees to list
        employees.add(hourlyEmployee1);
        employees.add(hourlyEmployee2);
        employees.add(salariedEmployee);
        System.out.print("Payroll Report");

        //Loop and print output
        for(Employee emp:employees)
        {
            System.out.printf("\nEmployee: "+emp.getName()+" Serial: "+emp.getSerialNumber());
            System.out.printf("\nGross Pay: $%.2f",emp.getGrossPay());
            System.out.printf("\nFederal Withholding: $%.2f",emp.getFedWithholding());
            System.out.printf("\nState Withholding: $%.2f",emp.getStateWithholding());
            System.out.printf("\nNet Pay: $%.2f",(emp.getGrossPay() - emp.getFedWithholding() - emp.getStateWithholding()));
            System.out.printf("\n");
        }
    }

}


