public class Main
{
    public static void main(String[] args)
    {
        System.out.println("********************");
        System.out.println("Задача 1");
        System.out.println("********************");
        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(10, 20);
        Triangle triangle = new Triangle(10, 20, 20);
        System.out.println("Circle: S = " + circle.calculateArea() + ", P = " + circle.calculatePerimeter());
        System.out.println("Rectangle: S = " + rectangle.calculateArea() + ", P = " + rectangle.calculatePerimeter());
        System.out.println("Triangle: S = " + triangle.calculateArea() + ", P = " + triangle.calculatePerimeter());

        System.out.println("********************");
        System.out.println("Задача 2");
        System.out.println("********************");
        Employee[] employees = new Employee[]
        {
            new Manager("Sergey", 1000),
            new Worker("Maksim", 900),
            new Worker("Mariya", 950),
            new Worker("Nikita", 1100)
        };
        for(Employee e : employees)
        {
            System.out.println(e);
        }
    }
}