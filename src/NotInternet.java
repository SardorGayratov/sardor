import java.util.Scanner;

public class NotInternet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("son kiriting: ");
         int a = sc.nextInt();
        System.out.print("son kiriting: ");
         int b = sc.nextInt();
         int x = 0;
         for (int i =a; i <= b; i+=1) {
             if (i > 0) {
                 x ++;
             }
         }
        System.out.println(x);

         System.out.print("son kiriting: ");
         int a = sc.nextInt();
        System.out.print("son kiriting: ");
         int b = sc.nextInt();
         for (int i =a; i <= b; i+=1) {
             if (i % 2 == 0 || i % 3 == 0) {
                 System.out.println(i);
             }
         }

        System.out.print("son kiriting: ");
         int a = sc.nextInt();
         int b = 1;
         for (int i =0; i < 5; i++) {
             b *= a;
         }
        System.out.println(b);

        System.out.print("son kiriting: ");
         int n = sc.nextInt();
        int sum = 0;
            for (int i =1; i < n; i++) {
                 sum = i * i;
            }
            System.out.println(sum);



        System.out.print("son kiriting: ");
        int a = sc.nextInt(); // 125
        for (int i = 10; i<=100; i++) {
            System.out.println();
        }
    }
}


