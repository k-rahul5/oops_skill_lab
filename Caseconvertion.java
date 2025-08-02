package skill;
import java.util.Scanner;
class Caseconversion {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine(); 
        System.out.println(s.toUpperCase());   
        System.out.println(s.toLowerCase());   
    }
}