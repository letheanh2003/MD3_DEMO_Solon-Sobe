import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner let = new Scanner(System.in);
        System.out.println("nhập vào a:");
        int a = let.nextInt();
        System.out.println("nhập vào b:");
        int b = let.nextInt();
        System.out.println("nhập vào c:");
        int c = let.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println("so lon nhat la:" + a);
            } else {
//                c<a &&  a>b
                System.out.println("so lon nhat la:" + c);
            }

        } else {
            if (b < c) { //b>a && b>c
                System.out.println("so lon nhat la:" + b);
            }else {
//c>b && b<c
                System.out.println("so lon nhat la:" + c);
            }
        }
    }
}