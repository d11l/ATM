import java.util.Random;
import java.util.Scanner;
public class ATm {
public static void main(String[] args) {
Scanner input = new Scanner(System.in); 
    
int balance = 10000, withdraw, deposit,choice; 

while(true){
System.out.println("ATM"
+"\nChoose 1 for Withdraw"
+"\nChoose 2 for Deposit"
+"\nChoose 3 for Check Balance"
+"\nChoose 4 for EXIT");
    
    
System.out.print("Choose: "); choice = input.nextInt();

switch(choice){
case 1: System.out.print("Enter money to be withdrawn:");
withdraw = input.nextInt();
if(balance >= withdraw){
balance = balance - withdraw; 
System.out.println("Please collect your money");
break;
}else{
System.out.println("Insufficient Balance\n");
System.out.println(""); break;}

case 2: System.out.print("Enter money to be deposited:");
deposit = input.nextInt();
balance = balance + deposit;
System.out.println("Your Money has been successfully depsited");
System.out.println(""); break;

case 3:
System.out.println("Balance : "+balance);
System.out.println(""); break;
case 4:System.exit(0);
}
}
}
public static void OTP(int len) { 
String numbers = "0123456789"; 
Random r = new Random(); 
char[] otp = new char[len];  
for (int i = 0; i < len; i++){
otp[i] = numbers.charAt(r.nextInt(numbers.length()));
}
System.out.print("You OTP is : "); 
System.out.println(otp);  
}
}
