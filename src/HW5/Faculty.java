package HW5;

/**
 * This class serves as a template for a Faculty member.
 * @author Mykal Burris
 * @since October 31, 2016
 * @version  1
 *
 */

public class Faculty extends Employee{
    private String department;

    /**
     * Constructor
     * @param name
     * @param department
     * @param employeeNum
     */
    public Faculty(String name, int employeeNum, String department) {
        super(name, employeeNum);
        this.department = department;
    }

    /**
     * displays faculty name and department
     */
    public void display(){
        System.out.println();
        super.display();
        System.out.printf("Lab7.HW5.Person Faculty department: %s\n", this.department);
    }

    /**
     * @param otherFaculty
     * @return true if faculty objects have same name and department
     */
    public boolean equals(Faculty otherFaculty){
        return equals((Person)otherFaculty) && this.department.equalsIgnoreCase(otherFaculty.department);

    }
}
