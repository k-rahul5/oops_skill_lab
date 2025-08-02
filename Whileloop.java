package skill;
import java.util.Scanner;
public class Whileloop {
public static void main(String[] args) {
  int i;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number ");
  i=sc.nextInt();
while(i<=55)
{
	System.out.println("count="+i);
	i++;
}
}
}