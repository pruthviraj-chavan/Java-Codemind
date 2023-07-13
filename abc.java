
class adds
{
int a=10,b=20, res=0;

public void add()
{
int res=a+b;
System.out.println("addition is =" +res);
}
public void sub()
{
int res=a-b;
System.out.println("substraction is ="+res);
}

public void division()
{
int res=b/a;
System.out.println("division is ="+res);
}

public void multiplication()
{
int res=a*b;
System.out.println("multiplication is ="+res);
}
}

class abc
{
public static void main(String[] arg)
{
	
	
adds result=new adds();
result.add();

adds r2=new adds();
r2.sub();

adds r3=new adds();
r3.division();

adds r4=new adds();
r4.multiplication();

}
}