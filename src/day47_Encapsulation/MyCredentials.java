package day47_Encapsulation;

public class MyCredentials {
    public static void main(String[] args) {
        Credentials c1 = new Credentials("Aji",31);
        c1.setUserName("Cybertek");
        c1.setPassword("batch20");

        System.out.println(c1);

        CapitalOneEmployees e1 = new CapitalOneEmployees("Dilyar",32,"SDET");
        e1.setAddress("1191 tupper dr, Milton, ON CA");
        e1.setID("2414");
        e1.setSalary(97000);

        System.out.println(e1);

    }
}
