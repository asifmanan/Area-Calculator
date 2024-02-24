public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(5));
        System.out.println(area(-5));
        System.out.println(area(5,2));
        System.out.println(area(20.75));
    }

    public static double area(double radius){
        if (radius < 0 ) return -1;
        double pi = 3.141592653589793;
        return (pi * (area(radius,radius)));
    }

    public static double area(double a, double b){
        if(a < 0 || b < 0) return -1;
        return a*b;
    }
}
