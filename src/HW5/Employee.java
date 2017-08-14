package HW5;

/**
 * This class serves as a template for an employee.
 * @author Mykal Burris
 * @since October 31, 2016
 * @version  1
 *
 */

public class Employee extends Person {
    private int employeeNumber;

    /**
     * Constructor
     * @param name
     * @param employeeNumber
     */
    public Employee(String name, int employeeNumber){
        super(name);
        this.employeeNumber = employeeNumber;
    }

    /**
     * displays employee name and number
     */
    public void display(){
        super.display();
        System.out.printf("Lab7.HW5.Person Employee Number: %d\n", this.employeeNumber);
    }

    /**
     * @param otherEmployee
     * @return true if employee objects have same name and employee number
     */
    public boolean equals(Employee otherEmployee){
        return equals((Person)otherEmployee) && this.employeeNumber == otherEmployee.employeeNumber;

    }
}
