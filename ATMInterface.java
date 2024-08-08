import java.util.Scanner;
class ATM{
    float Balance;
    int pin = 9685;
void checkPin(){
    System.out.println("enter pin:");
    Scanner s = new Scanner(System.in);
    int enteredPin = s.nextInt();
    if(enteredPin == pin){
        menu();
    }
    else{
        System.out.println("invalid pin");
    }
}
void menu(){
    System.out.println("Enter your choice:");
    System.out.println("1. Check AC balance ");
    System.out.println("2. Withdraw Money ");
    System.out.println("3. Deposit Money");
    System.out.println("4. Exit");

    Scanner sc = new Scanner(System.in);
    int opt = sc.nextInt();
    if(opt == 1){
        checkBalance();
    }else if(opt==2){
        withdrawMoney();
    }else if(opt == 3){
        depositMoney();
    }else if(opt == 4){
    return;
    }else{
        System.out.println("enter valid choice");
    }
}
void checkBalance(){
    System.out.println("balance = "+ Balance);
    menu();
}
void withdrawMoney(){
    System.out.println("enter amount to withdraw");
    Scanner sc = new Scanner(System.in);
    int amount = sc.nextInt();
    if(amount>Balance){
        System.out.println("Insufficient balance");
    }else{
        Balance = Balance - amount;
        System.out.println("money withdrawn successfully");
    }
    menu();
}
void depositMoney(){
    System.out.println("enter money");
    Scanner sc = new Scanner(System.in);
    float amount = sc.nextInt();
    Balance = Balance + amount;
    System.out.println("money depositwed successfully");
}

}
public class ATMInterface{
    public static void main(String args[]){
        ATM obj = new ATM();
        obj.checkPin();
    }
}