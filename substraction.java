import java.util.Scanner;

class substraction
{
void add(int a , int b)
{
int res=a+b;
System.out.println("addition is "+res);
}

void sub(int a , int b)
{
int res1=a-b;
System.out.println("substraction is "+res1);
}

public static void main (String args[])
{
Scanner x= new Scanner(System.in);
int a = x.nextInt();
int b = x.nextInt();
System.out.println("enter number"+a);
System.out.println("enter 2nd number "+b);
substraction obj=new substraction() ;
obj.add(a,b);
obj.sub(a,b);

}
}