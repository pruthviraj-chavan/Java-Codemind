class Employee
{
  int emp_id;
  String emp_name;
  MyDate date;   //MyDate is a class having date, month and year

  void Employee.Emp()
  {
    int emp_id=0;
    emp_name="abc";
    date=new MyDate();
  }

  void Employee.Emp(int id, String name, MyDate d)
  {
    emp_id=id;
    emp_name=name;
    date=d;
  }

public static void main(String args[])
{
  Emp e1=new Emp();
  Emp e2=new Emp(123,"java", new MyDate(23,5,2012));
//to execute this,one needs to write MyDate class
}
}