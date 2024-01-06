import java.util.*;
import java.lang.*;

public class Forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Forloop obj = new Forloop();
        System.out.print("Enter question number:");
        int inp = sc.nextInt();
        switch (inp) {
            case 1:
                for (int i = 1; i <= 10; i++)
                    System.out.println(i + ' ');
                break;
            case 2: {
                int sum = 0;
                for (int i = 1; i <= 10; i++)
                    sum += i;

                System.out.println(sum);

                break;
            }
            case 3: {
                int sum = 0;
                int n = sc.nextInt();
                for (int i = 1; i <= n; i++) {
                    sum += i;
                    System.out.println(i + ' ');
                }
                System.out.println("The sum of " + n + " natural numbers:" + sum);

                break;
            }
            case 4: {
                int sum = 0;
                float avg = 0.0f;
                for (int i = 0; i < 10; i++) {
                    System.out.println("Number-" + (i + 1));
                    int j = sc.nextInt();
                    sum += j;

                }
                avg = sum;
                System.out.println("The sum of 10 no is : " + sum);
                System.out.println(String.format("The Average is : %.6f", (avg / 10)));

                break;
            }
            case 5: {
                System.out.print("Enter the number:");
                int n = sc.nextInt();
                for (int i = 1; i <= n; i++) {
                    System.out.println(String.format("Number is : %d and cube of the %d is :", i, i * i * i));
                }

                break;
            }
            case 6: {
                System.out.print("Enter the number for table:");
                int n = sc.nextInt();
                for (int i = 1; i <= 10; i++) {
                    System.out.println(String.format("%3d  X  %-2d = %-3d", n, i, i * n));
                }

                break;
            }
            case 7: {
                System.out.print("Enter the number for table:");
                int n = sc.nextInt();
                for (int j = 1; j <= 10; j++) {
                    for (int i = 1; i <= n; i++) {
                        System.out.print(String.format("%d X %d = %d", i, j, i * j) + ',');
                    }
                }
            }

                break;
            case 8: {
                int sum = 0;
                System.out.print("Enter the number:");
                int n = sc.nextInt();
                System.out.print("The odd numbers are :");
                for (int i = 1; i <= n; i++) {
                    if (i % 2 != 0) {
                        sum += i;
                        System.out.print(i + ' ');
                    }
                }
                System.out.println("The Sum of odd Natural Number upto 10 terms : " + sum);

                break;
            }
            case 9: {
                System.out.print("Enter the number of rows:");
                int n = sc.nextInt();
                for (int i = 1; i <= n; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");

                    }
                    System.out.println();

                }

                break;
            }

            case 10:

            {
                System.out.print("Enter the number of rows:");
                int n = sc.nextInt();
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j < i + 1; j++) {
                        System.out.print(j);

                    }
                    System.out.println();

                }
                break;
            }
            case 11:

            {
                System.out.print("Enter the number of rows:");
                int n = sc.nextInt();
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j < i + 1; j++) {
                        System.out.print(i);

                    }
                    System.out.println();

                }
                break;
            }
            case 12:

            {
                int m = 1;
                System.out.print("Enter the number of rows:");
                int n = sc.nextInt();
                for (int i = 1; i <= n; i++) {

                    for (int j = 1; j < i + 1; j++) {
                        System.out.print(m++ + " ");

                    }
                    System.out.println();

                }
                break;
            }
            case 13:

            {
                int m = 1;
                System.out.print("Enter the number of rows:");
                int n = sc.nextInt();
                for (int i = 1; i <= n; i++) {

                    for (int j = 1; j <= n - i; j++) {
                        System.out.print(" ");

                    }

                    for (int j = 1; j <= i; j++) {
                        System.out.print(m++ + " ");

                    }
                    System.out.println();

                }
                break;
            }
            case 14:

            {
                System.out.print("Enter the number of rows:");
                int n = sc.nextInt();
                for (int i = 1; i <= n; i++) {

                    for (int j = 1; j <= n - i; j++) {
                        System.out.print(" ");

                    }

                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");

                    }
                    System.out.println();

                }
                break;
            }
            case 15:

            {
                int fact = 1;
                System.out.print("Enter the number:");
                int n = sc.nextInt();

                for (int i = 1; i <= n; i++) {
                    fact *= i;
                }
                System.out.println("The Factorial of 5 is: " + fact);
                break;
            }
            case 16:

            {
                int fact = 0;
                System.out.print("Enter the number:");
                int n = sc.nextInt();
                System.out.print("The even numbers are :");
                for (int i = 2; i <= n + 1; fact += i * 2 - 2, System.out.print(i * 2 - 2 + " "), i++) {
                }
                System.out.println("\nThe Sum of even Natural Number upto " + n + " terms : " + fact);
                break;
            }
            case 17:

            {
                System.out.print("Enter the number of rows:");
                int n = sc.nextInt();
                for (int i = 1; i <= n; i++) {

                    for (int j = 1; j <= n - i; j++) {
                        System.out.print(" ");

                    }

                    for (int j = 1; j <= i; j++) {
                        System.out.print(i + " ");

                    }
                    System.out.println();

                }
                break;
            }
            case 18:

            {
                double t = 1.0;
                double series = 0.0;
                System.out.print("Enter the value of x:");
                double x = sc.nextInt();
                System.out.print("Enter the number of terms:");
                double n = sc.nextInt();

                for (int i = 0; i < n; i++) {
                    if (i % 2 != 0) {
                        for (int j = 1; j <= i * 2; j++)
                            t *= j;
                        series = series - (Math.pow(x, i * 2) / t);
                        t = 1.0;
                        // System.out.println(series);
                    } else {
                        for (int j = 1; j <= i * 2; j++)
                            t *= j;
                        series = series + (Math.pow(x, i * 2) / t);
                        t = 1.0;
                        // System.out.println(series);
                    }
                }
                System.out.println(
                        String.format("the sum =%.6f\nNumber of terms = %d\nvalue of x= %.6f", series, (int) n, x));
                break;
            }
            case 19:

            {
                double sum = 0.0;
                System.out.print("Enter the number of terms:");
                int n = sc.nextInt();
                for (int i = 1; i <= n; i++) {
                    System.out.print(String.format("1/%d + ", i));
                    sum += 1 / (double) i;
                }
                System.out.print(String.format("\nSum of Series upto 5 terms : %.6f", sum));
                break;
            }
            case 20:

            {
                System.out.print("Enter the number of rows:");
                int n = sc.nextInt();
                for (int i = 1; i <= n; i++) {

                    for (int j = 1; j <= n - i; j++) {
                        System.out.print(" ");

                    }

                    for (int j = 1; j <= i * 2 - 1; j++) {
                        System.out.print("*");

                    }
                    System.out.println();

                }
                break;
            }
            case 21:

            {
                int sum = 0;
                System.out.print("Enter the number of terms:");
                int n = sc.nextInt();
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("9");
                    }
                    System.out.print(" ");
                    sum += Math.pow(10, i) - 1;

                }
                System.out.println("\nThe sum of the series = " + sum);
                break;
            }
            case 22: {
                int x = 0, y = 0;
                System.out.print("Enter the number of rows:");
                int n = sc.nextInt();
                for (int i = 1; i <= n; i++) {

                    for (int j = 1; j <= i; j++) {
                        if (x == 0) {
                            if (i % 2 != 0 && j % 2 != 0)
                                System.out.print('1');
                            else
                                System.out.print('0');
                            y = 1;

                        } else if (x == 1) {
                            if (i % 2 == 0 && j % 2 == 0)
                                System.out.print('1');
                            else
                                System.out.print('0');
                            y = 0;
                        }
                    }
                    x = y;
                    System.out.println();

                }

                break;
            }
            case 23:

            {
                double series = 0.0;
                System.out.print("Enter the value of x:");
                double x = sc.nextInt();
                System.out.print("Enter the number of terms:");
                double n = sc.nextInt();

                for (int i = 1; i <= n; i++) {
                    if (i % 2 == 0) {
                        series = series - (Math.pow(x, i * 2 - 1));
                        // System.out.println(series);
                    } else {
                        series = series + (Math.pow(x, i * 2 - 1));
                        // System.out.println(series);
                    }
                }
                System.out.println(
                        String.format("The sum is : %.6f", series));
                break;
            }
            case 24:

            {
                double series = 0.0;
                System.out.print("Enter the value of x:");
                double x = sc.nextInt();
                System.out.print("Enter the number of terms:");
                double n = sc.nextInt();

                for (int i = 1; i <= n; i++) {
                    if (i % 2 == 0) {
                        series = series - (Math.pow(x, i * 2 - 1));
                        System.out.println(series);
                    } else {
                        series = series + (Math.pow(x, i * 2 - 1));
                        System.out.println(series);
                    }
                }
                System.out.println(
                        String.format("The sum is : %.6f", series));
                break;
            }
            case 25:

            {
                System.out.print("Enter the number of rows:");
                int n = sc.nextInt();
                int sum = 0;
                System.out.print(String.format("The square natural upto %d terms are :", n));
                for (int i = 1; i <= n; System.out.print(i * i + " "), sum += i * i, i++) {
                }
                System.out.println(String.format("\nThe Sum of Square Natural Number upto %d terms = %d", n, sum));
                break;
            }
            case 26:

            {
                int sum = 0;
                int t = 1;
                System.out.print("Enter the number of terms:");
                int n = sc.nextInt();
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("1");
                    }
                    System.out.print(" ");
                    sum += t;
                    t = t * 10 + 1;

                }
                System.out.println("\nThe sum of the series = " + sum);
                break;
            }
            case 27:

            {
                System.out.print("Enter the number of rows:");
                int n = sc.nextInt();
                int sum = 0;
                System.out.print("The positive divisor : ");
                for (int i = 1; i < n; i++) {
                    if (n % i == 0) {
                        sum += i;
                        System.out.print(i + " ");

                    } else
                        continue;
                }
                System.out.print("\nThe sum of the divisor is : " + sum);

                System.out.print(sum == n ? "\nSo, the number is perfect." : "\nSo, the number is not perfect.");

                break;
            }
            case 28:

            {
                System.out.print("Input the starting range or number : ");
                int s = sc.nextInt();
                System.out.print("Input the ending range of number : ");
                int e = sc.nextInt();
                int sum = 0;
                System.out.print("The positive divisor : ");
                for (int j = s; j <= e; j++) {
                    sum = 0;
                    for (int i = 1; i < j; i++) {
                        if (j % i == 0) {
                            sum += i;

                        } else
                            continue;
                    }
                    System.out.print(sum == j ? j + " " : "");
                }

                break;
            }
            case 29:

            {
                System.out.print("Enter the number:");
                int n = sc.nextInt();
                int sum = 0, mod = 0, count = 0, div = n;
                // count
                while (div > 0) {
                    mod = div % 10;
                    div = div / 10;
                    count++;
                }
                div = n;
                while (div > 0) {
                    mod = div % 10;
                    sum += Math.pow(mod, count);
                    div = div / 10;
                }
                // System.out.println(n+" "+sum);
                System.out.print(sum == n ? n + " is an Armstrong number." : n + " is not an Armstrong number.");
                break;
            }
            case 30:

            {
                System.out.print("Input the starting range or number : ");
                int s = sc.nextInt();
                System.out.print("Input the ending range of number : ");
                int e = sc.nextInt();
                System.out.print("\nArmstrong numbers in given range are: ");
                int sum = 0, mod = 0, count = 0, div = 0;
                for (int i = s; i <= e; i++) {
                    div = i;
                    // count
                    while (div > 0) {
                        mod = div % 10;
                        div = div / 10;
                        count++;
                    }
                    div = i;
                    // System.out.println(div);
                    while (div > 0) {
                        mod = div % 10;
                        sum += Math.pow(mod, count);
                        div = div / 10;
                    }
                    // System.out.println(n+" "+sum);
                    System.out.print(sum == i ? i + " " : "");
                    sum = 0;
                    count = 0;

                }
                break;
            }
            case 31: {
                System.out.print("Enter value for n:");
                int n = sc.nextInt();
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 0; k < i * 2 + 1; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                for (int i = n - 2; i >= 0; i--) {
                    for (int j = 0; j < n - i - 1; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 0; k < i * 2 + 1; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            }
            case 32: {
                System.out.print("Enter the number n:");
                int n = sc.nextInt();
                int i;
                if (n == 0 || n == 1 || n == 2 || n == 3)
                    System.out.print(n + " is a prime number");

                for (i = 2; i <= n / 2; i++) {

                    if (n % i == 0) {
                        System.out.print(n + " is not a prime number");
                        break;
                    } else if (i == n / 2)
                        System.out.print(n + " is a prime number");
                }

                break;
            }
            case 33: {
                System.out.print("Enter value for n:");
                int n = sc.nextInt();
                int c = 0;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 0; k < i + 1; k++) {
                        if (k == 0)
                            c = 1;
                        else {
                            c = c * (i - k + 1) / k;
                        }
                        System.out.print(String.format("%d ", c));
                    }

                    System.out.println();
                }
                break;
            }
            case 34: {
                System.out.print("Enter the starting range:");
                int s = sc.nextInt();
                System.out.print("Enter the ending range:");
                int e = sc.nextInt();
                int i, n, j;
                System.out.print("The prime number between " + s + "and" + e + " are :");
                for (j = s; j <= e; j++) {
                    n = j;
                    if (n == 0 || n == 1 || n == 2 || n == 3)
                        System.out.print(n + " ");

                    for (i = 2; i <= n / 2; i++) {

                        if (n % i == 0) {
                            break;
                        } else if (i == n / 2)
                            System.out.print(n + " ");
                    }
                }
                break;
            }
            case 35: {
                System.out.print("Enter the range for fibanocci series:");
                int n = sc.nextInt();
                int n1 = 0, n2 = 1, n3;
                System.err.println("Here is the Fibonacci series upto to " + n + " terms :");
                System.out.println(n1 + " ");

                if (n >= 2) {
                    System.out.print(n2 + " ");
                }
                for (int i = 2; i < n; i++) {

                    n3 = n1 + n2;
                    n1 = n2;
                    n2 = n3;
                    System.out.print(n3 + " ");
                }

                break;
            }
            case 36:

            {
                System.out.print("Enter the number of rows:");
                int n = sc.nextInt();
                int temp;
                for (int i = 1; i <= n; i++) {
                    temp = i;

                    for (int j = 1; j <= n - i; j++) {
                        System.out.print(" ");

                    }

                    for (int j = 1; j <= i * 2 - 1; j++) {
                        if (i >= j)
                            System.out.print(j);
                        else
                            System.out.print(--temp);

                    }
                    System.out.println();

                }
                break;
            }
            case 37: {
                System.out.print("Enter the number:");
                int n = sc.nextInt();
                int rem = 0, mod = 0, div = n, rev = 0;
                for (;;) {
                    rem = div % 10;
                    rev = rev * 10 + rem;
                    div /= 10;
                    if (div == 0)
                        break;

                }
                System.out.println("The number in reverse order is : " + rev);

            }
            case 38: {
                System.out.print("Enter the number:");
                int n = sc.nextInt();
                int rem = 0, mod = 0, div = n, rev = 0;
                for (;;) {
                    rem = div % 10;
                    rev = rev * 10 + rem;
                    div /= 10;
                    if (div == 0)
                        break;

                }
                if (div == n)
                    System.out.println(n + " is a palindrome number.");
                else
                    System.out.println(n + " is not a palindrome number.");

            }
            case 39: {
                int sum = 0, i = 100;
                // System.out.println("Numbers between 100 and 200, divisible by 9 :");
                for (System.out.println("Numbers between 100 and 200, divisible by 9 :"); i <= 200; i++) {
                    if (i % 9 == 0) {
                        System.out.print(i + " ");
                        sum += i;
                    }

                }
                System.out.println("\nThe sum : " + sum);
                break;
            }
            case 40: {
                char sum = 'A';
                System.out.println("Enter the number of rows:");
                int n = sc.nextInt();
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        System.out.print("   ");
                    }
                    for (int k = 0; k < i * 2 + 1; k++) {
                        if (i > k)
                            System.out.print(" " + sum++ + " ");
                        else if (i == k)
                            System.out.print(" " + sum + " ");
                        else {
                            System.out.print(" " + (--sum) + " ");

                        }
                    }
                    sum = 'A';
                    System.out.println();
                }

            }
            case 41: {
                System.out.print("Input a decimal number: ");
                int dec = sc.nextInt();
                System.out.println("Binary number equivalent to said decimal number is: ");
                long rem = 0, div = dec, rev = 0, bin = 0, count = 0;
                String s = "";
                while (div > 0) {
                    rem = div % 2;
                    s += rem;
                    div = div / 2;
                    count++;
                }
                rem = 0;
                for (int i = 0; i < 32 - count; i++) {
                    s += 0;
                }
                for (int i = s.length() - 1; i >= 0; i--) {
                    System.out.print(s.charAt(i));
                }
                break;
            }
            case 42: {
                System.out.print("Input a binary number :");
                long b = sc.nextLong();
                System.out.print("The equivalent Decimal Number : ");
                long x = b, rem = 0, power = 0, sum = 0;
                while (x > 0) {
                    rem = x % 10;
                    rem = (long) (rem * Math.pow(2, power));
                    sum += rem;
                    power++;
                    x /= 10;
                }
                System.out.println(sum);
                break;
            }
            case 43: {
                int hcf = 0;
                System.out.println("Input 1st number for HCF: ");
                int n1 = sc.nextInt();
                System.out.println("Input 2nd number for HCF: ");
                int n2 = sc.nextInt();
                int min = Math.min(n1, n2);
                for (int i = 1; i <= min; i++) {
                    if (n1 % i == 0 && n2 % i == 0) {
                        hcf = i;
                    } else {
                        continue;
                    }

                }
                System.out.println("HCF of " + n1 + " and " + n2 + " is : " + hcf);

                break;

            }
            case 44: {
                int hcf = 0;
                System.out.println("Input 1st number for LCM: ");
                int n1 = sc.nextInt();
                System.out.println("Input 2nd number for LCM: ");
                int n2 = sc.nextInt();
                int min = Math.min(n1, n2);
                for (int i = 1; i <= min; i++) {
                    if (n1 % i == 0 && n2 % i == 0) {
                        hcf = i;
                    } else {
                        continue;
                    }

                }
                System.out.println("LCM of " + n1 + " and " + n2 + " is : " + (n1 * n2) / (hcf));

                break;

            }
            case 45: {
                int lcm = 0;
                System.out.println("Input 1st number for LCM: ");
                int n1 = sc.nextInt();
                System.out.println("Input 2nd number for LCM: ");
                int n2 = sc.nextInt();
                int max = Math.max(n1, n2);
                int m = max;
                for (int i = 0;; i++) {
                    if (max % n1 == 0 && max % n2 == 0) {
                        lcm = max;
                        break;
                    } else {
                        max += m;
                        // System.out.println(max);
                    }

                }
                System.out.println("LCM of " + n1 + " and " + n2 + " is : " + lcm);

                break;

            }
            case 46: {
                System.out.println("Enter binary number:");
                String b = sc.next();
                int decimal = Integer.parseInt(b, 2);
                System.out.println("The equivalent Decimal Number is : " + decimal);
                break;
            }
            case 47: {
                System.out.println("Enter a number:");
                int s = sc.nextInt();
                int n = s, rem = 0, fact = 1, sum = 0;
                while (n > 0) {
                    rem = n % 10;
                    for (int i = 1; i <= rem; i++) {
                        fact *= i;
                    }
                    sum += fact;
                    fact = 1;
                    n = n / 10;
                }
                // System.out.println(sum);
                System.out.println(sum == s ? s + " is a strong number" : s + " is not a strong number");
                break;
            }
            case 48: {
                System.out.println("Input starting range of number:");
                int s = sc.nextInt();
                System.out.println("Input ending range of number:");
                int e = sc.nextInt();
                int rem = 0, fact = 1, sum = 0;
                System.err.print("Strong numbers are:");
                for (int j = s; j <= e; j++) {
                    int x = j;
                    while (x > 0) {
                        rem = x % 10;
                        for (int i = 1; i <= rem; i++) {
                            fact *= i;
                        }
                        sum += fact;
                        fact = 1;
                        x = x / 10;
                        // System.out.println(j);
                    }
                    if (sum == j)
                        System.out.print(j + " ");
                    sum = 0;

                }
                break;
            }
            case 49: {
                System.out.print("Input the starting number of the A.P. series: ");
                int s = sc.nextInt();
                System.out.print("Input the number of items for the A.P. series: ");
                int n = sc.nextInt();
                System.out.print("Input the common difference of A.P. series: ");
                int d = sc.nextInt();
                int x = s, i, sum = s;
                for (System.out.print(x), i = 0, x = s; i < n - 1; i++, System.out.print(" + " + (x += d)), sum += x)
                    ;
                System.out.println(" = " + sum);
                break;
            }
            case 50: {
                System.out.println("Enter a number to convert : ");
                int d = sc.nextInt();
                int div = d, rem = 0, octal = 0, rev = 0;
                while (div > 0) {
                    rem = div % 8;
                    rev = rev * 10 + rem;
                    div = div / 8;
                }
                rem = 0;
                while (rev > 0) {
                    rem = rev % 10;
                    octal = octal * 10 + rem;
                    rev = rev / 10;
                }
                System.out.println(octal);
                break;
            }
            case 51: {
                System.out.print("Input a octal number (0-7) :");
                long b = sc.nextLong();
                System.out.print("The equivalent Decimal Number : ");
                long x = b, rem = 0, power = 0, sum = 0;
                while (x > 0) {
                    rem = x % 10;
                    rem = (long) (rem * Math.pow(8, power));
                    sum += rem;
                    power++;
                    x /= 10;
                }
                System.out.println(sum);
                break;
            }
            case 52: {
                System.out.print("Input the starting number of the G.P. series: ");
                double s = sc.nextInt();
                System.out.print("Input the number of items for the G.P. series: ");
                double n = sc.nextInt();
                System.out.print("Input the common ratio of G.P. series: ");
                double d = sc.nextInt();
                double x = s, i, sum = s;
                for (System.out.print(String.format("%.6f", x)), i = 0, x = s; i < n - 1; i++, System.out
                        .print(String.format(" + %.6f", (x *= d))), sum += x)
                    ;
                System.out.println(String.format(" = %.6f", sum));
                break;
            }
            case 53:{
                System.out.print("Input a binary number :");
                long bin=sc.nextLong();
                System.out.print("The equivalent Octal Number : ");
                long m=bin,rem=0,sum=0,rem1=0,power=0,result=0,tot=0;
                while(m>0){
                    rem=m%1000;
                    while(rem>0){
                        rem1=rem%10;
                        sum+=rem1*Math.pow(2, power);
                        rem/=10;
                        power++;
                    }
                    result=result*10+sum;
                    power=0;rem1=0;sum=0;
                    m/=1000;
                    
                }
                tot=result;
                result=0;
                while(tot>0){
                    rem=tot%10;
                    result=result*10+rem;
                    tot/=10;
                }
                System.out.println(result);
                break;
            }
            case 54:{
                System.out.print("Input an octal number (using digit 0 - 7) :");
                long n=sc.nextLong();
                long m=n,rem=0,rev=0,rem1=0,power1=0,sum=0,sum1=0,total=0;
                long result1=0;
                for( rem=m%10;m>0;m/=10,rem=m%10){
                    result1=(long)(rem*Math.pow(8,power1++));
                    sum+=result1;
                }
                sum1=sum;
                long i=1;
                System.out.println(sum1);
                for(rem=sum1%2;sum1>0;sum1/=2,rem=sum1%2){
                    total=total+rem*i; //Note
                    i=i*10;
                }
                System.out.println(total);

          
                break;
            }
            case 55: {
                System.out.println("Enter a number to convert : ");
                int d = sc.nextInt();
                String s = "";
                int div = d, rem = 0;
                while (div > 0) {
                    rem = div % 16;
                    if (rem > 9) {
                        s += (char) (rem + 55);
                    } else
                        s = s + rem;
                    div = div / 16;
                }
                for (int i = s.length() - 1; i >= 0; i--) {
                    System.out.print(s.charAt(i));
                }

                break;
            }
            case 56:{
                System.out.println("Enter the number:");
                int n=sc.nextInt();
                int temp=0; 
                for(int i=2;i<=n/2;i++){    // Taking each number
                    for(int j=2;j<=i/2;j++){    //Checking whether i is prime
                        if(i%j==0){
                            temp++;
                            break;
                        }
                    }
                    if(temp==0){
                        for(int k=2;k<=(n-i)/2;k++){  // checking whether second number is prime
                            if((n-i)%k==0){
                                temp++;
                                break;
                            }
                        }   
                        if(temp==0){
                            System.out.println(n+" = "+i+" + "+(n-i));
                        }
                    }
                    temp=0;
                }
                break;
            }
            case 57: {
                System.out.print("Input a string to reverse : ");
                String n = sc.next();
                String x="";
                System.out.print("Reversed string is: ");
                for (int i = n.length() - 1; i >= 0; i--)
                    x+=n.charAt(i);
                System.out.println(x);
                break;

            }
            case 58: { /// not done
                System.out.print("Input a string : ");
                String s = sc.next();
                int count = 0;
                System.out.println(s);
                for (int i = 0; s.charAt(i) != '\0'; i++) {
                    count++;
                }
                System.out.println("The length of the string welcome is : " + count);
            }
            case 59: {
                System.out.println("Input an integer : ");
                int n = sc.nextInt();
                int m = n, sum = 0, count = 0, rem = 0;
                while (m > 0) {
                    rem = m % 10;
                    count++;
                    m /= 10;
                }
                m = n;
                while (m > 0) {
                    sum += Math.pow(m % 10, count);
                    m = m / 10;
                }
                if (sum == n)
                    System.out.println(n + " is an Armstrong number");
                else
                    System.out.println(n + " is not an Armstrong number");
                break;
            }
            case 60: {
                int count = -1;
                System.out.println("Input characters : ");
                while (sc.hasNext()) {
                    String line = sc.nextLine();
                    count++;
                }
                System.out.println("Number of Characters: " + count);
                break;

            }
            case 61: {
                int upper = 0, lower = 0, other = 0;
                System.out.println("Input characters : ");
                sc.nextLine();
                String str = sc.nextLine();
                for (int i = 0; i < str.length(); i++) {
                    if (Character.isUpperCase(str.charAt(i))) {
                        upper++;
                    } else if (Character.isLowerCase(str.charAt(i))) {
                        lower++;
                    } else {
                        other++;
                    }
                }
                System.out.println(
                        "Uppercase letters: " + upper + " Lowercase letters: " + lower + " Other characters: " + other);
                break;

            }

            default:
                break;
        }

    }
}

    /******        System.out.print("Input an octal number (using digit 0 - 7) :");
                long n=sc.nextLong();
                long m=n,rem=0,rev=0,rem1=0;
                long result1=0;
                while(m>0){
                    rem=m%10;
                    rev=rev*10+rem;
                    m/=10;
                }
                long revt=rev;
                rem=0;
                while(revt>0){
                    rem=revt%10;
                    while (rem>0) {
                        rem1=rem%2;
                        result1=result1*10+rem1;
                        rem/=2;                      
                    }
                    revt/=10;
                    rem1=0;
                }
                System.out.println(result1);   
                 ******/