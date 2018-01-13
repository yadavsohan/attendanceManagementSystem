pacakage services.drawable;
        ting 3. Circle implementing the Drawable interface


class Circle implements Drawable
{
    private double x, y, radius;
    Circle(double x, double y, double radius)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    @Override
    public void draw(int color)
    {
        System.out.println("Circle drawn at (" + x + ", " + y +
                "), with radius " + radius + ", and color " + color);
    }
    double getRadius()
    {
        return radius;
    }
    double getX()
    {
        return x;
    }
    double getY()
    {
        return y;
    }
}