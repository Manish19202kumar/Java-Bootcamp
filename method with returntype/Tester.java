class Circle
{
static double area(int r)
{
final double pi=3.142;
double result=pi*r*r;
return result;
}
}
class Tester
{
public static void main(String[]args)
{
double x=Circle.area(5);
System.out.println(x);
}
}
