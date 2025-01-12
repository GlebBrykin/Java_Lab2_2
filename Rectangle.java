public class Rectangle extends Shape
{
    private final float __height;
    private final float __width;

    public Rectangle(float height, float width)
    {
        this.__height = height;
        this.__width = width;
    }

    @Override
    public float calculateArea()
    {
        return this.__height * this.__width;
    }

    @Override
    public float calculatePerimeter()
    {
        return 2 * (this.__height + this.__width);
    }
}
