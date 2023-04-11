import java.util.*;
class Bank
{
int accno,inbal;
Bank(int ac,int bal)
{
accno=ac;
inbal=bal;
}
void Deposit()
{
int debal;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the amount to be deposited:");
debal=sc.nextInt();
inbal=inbal+debal;
}

void Withdraw(){
int wbal;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the amount to be withdraw:");
wbal=sc.nextInt();
inbal=inbal-wbal;
}

void Display()
{
System.out.println("Initial balance is "+inbal);
}

}


class Banking
{
public static void main(String args[])
{
int op;
Bank b=new Bank(1000,100);
while(true)
{
System.out.println("1.Initial amount");
System.out.println("2.Deposit");
System.out.println("3.Withdraw");
System.out.println("4.Exit");
Scanner sc=new Scanner(System.in);
System.out.println("Please enter your transaction:");
op=sc.nextInt();

switch(op)
{
case 1:b.Display();
break;
case 2:b.Deposit();
break;
case 3:b.Withdraw();
break;
case 4:System.exit(0);
break;
}
}
}
}