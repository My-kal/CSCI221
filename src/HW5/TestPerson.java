package HW5;

/**
 * This class serves as a test for the Person class.
 * @author Mykal Burris
 * @since October 31, 2016
 * @version  1
 *
 */
public class TestPerson {
    public static void main(String[] args){
        Person person1 = new Person("Sam Spade");
        Faculty faculty1 = new Faculty("Sebastian van Delden", 11000, "Computer Science");
        Faculty faculty2 = new Faculty("Sebastian van Delden", 23000, "Sociology");
        Faculty faculty3 = new Faculty("Vince Lombardi", 90000, "Sociology");
        Faculty faculty4 = new Faculty("Vince Lombardi", 90000, "Sociology");
        Staff staff1 = new Staff("Marilee Smith", 11111, 4);

        person1.display();
        faculty1.display();
        faculty2.display();
        faculty3.display();
        faculty4.display();
        staff1.display();

        System.out.printf("\nAre Faculty1 and Faculty2 equal? %b\n", faculty1.equals(faculty2));
        System.out.printf("\nAre Faculty3 and Faculty4 equal? %b\n", faculty3.equals(faculty4));
        System.out.printf("\nAre Faculty3 and Faculty4 equal using '==' method? %b\n", faculty3 == faculty4);
        System.out.printf("\nAre Sam Spade and Sebastian van Delden (computer science) equal? %b\n", person1.equals(faculty1));
        System.out.printf("\nAre Sam Spade and Marilee Smith equal? %b\n", person1.equals(staff1));



    }
}
