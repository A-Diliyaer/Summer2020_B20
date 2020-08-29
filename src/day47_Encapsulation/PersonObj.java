package day47_Encapsulation;

import java.time.LocalDate;

public class PersonObj {
    public static void main(String[] args) {

        Person p1 = new Person("Aji",31,'M', LocalDate.of(1989,02,10));
        p1.setID(2414);
        p1.setSsn("12345632");
        p1.setAddress("1191 tupper dr");
        System.out.println(p1);
    }
}
