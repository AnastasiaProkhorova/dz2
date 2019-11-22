import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //n1();
        //n2();
        //n3();
        n5();
    }
    public static void n1(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 2 числa:");

        int a = in.nextInt();
        int b = in.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
    public static void n2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");

        int a = in.nextInt();

        int b = in.nextInt();

        int c = in.nextInt();

        if (a == b && b == c) {
            System.out.println("No");
        } else if ((a > b && b >= c) || (c > b && b >= a)) {
            System.out.println(b);
        } else if ((b > a && a >= c) || (c > a && a >= b)) {
            System.out.println(a);
        } else if ((a > c && c >= b) || (b > c && c >= a)) {
            System.out.println(c);
        }
    }
    public static void n3() {
        int n=0;
        Scanner in = new
                Scanner(System.in);
        System.out.println("Введите число:");
        int a = in.nextInt();
        if (a==1 || a==0) {
            n=0;}
        else {
            if (a>1) {
                n=a-1;
            }
            if (a<0) {
                n=-a;
            }
        } System.out.println(n);
    }
    public static void n5() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int D = b*b-4*a*c;

        if (D>0){
            double x1 = (-b - Math.sqrt(D))/(2*a);
            double x2 = (-b + Math.sqrt(D))/(2*a);
            System.out.println("первый корень:"+x1);
            System.out.println("второй корень:"+x2);
        }
        else if(D==1){
            int x = ((-b - 1)/(2*a));
            System.out.println("корень:"+x);
        }
        else System.out.println("Дискриминант меньше нуля");
    }
}

