package self.codechef.java.beginner;

import java.util.Scanner;

/**
 * Link to problem - https://www.codechef.com/problems/HS08TEST
 */
public class ATM {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double y = sc.nextDouble();
        double balance;
        if ((x % 5 == 0) && (y >= x + 0.5)) {
            balance = y - x - 0.5;
            System.out.print(balance);
        } else
            System.out.print(y);

    }

}
