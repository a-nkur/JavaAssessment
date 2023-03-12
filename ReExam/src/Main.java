import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Area area = new Area();
        Scanner in = new Scanner(System.in);

        System.out.print("Enter length for rectangle: ");
        double len = in.nextDouble();
        System.out.print("Enter breadth for rectangle: ");
        double bre = in.nextDouble();
        area.RectangleArea(len, bre);

        System.out.print("Enter breadth for square: ");
        double sid = in.nextDouble();
        area.SquareArea(sid);

        System.out.print("Enter breadth for circle: ");
        double rad = in.nextDouble();
        area.CircleArea(rad);
    }
}