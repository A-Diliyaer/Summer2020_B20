package day47_Encapsulation;

public class Credentials {

    public String name;
    public int age;
    public static final String companyName;

    private String userName;
    private String password;

    static{
        companyName="Capital One";
    }

    public Credentials(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCompanyName(){
        return companyName;
    }


    @Override
    public String toString() {
        return "Credentials{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
