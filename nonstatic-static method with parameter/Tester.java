class Circle
{
void area(int r)
{
final double pi=3.142;
double result=pi*r*r;
System.out.println(result);
}
}
class Tester
{
public static void main(String[]args)
{
Circle().area(5);
}
}