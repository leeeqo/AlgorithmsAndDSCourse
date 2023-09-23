package union_find;

import java.util.Scanner;

public class Tink2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        if ((n & (n - 1)) == 0)
            System.out.println((int) Math.log(n));
        else
            System.out.println(Math.ceil(Math.log(n)));
    }
}
