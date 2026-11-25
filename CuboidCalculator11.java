import java.util.Scanner;

public class CuboidCalculator11 {
    
    static int calculateArea(int length, int width) {
        int area = length * width;
        return area;
    }

    static int calculateVolume(int height, int a, int b) {
        int volume = calculateArea(a, b) * height;
        return volume;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length, width, height, area, volume;

        System.out.println("Enter the length");
        length = input.nextInt();

        System.out.println("Enter the width");
        width = input.nextInt();

        System.out.println("Enter the height");
        height = input.nextInt();

        area = calculateArea(length, width);
        System.out.println("The area of the rectangle is " + area);
        volume = calculateVolume(height, area, width);
        System.out.println("The volume of the cuboid is " + volume);

        input.close();

    }
}
