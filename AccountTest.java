import java.util.Scanner;
public class AccountTest{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
Account myAccount = new Account();


System.out.printf("initial name is: %s%n%n", myAccount.getName());

System.out.println("enter a name");
String theName = input.nextLine();

myAccount.setName(theName);

System.out.printf("the name in myAccountis: %s%n", myAccount.getName());

}


}