import java.util.Scanner;

public class general {
    // Static variable
    static String staticVar="Caleb";
    // Instance variable
    String instanceVar="nzabb";
    
    // Local variable
    public void methodWithLocalVar() {
        Scanner scanner = new Scanner(System.in);// Create a Scanner object to capture input

        System.out.print("Enter Local variable value: ");     // Capture input for local variable
        int localVar = scanner.nextInt();// Assign input to local variable
        System.out.println("The Local Variable that you have just entered is: " + localVar);
    }
    
    public void methodWithInstanceVar() {        
        System.out.println("Instance Variable: " + instanceVar);// Print the instance variable
        
    }
    
    public static void methodWithStaticVar() {
        System.out.println("Static Variable: " + staticVar);
    }
    
    public static void main(String[] args) {
        
        general mine=new general();  // Create an object of General class
        mine.methodWithLocalVar();// Call the first void method
        methodWithStaticVar();// Call the second void method
        mine.methodWithInstanceVar();// Call the third void method
        
       
    }
}
