package Lab7;
/**
 * This class serves as a template for a Doctor.
 * @author Mykal Burris
 * @since October 31, 2016
 * @version  1
 *
 */


public class Doctor extends Person {
    private String speciality;

    public Doctor(String name, String mspeciality){
        super(name);
        setSpeciality(mspeciality);

    }

    public void setSpeciality(String mspeciality) {
        if (mspeciality == null){
            this.speciality = "unknown";
        }
        else {
            this.speciality = mspeciality;
        }
    }

    public String getSpeciality(){
        return speciality;
    }

    public void display(){
        System.out.printf("\nDoctor Name: %s\n", getName());
        System.out.printf("Doctor Speciality: %s\n", getSpeciality());
    }

    public boolean equals(Doctor otherDoctor){
        return equals((Person)otherDoctor) && this.getSpeciality().equals(otherDoctor.speciality);

    }
}
