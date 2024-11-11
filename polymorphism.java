abstract class Shape
{
    public abstract void numberofsides();
}
class Rectangle extends Shape
{
    public void numberofsides()
    {
        System.out.println("Number of sides of Rectangle= 4");
    }
}
class Triangle extends Shape
{
    public void numberofsides()
    {
        System.out.println("Number of sides of Triangle= 3");
    }
}
class Hexagon extends Shape
{
    public void numberofsides()
    {
        System.out.println("Number of sides of Hexagon= 6");
    }
}
class main
{
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        Triangle t=new Triangle();
        Hexagon h=new Hexagon();
        r.numberofsides();
        t.numberofsides();
        h.numberofsides();
    }
}