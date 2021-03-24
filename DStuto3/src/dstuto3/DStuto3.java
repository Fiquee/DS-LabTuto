package dstuto3;

public class DStuto3 {

    public static void main(String[] args) {
        //Question 1a(min in array)
//        int[] num = {2,3,5,6,1,8};
//        int size = num.length;
//        System.out.println(min(num,size));

        //Question 1b (sum from array)
//        int[] num = {1,2,3};
//        System.out.println(sum(num,num.length-1));

        //Question 1c (greatest common divisor)
//        int x = 2;
//        int y = 10;
//        System.out.println(GCD(x,y));

        //Question 1d (convert decimal to binary)
//        int a = 4;
//        convert(a);
//        System.out.println();

        //Question 1e (sum of the first n cubes)
//        double a = 5;
//        System.out.println(Cubes(a));


        //Question 2
//        int a=3,b=4,c=2,d=5;
//        System.out.println(Acker(a,b));
//        System.out.println(Acker(c,d));


        //Question 3
//        writeLine('$', 10);
//        writeBlock('$', 3, 5);
        

        //Question 4
        

    }

    public static void writeLine(char a, int b) {
        if (b == 0) {
        } else {
            writeLine(a, b - 1);
            System.out.print(a);
        }
    }

    public static void writeBlock(char a, int b, int c) {
        if (c == 0) {
        } else {
            writeLine(a,b);
            System.out.println();
            writeBlock(a,b,c-1);
        }
    }

    public static int Acker(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (n == 0) {
            return Acker(m - 1, 1);
        } else {
            return Acker(m - 1, Acker(m, n - 1));
        }
    }

    public static double Cubes(double a) {
        if (a == 0) {
            return 0;
        } else if (a == 1.0) {
            return 1.0;
        } else {
            return Math.pow(a, 3) + Cubes(a - 1);
        }
    }

    public static void convert(int a) {
        if (a == 0) {

        } else {
            convert(a / 2);
            System.out.print(a % 2);
        }
    }

    public static int GCD(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return GCD(y, x % y);
        }
    }

    public static int min(int[] a, int size) {
        int m = 0;
        if (size > 1) {
            m = Math.min(a[size - 1], min(a, size - 1));
        } else {
            m = a[0];
            return m;
        }
        return m;
    }

    public static int sum(int[] a, int index) {
        int sum = 0;
        if (index == 0) {
            sum = a[0];
        } else {
            sum = a[index] + sum(a, index - 1);
        }
        return sum;
    }
}
