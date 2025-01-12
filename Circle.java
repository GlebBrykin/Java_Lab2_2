public class Circle extends Shape
{
    private final float __diameter;

    public Circle(float diameter)
    {
        this.__diameter = diameter;
    }

    @Override
    public float calculateArea()
    {
        return (float)(Math.PI / 4 * this.__diameter * this.__diameter);
    }

    @Override
    public float calculatePerimeter()
    {
        return (float)(Math.PI * this.__diameter);
    }
}
