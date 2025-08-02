package skill;
import java.util.Scanner;
class Substring {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine(); 
        System.out.println(s.substring(5));         
        System.out.println(s.substring(2, 7));       
    }
}