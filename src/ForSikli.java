import java.util.Scanner;

public class ForSikli {
    public static void main(String[] args) {
        int a = 2, b = 8;
        int sum = 0;
        for (int i = a; i < b; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        {
            int y = 4, x = 15;
            int count = 0;
            for (int i = a; i < b; i++) {
                if (i % 2 == 0) {
                    count++;
                }
            }
            System.out.println(count);
            {
                int e = 18, f = 27;
                int sanoq = 0;
                int natur = 0;
                for (int i = e; i < f; i++) {
                    if (i % 3 == 0) {
                        sanoq++;
                        natur = natur + i;
                    }
                }
                System.out.println(sanoq);
            }
        }
    }
}
