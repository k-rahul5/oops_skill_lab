package skill;
import java.util.Scanner;
class StringComparison {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String a = sc.nextLine();
        
        System.out.print("Enter a string: ");
        String b = sc.nextLine();
        
        System.out.println(a.equals(b));             
        System.out.println(a.equalsIgnoreCase(b));   
        System.out.println(a.compareTo(b));          
    }
}