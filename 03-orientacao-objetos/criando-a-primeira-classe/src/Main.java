import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Person person = new Person("João", 21);
        Person personFemale = new Person("Maria", 22);
        System.out.println("Male name: " + person.getName());
        System.out.println("Male age: " + person.getAge());
        System.out.println("Female name: " + personFemale.getName());
        System.out.println("Female age: " + personFemale.getAge());
    }
}
