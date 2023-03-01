import java.util.Scanner;

public class LineComputation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Co-ordinates of first line1 ");
        System.out.println("Enter the Co-ordinates of x1 and y1 : ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Enter the Co-ordinates of x2 and y2 : ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.println();
        System.out.println("Enter the Co-ordinates of second line2 ");
        System.out.println("Enter the Co-ordinates of x3 and y3 : ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        System.out.println("Enter the Co-ordinates of x4 and y4 : ");
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();
        LineComputation line = new LineComputation();
        line.compareTo(x1, x2, x3, x4, y1, y2, y3, y4);
        line.equalTo(x1, x2, x3, x4, y1, y2, y3, y4);
    }

    public void compareTo(int x1, int x2, int x3, int x4, int y1, int y2, int y3, int y4) {
        Double length1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        Double length2 = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
        System.out.println("Length of the first Line1 is : " + length1);
        System.out.println("Length of the second Line2 is : " + length2);
        System.out.println("CompareTo Method");
        if (length1.compareTo(length2) == 1) {
            System.out.println("Length of Line 1 is greater than Line 2 ");
        } else if (length1.compareTo(length2) == -1) {
            System.out.println("Length of Line 1 is less than Line 2 ");
        } else {
            System.out.println("Both lines are equal in length");
        }
    }
    public void equalTo(int x1, int x2, int x3, int x4, int y1, int y2, int y3, int y4) {
        System.out.println("equals to method");
        Double length1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        Double length2 = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
        if (length1.equals(length2)) {
            System.out.println("Both Lines are equal ");
        } else {
            System.out.println("Lines are not equal");
        }
    }
}
