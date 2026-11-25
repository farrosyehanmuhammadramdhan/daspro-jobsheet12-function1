import java.util.Scanner;

public class CuboidCalculator11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length, width, height, area, volume;

        System.out.println("Enter the length");
        length = input.nextInt();

        System.out.println("Enter the width");
        width = input.nextInt();

        System.out.println("Enter the height");
        height = input.nextInt();

        area = length * width;
        System.out.println("The area of the rectangle is " + area);
        volume = length * width * height;
        System.out.println("The volume of the cuboid is " + volume);

        input.close();

    }
}
