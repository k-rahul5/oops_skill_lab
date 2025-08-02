package skill;
import java.util.Scanner;
class Searchindex {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine(); 
        System.out.println(s.indexOf(" "));        
        System.out.println(s.lastIndexOf("h"));    
        System.out.println(s.contains("world"));     
    }
}