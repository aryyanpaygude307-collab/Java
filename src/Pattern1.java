public class Pattern1 {
    public static void main(String[] args) {
        int rows = 4;
        for (int i = 1; i <= rows; i++) {           // outer loop → controls rows
            for (int j = 1; j <= i; j++) {           // inner loop → runs "i" times (depends on current row!)
                System.out.print("*");
            }
            System.out.println();                    // move to next line after finishing a row
        }
    }
}
