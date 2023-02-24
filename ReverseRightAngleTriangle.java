public class ReverseRightAngleTriangle {
    public static void printReverseRightAngleTriangle(int rows) {
        // printing pattern
        for(int row = 1; row <= rows; row++) {
            for(int column = 1; column <= rows; column++) {
                if(row+column <= rows) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}