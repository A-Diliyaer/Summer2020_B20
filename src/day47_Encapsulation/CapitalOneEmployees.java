package day47_Encapsulation;

public class CapitalOneEmployees {

    String employeeName;
    int employeeAge;
    String jobTitle;
    static final String companyName;

    private String ID;
    private double salary;
    private String address;

    static{
        companyName="Capital One";
    }

    public CapitalOneEmployees(String employeeName, int employeeAge, String jobTitle) {
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.jobTitle = jobTitle;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "CapitalOneEmployees{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeAge=" + employeeAge +
                ", jobTitle='" + jobTitle + '\'' +
                ", ID='" + ID + '\'' +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                '}';
    }
}
