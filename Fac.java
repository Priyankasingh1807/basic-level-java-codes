import java.util.*;

public class Fac {
    public static void factorialno(int a) {
        if (a < 0) {
            System.out.println("Invalid Number");
            return;
        }
        int fact = 1;
        for (int i = a; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println(fact);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        factorialno(a);
        {
            sc.close();
        }

    }
}
