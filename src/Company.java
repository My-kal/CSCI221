/**
 * This class serves as a template for a company.
 * @author Mykal Burris
 * @since September 19, 2016
 * @version  1
 *
 */

//package prog2.csci221;

public class Company {
    private String name; // company name
    private char type; // I: International O: Overseas D: Domestic
    private int year; // year company was founded
    private int numOfEmployees; // number of employees
    private int id = -1; // company id
    private Company parent; // company that owns company
    private static int numOfCompanies = 0;
    private static int numOfDomesticCompanies = 0;
    private static int numOfInternationalCompanies = 0;
    private static int numOfOverseasCompanies = 0;


    public Company (String name, int year, int employees, char type) {
        this(name, type, null, year, employees, -1);
    }

    /**
     * @param name, company's name
     * @param year, year company was founded
     * @param employees, number of employees at said company
     * @param type, company type ('I', 'O', 'D')
     * @param id, company id
     * post condition: company instance is constructed
     */

     public Company (String name, char type, Company parent, int year, int employees, int id){
         setName(name);
         setYearFounded(year);
         setId(id);
         setType(type);
         setNumberOfEmployees(employees);
         setParent(parent);

//        this.name = name;
//        this.year = year;
//        this.type = type;
//        this.parent = parent;
//        this.id = id;
//        numOfEmployees = employees;

        numOfCompanies++;

        if (this.type == 'D') {
            numOfDomesticCompanies++;
        }else if (this.type == 'I'){
            numOfInternationalCompanies++;
        }else{
            numOfOverseasCompanies++;
        }
    }


    // Accessor Methods
    /**
     * precondition: name is not null
     * @return company name
     */
    public String getName(){
        assert (name != null);
        return name;
    }

    /**
     * precondition: type is 'D', 'I', or 'O'
     * @return company type
     */
    public char getType(){
        assert (type == 'D' || type == 'I' || type == 'O');
        return type;
    }

    /**
     * precondition: year is greater than 0
     * @return year company was founded
     */

    public int getYearFounded(){
        assert (year > 0);
        return year;
    }

    /**
     * precondition: number of employees is not less than 0
     * @return number of employees at company
     */
    public int getNumberOfEmployees() {
        assert (numOfEmployees > 0);
        return numOfEmployees;
    }

    /**
     * precondition: parent is not null
     * @return parent company
     */

    public Company getParent(){
        assert (parent != null);
        return parent;
    }

    /**
     * precondition: year is not less than 0
     * @return company id
     */
    public int getId() {
        assert (id >= 0);
        return id;
    }

    // Mutator Methods

    /**
     * precondition: name is not null
     * @return null
     */
    public void setName(String s){
        assert (s != null);
        name = s;
    }

    /**
     * precondition: type is 'D', 'I', or 'O'
     * @return null
     */

    public void setType(char t){
        assert (t == 'D' || t == 'I' || t == 'O');
        type = t;

    }

    /**
     * precondition: year is greater than 0
     * @return null
     */
    public void setYearFounded(int y){
        assert (y > 0);
        year = y;
    }

    /**
     * precondition: number of employees is not less than 0
     * @return null
     */
    public void setNumberOfEmployees(int e){
        assert (e > 0);
        numOfEmployees = e;
    }

    /**
     * precondition: parent is not null
     * @return null
     */
    public void setParent(Company p){
        assert (parent != null);
        parent = p;
    }

    /**
     * precondition: year is not less than 0
     * @return null
     */
    public void setId(int i){
        assert (id >= 0);
        id = i;
    }

    /**
     * precondition: c is not null
     * @return true if c has more employees than company, false if not
     */
    // Comparison Methods
    public boolean isBigger(Company c) {
        assert (c != null);
        boolean result = false;
        if (numOfEmployees > c.numOfEmployees) {
                result = true;
            }
            return result;
    }


    /**
     * precondition: company1 is not null, company2 is not null
     * @return true if company1 is has more employees than company2, false if not
     */
    public static boolean isBigger(Company c1, Company c2) {
        assert (c1 != null && c2 != null);
        boolean result;
        if (c1.numOfEmployees > c2.numOfEmployees) {
                result = true;
            }else{
                result = false;
            }
            return result;
    }

    /**
     * precondition: a company instance exists
     * @return string describing the company
     */
    public String getDescription() {
        if (id != -1) {
            return String.format("%c company %s. Id %d. Founded %d. Has %d employees.", type, name, id, year, numOfEmployees);
        } else {
            return String.format("%c company %s. Founded %d. Has %d employees.", type, name, year, numOfEmployees);
        }
    }

