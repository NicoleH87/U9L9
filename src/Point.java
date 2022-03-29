/*public class Point {
    private int x;
    private int y;
    private String label;

    public Point (String l, int xp, int yp)
    {
        x = xp;
        y = yp;
        label = l;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public String getLabel()
    {
        return label;
    }

    @Override
    public String toString() {
        return "Point " + label + " is at " + "x = " + x + ", y = " + y;
    }

    @Override
    public boolean equals(Object random) {
        if (random == null || !(random instanceof Point))
        {
            return false;
        }

        Point objPoint = (Point) random;

        return (this.getX() == objPoint.getX()) && (this.getY() == objPoint.getY());
    }
}*/

public class Point {
    private int x;
    private int y;
    private String label;

    public Point (String l, int xp, int yp)
    {
        x = xp;
        y = yp;
        label = l;
    }

    @Override
    public String toString() {
        return "Point " + label + " is at " + "x = " + x + " y = " + y;
    }

    @Override
    public boolean equals(Object random) {
        if (random == null || !(random instanceof Point))
        {
            return false;
        }

        Point objPoint = (Point) random;

        return (this.x == objPoint.x) && (this.y == objPoint.y);
    }
}
