package pattern1;
/*
    Print the following pattern for the given N number of rows
    Pattern for N = 4;
    1234
    1234
    1234
    1234

    if we change the input to 5 it changes to the following way
    12345
    12345
    12345
    12345
    12345
*/

public class pattern3 {
    public static void main(String[] args) {
        printPattern2(4); // change the input and the output changes accordingly.
    }
    public static void printPattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
