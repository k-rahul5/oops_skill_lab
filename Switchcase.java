package skill;
import java.util.Scanner;
public class Switchcase {
public static void main(String[] args) {
  int days;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number ");
  days=sc.nextInt();
  switch(days) {
      case 1:System.out.println("Monday");break;
      case 2:System.out.println("Tuesday");break;
      case 3:System.out.println("Wednesday");break;
      case 4:System.out.println("Thrusday");break;
      default: System.out.println("Other days");break;

  }
}
}