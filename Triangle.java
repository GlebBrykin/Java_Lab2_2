public class Triangle extends Shape
{
    private final float __a;
    private final float __b;
    private final float __c;

    public Triangle(float a, float b, float c)
    {
        this.__a = a;
        this.__b = b;
        this.__c = c;
    }

    @Override
    public float calculateArea()
    {
        float p = (this.__a + this.__b + this.__c) / 2;
        return (float)Math.sqrt(p * (p - this.__a) * (p - this.__b) * (p - this.__c));
    }

    @Override
    public float calculatePerimeter()
    {
        return this.__a + this.__b + this.__c;
    }
}
