import org.apache.log4j.Logger;

public class Rectangle {
    int a;
    int b;
    private Logger logger =  Logger.getLogger(Rectangle.class);
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) o;
        return getA() == rectangle.getA() &&
                getB() == rectangle.getB();
    }

    @Override
    public int hashCode() {
        return a*b + a+b;
    }

    public int getArea()
    {
       int res = a*b;
    logger.info("getArea = " + res);
       return res;
    }

    public int getP()
    {
        return (a+b)*2;
    }
}
