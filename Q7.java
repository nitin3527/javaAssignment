import java.net.StandardSocketOptions;

public class Q7 {
    static String firstName = "Nitin";
    static String lastName = "khandelwal";
    static int age  = 23;
    static{
        System.out.println("inside static block=======================");
        System.out.println("firstName: " + firstName);
        System.out.println("lastName: " + lastName);
        System.out.println("age: " + age);
    }
    static void changeName(){
        firstName = "harry";
        lastName = "jain";
        age  = 23;
    }
    public static void main(String[] args) {
        Q7.changeName();
        System.out.println("inside main block===========================");
        System.out.println("firstName: " +Q7.firstName);
        System.out.println("lastname: " + Q7.lastName);
        System.out.println("age: " + Q7.age);
    }
}
