public class boxTester
{
    public boxTester()
    {
    }

    public static void main(String [] args)
    {
        Box b = new Box();
        System.out.println("b= " + b);
        System.out.println("Area of b " + b.getArea());
        Box c = new Box(2,3,4,true);
        System.out.println("c = " + c);
        System.out.println("Area of c " + c.getArea());
    }
}
