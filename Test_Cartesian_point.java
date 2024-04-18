import java.lang.Math;

class Cartesian_point
{
    private double x,y;

    public Cartesian_point(double a,double b)
    {
        x=a;
        y=b;
    }

    public Cartesian_point(double a)
    {
        x=a;
        y=a;
    }

    double getX()
    {
        return x;
    }

    double getY()
    {
        return y;
    }

    void move(double a,double b)
    {
        x=a;
        y=b;
    }


    void move(double a)
    {
        x=a;
        y=a;
    }


    void display()
    {
        System.out.println("X = "+x);
        System.out.println("Y = "+y);
    }



}

class Triangle
{
    double area,sideA,sideB,sideC,perimeter,semiP;
    Cartesian_point x,y,z;


    public Triangle(Cartesian_point x,Cartesian_point y,Cartesian_point z)
    {
        this.x=x;
        this.y=y;
        this.z=z;

    }

    void get_dimensions()
    {
        sideA = Math.sqrt(Math.pow(x.getX()-y.getX(),2)+Math.pow(x.getY()-y.getY(),2));
        sideB = Math.sqrt(Math.pow(y.getX()-z.getX(),2)+Math.pow(y.getY()-z.getY(),2));
        sideC = Math.sqrt(Math.pow(x.getX()-z.getX(),2)+Math.pow(x.getY()-z.getY(),2));


        perimeter = sideA+sideB+sideC;

        semiP = perimeter/2;

        area=Math.sqrt(semiP*(semiP-sideA)*(semiP-sideB)*(semiP-sideC));



        System.out.println("Area of the triangle is "+area);

        System.out.println("Perimeter of the triangle is "+perimeter);


    }
}

public class Test_Cartesian_point
{
    public static void main(String args[])
    {
        Cartesian_point cp1 = new Cartesian_point(1,4);
        Cartesian_point cp2 = new Cartesian_point(3);
        Cartesian_point cp3 = new Cartesian_point(1,2);

        Triangle t1 = new Triangle(cp1,cp2,cp3);
        t1.get_dimensions();

    }
}