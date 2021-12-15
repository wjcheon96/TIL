import java.util.Scanner;

public class BOJ_2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String num[];
        num = sc.next().split("");
        int x = Integer.parseInt(num[0]);
        int y = Integer.parseInt(num[1]);
        int z = Integer.parseInt(num[2]);

        System.out.println(a*z);
        System.out.println(a*y);
        System.out.println(a*x);
        System.out.println(a*x*100 + a*y*10 + a*z);



    }
}
