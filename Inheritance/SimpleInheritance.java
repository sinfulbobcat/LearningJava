import java.util.Scanner;

/*A super class Bank has been defined to store the details of a customer. Define a sub-class
Account that enables transactions for the customer with the bank. The details of both the
classes are given below:
Class name : Bank
Data member/instance variable:
name : stores the name of the customer
accno : stores the account number
p : stores the principal amount in decimals
Member functions/methods:
Bank(…) : parameterized constructor to assign values to the instance variables
void display( ) : displays the details of the customer
Class name: Account
Data member/instance variable:
amt : stores the transaction amount in decimals
Member functions/methods:
Account(…) : parameterized constructor to assign values to the instance variables of both the classes
void deposit( ) : accepts the amount and updates the principal as p=p + amt
void withdraw( ) : accepts the amount and updates the principal as p=p-amt
If the withdrawal amount is more than the principal amount, then display the message
“INSUFFICIENT BALANCE”. If the principal amount after withdrawal is less than 500, then a penalty is imposed by using the formula p=p-(500-p)/10
void display( ) : displays the details of the customer
Assume that the super class Bank has been defined. Using the concept of Inheritance,
specify the class Account giving details of the constructor(…), void deposit( ),
void withdraw( ) and void display( ). The super class and the main function need not be written */


public class SimpleInheritance { //Bank

    String name;
    long accno;
    int p;

    SimpleInheritance(String input, long num, int pr){
        name = input;
        accno = num;
        p = pr;
    }
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter name");
        String name2 = x.next();

    }
}
