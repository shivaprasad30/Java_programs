import java.util.*;
class Fib_WO_AO {

    //Fibonacci series without using arithmetic operators
    static int add(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int a = 0, b = 1;

        System.out.print(a + " " + b + " ");

        for (int i = 2; i < n; i++) {
            int c = add(a, b); // no + used
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}