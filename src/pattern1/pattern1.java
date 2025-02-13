package pattern1;
/*
    Print the following pattern for the given N number of rows
    Pattern for N = 4;
    4444
    4444
    4444
    4444

*/
/*
Instruction to solve any pattern problem
1. Identify no of rows.
2. identify number no of columns
3. what to print f(i, j, n)
*/

public class pattern1 {
    public static void main(String[] args) {
        printPattern(4);
    }
    public static void printPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(n);
            }
            System.out.println();
        }
    }
}
