/**
 * This class serves as a test suite for a company template.
 * @author Mykal Burris
 * @since September 19, 2016
 * @version  1
 */
public class TestCompany {
    public static void main (String[] args) {
        Company company1 = new Company("Foot Locker", 1974, 1, 'O');
        Company company2 = new Company("Eastbay", 1980, 3000, 'D');
        Company company3 = new Company("Champs", 'D', company1, 2004, 35000, -1);

        System.out.printf("Company 1: %s\n", company1.getName());
        System.out.printf("Company 2: %s\n", company2.getName());
        System.out.printf("Company 3: %s\n", company3.getName());

        // test mutator methods
        company1.setId(407);
        company1.setType('I');
        company1.setNumberOfEmployees(44110);
        company2.setId(913);
        company2.setParent(company1);
        company3.setYearFounded(1984);
        company3.setName("Champs Sports");

        // test accessor methods
        System.out.printf("\ngetName: %s\n", company3.getName());
        System.out.printf("getType: %s\n", company3.getType());
        System.out.printf("getYearFounded: %s\n", company3.getYearFounded());
        System.out.printf("getEmployees: %s\n", company3.getNumberOfEmployees());
        System.out.printf("getParent: %s\n", company3.getParent().getName());
        System.out.printf("getId: %s\n", company3.getId());

        System.out.printf("\n%s\n", company1.getDescription());
        System.out.printf("%s\n", company2.getDescription());
        System.out.printf("%s\n", company3.getDescription()); // id unknown (-1)

        //test comparison methods
        System.out.printf("\n%s is bigger than %s: %b \n", company3.getName(), company2.getName(), company1.isBigger(company2));
        System.out.printf("%s is bigger than %s: %b \n", company2.getName(), company3.getName(), company2.isBigger(company3));
        System.out.printf("%s is bigger than %s: %b \n", company1.getName(), company2.getName(), company1.isBigger(company1, company2));
        System.out.printf("%s is bigger than %s: %b \n", company3.getName(), company1.getName(), company3.isBigger(company3, company1));

    }
}
