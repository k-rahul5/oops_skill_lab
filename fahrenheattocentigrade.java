package skill;
import java.util.Scanner;
public class fahrenheattocentigrade {

  public static void main(String[] args) {
    float f;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the degree ");
    f=sc.nextFloat();
    float c=(f-32)*5/9;
    System.out.println("Celsius:"+c);
  }

}