class Square
{
static int area(int r)
{

int result=r*r;
return result;
}
}
class Testerr
{
public static void main(String[]args)
{
double x=Square.area(5);
System.out.println(x);
}
}