    /**
     * precondition: None
     * @return number of international companies that exist
     */
    public static int numberOfInternationalCompanies(){
        return numOfInternationalCompanies;
    }

    /**
     * precondition: None
     * @return number of domestic companies that exist
     */
    public static int numberOfDomesticCompanies(){
        return numOfDomesticCompanies;

    }

    /**
     * precondition: None
     * @return number of overseas companies that exist
     */
    public static int numberOfOverseasCompanies(){
        return numOfOverseasCompanies;

    }

    /**
     * precondition: None
     * @return number of companies that exist
     */
    public static int numberOfCompanies(){
        return numOfCompanies;
    }

    /**
     * precondition: c is an existing company
     */
    Company (Company c){
        name = c.name;
        year = c.year;
        type = c.type;
        parent = c.parent;
        id = c.id;
        numOfEmployees = c.numOfEmployees;

        numOfCompanies++;

        if (id == 'D') {
            numOfDomesticCompanies++;
        }else if (id == 'I'){
            numOfInternationalCompanies++;
        }else{
            numOfOverseasCompanies++;
        }
    }

    /**
     * precondition: c is an existing company
     * @return true if this company has same data as company c else false
     */
    public boolean equals(Company c){
        return name.equals(c.name) &&
                type == c.type &&
                id == c.id &&
                year == c.year &&
                parent == c.parent &&
                numOfEmployees == c.numOfEmployees;
    }

    /**
     * precondition: c is an existing company
     * @return true if this company has same ID as company c else false
     */
    public boolean equalsID(Company c){
        if (id == c.id){
            return true;
        }else{
            return false;
        }
    }

    /**
     * precondition: c is an existing company
     * @return true if this company has same name as company c else false
     */
    public boolean equalsName(Company c){
        if (name.equals(c.name)){
            return true;
        }else{
            return false;
        }
    }

    /**
     * precondition: None
     * post condition: company instance is constructed0
     * @return new object that is a copy of this company
     */
    public static Company copy(Company c) {
        return new Company(c);
    }

    public static void main(String[] args) {
        Company company1 = new Company("IBM", 1911, 1, 'O');
        Company company2 = new Company("Google", 1998, 50000, 'D');
        Company company3 = new Company("Microsoft", 'I',        company2, 2005, 800, -1);
        Company company4 = copy(company1);

        System.out.printf("Company 1: %s\n", company1.getName());
        System.out.printf("Company 2: %s\n", company2.getName());
        System.out.printf("Company 3: %s\n", company3.getName());

        // test mutator methods
        company1.setId(407);
        company1.setNumberOfEmployees(379592);
        company2.setId(913);
        company2.setParent(company1);
        company3.setYearFounded(1984);
        company3.setName("Youtube");

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
        System.out.printf("\n%s is bigger than %s: %b \n", company3.getName(), company2.getName(), company3.isBigger(company2));
        System.out.printf("%s is bigger than %s: %b \n", company2.getName(), company3.getName(), company2.isBigger(company3));
        System.out.printf("%s is bigger than %s: %b \n", company1.getName(), company2.getName(), isBigger(company1, company2));
        System.out.printf("%s is bigger than %s: %b \n", company3.getName(), company1.getName(), isBigger(company3, company1));

        System.out.printf("\nThere are %s companies:", numberOfCompanies());
        System.out.printf(" %s domestic", numberOfDomesticCompanies());
        System.out.printf(", %s international", numberOfInternationalCompanies());
        System.out.printf(", and %s overseas.\n", numberOfOverseasCompanies());

        System.out.printf("\n%s is equal to %s: %b \n", company3.getName(), company2.getName(), company3.equals(company2));
        System.out.printf("%s is equal to %s: %b \n", company1.getName(), company4.getName(), company1.equals(company4));

        System.out.printf("\n%s has the same name as %s: %b \n", company2.getName(), company1.getName(), company2.equalsName(company1));
        System.out.printf("%s has the same name as %s: %b \n", company3.getName(), company3.getName(), company3.equalsName(company3));

        System.out.printf("\n%s has the same id as %s: %b \n", company1.getName(), company3.getName(), company1.equalsID(company3));
        System.out.printf("%s has the same id as %s: %b \n", company2.getName(), company2.getName(), company2.equalsID(company2));

    }
}
