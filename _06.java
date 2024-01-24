class Student
{
public static void main(String args[])
{
String name="anil";
int roll=36;
int m1=91,m2=77,m3=87,m4=72,m5=94,m6=87;
double fee=50000;
int total=m1+m2+m3+m4+m5+m6;
int max=600;
double percentage=(total/600.0)*100;
if(percentage>80)
{
double x=(25.0/100)*fee;
double finalfee=fee-x;
System.out.println("final fee="+finalfee);
}
else
{
double y=(10.0/100)*fee;
double finalfee2=fee-y;
System.out.println("final fee2="+finalfee2);
}
}
}