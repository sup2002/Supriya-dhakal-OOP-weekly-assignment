import java.util.Scanner;

public class PersonalDetailsProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        
        System.out.println("Enter your address:");
        String address = scanner.nextLine();
        
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        
        System.out.println("Enter your phone number:");
        String phoneNumber = scanner.next();
        
        System.out.println("\nPersonal Details:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        
        scanner.close();
    }
}
