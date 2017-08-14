package HW5;
/**
 * This class serves as a template for a Staff member.
 * @author Mykal Burris
 * @since October 31, 2016
 * @version  1
 *
 */
public class Staff extends Employee {
    private int yearsWorked;

    /**
     * Constructor
     * @param name
     * @param yearsWorked
     * @param employeeNum
     */
    public Staff(String name, int employeeNum, int yearsWorked) {
        super(name, employeeNum);
        this.yearsWorked = yearsWorked;
    }

    /**
     * displays staff name and num. of years worked
     */
    public void display(){
        System.out.println();
        super.display();
        System.out.printf("\nLab7.HW5.Person Staff Num. of Years Worked: %d\n", this.yearsWorked );
    }

    /**
     * @param otherStaff
     * @return true if staff objects have same name and have worked same amt of years
     */
    public boolean equals(Staff otherStaff){
        return equals((Person)otherStaff) && this.yearsWorked == otherStaff.yearsWorked;
    }
}
