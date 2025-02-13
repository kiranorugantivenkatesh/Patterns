package pattern1;
/*
    Print the following pattern for the given N number of rows
    Pattern for N = 4;
    1111
    2222
    3333
    4444

*/

public class Pattern4 {
    public static void main(String[] args) {
        printPattern3(4);

    }

    private static void printPattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
