package chap34;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double calcDistance(Point p2){
        return Math.sqrt(Math.pow(x-p2.getX(), 2) + Math.pow(y-p2.getY(), 2));
    }

}
