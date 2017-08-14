package Lab7;
/**
 * This class tests the Doctor class.
 * @author Mykal Burris
 * @since October 31, 2016
 * @version  1
 *
 */

public class DoctorTest {

    public static void main(String[] args){
        Doctor doctor1 = new Doctor("Mykal", "Geriatrics");
        Doctor doctor2 = new Doctor(null, "Pediatrics");

        doctor1.setSpeciality("Pediatrics");

        System.out.print("Doctor1");
        doctor1.display();

        System.out.print("\nDoctor2");
        doctor2.display();

        System.out.println("\nIs doctor1 equal to doctor2: " + doctor1.equals(doctor2));

        doctor2.setName("Mykal");

        System.out.print("\nDoctor1");
        doctor1.display();

        System.out.print("\nDoctor2");
        doctor2.display();

        System.out.println("\nIs doctor1 equal to doctor2: " + doctor2.equals(doctor1));


    }
}
