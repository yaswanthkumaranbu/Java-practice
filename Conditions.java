import java.util.*;
import java.lang.Math;

class Conditions {

    void First(int a, int b) {
        if (a == b) {
            System.out.print("Number1 and Number2 are equal");
        } else {
            System.out.print("Number1 and Number2 are not equal");
        }
    }

    void Second(int a) {
        if (a % 2 == 0) {
            System.out.print(a + " is an even integer");
        } else {
            System.out.print(a + " is an odd integer");
        }
    }

    void Third(int a) {
        if (a >= 0) {
            System.out.print(a + " is a Positive integer");
        } else {
            System.out.print(a + " is a Negative integer");
        }
    }

    void Fourth(int a) {
        if (a % 400 == 0) {
            System.out.print(a + " is a leap year");
        } else if (a % 100 == 0) {
            System.out.print(a + " is not a  integer");
        } else if (a % 4 == 0) {
            System.out.print(a + " is a leap year");
        } else {
            System.out.print(a + " is not a leap year");

        }
    }

    void Fifth(int a) {
        if (a >= 18) {
            System.out.print("Congratulation! You are eligible for casting your vote.");
        } else {
            System.out.print("You are not eligible for casting your vote.");
        }
    }

    void Sixth(int m) {
        int n;
        if (m > 0) {
            n = 1;
            System.out.print("The value of n = " + n);
        } else if (m == 0) {
            n = 0;
            System.out.print("The value of n = " + n);
        } else {
            n = -1;
            System.out.print("The value of n = " + n);

        }
    }

    void Seventh(int a) {
        if (a < 150) {
            System.out.print("The person is Dwarf");
        } else if (a == 150) {
            System.out.print("The person is in Average height");
        } else {
            System.out.print("The person is Tall");

        }
    }

    void Eigth(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.print("1st Number = " + a + "," + "2nd Number = " + b + "," + "3rd Number = " + c);
            System.out.println("The 1st Number is the greatest among three");
        } else if (b > a && b > c) {
            System.out.print("1st Number = " + a + "," + "2nd Number = " + b + "," + "3rd Number = " + c);
            System.out.println("The 2st Number is the greatest among three");
        } else {
            System.out.print("1st Number = " + a + "," + "2nd Number = " + b + "," + "3rd Number = " + c);
            System.out.println("The 3st Number is the greatest among three");

        }
    }

    void Nineth(int x, int y) {
        if (x > 0 && y > 0) {
            System.out.print(String.format("The coordinate point (%d,%d) lies in the First quadrant", x, y));
        } else if (x < 0 && y > 0) {
            System.out.print(String.format("The coordinate point (%d,%d) lies in the Second quadrant", x, y));
        } else if (x < 0 && y < 0) {
            System.out.print(String.format("The coordinate point (%d,%d) lies in the Third quadrant", x, y));
        } else if (x > 0 && y < 0) {
            System.out.print(String.format("The coordinate point (%d,%d) lies in the Fourth quadrant", x, y));
        } else if (x == 0 && y == 0) {
            System.out.print(String.format("The coordinate point (%d,%d) is origin", x, y));

        }

    }

    void Tenth(int m, int p, int c) {
        if (m >= 65 && p >= 55 && c >= 50) {
            if ((m + p + c) >= 190 || (m + p) >= 140) {
                System.out.println("The candidate is eligible for admission.");
            } else {
                System.out.println("The candidate is not eligible for admission.");

            }
        } else {
            System.out.println("The candidate is not eligible for admission.");

        }
    }

    void Eleventh(int a, int b, int c) {
        int d = (b * b) - (4 * a * c);

        if (d == 0) {
            System.out.print("Root:");
            System.out.print((-b / (2 * a)));
        } else {
            if (d > 0) {
                System.out.print("Root1:");
                System.out.println((-b + Math.pow(d, 0.5)) / (2 * a));
                System.out.print("Root2:");
                System.out.println((-b - Math.pow(d, 0.5)) / (2 * a));

            } else {
                System.out.println("Roots are imaginary");
            }
        }

    }

    void Twelth(int roll, String name, int phy, int che, int ca) {
        int Total = phy + che + ca;
        double percentage = (Total / 3);
        System.out.println("Roll No : " + roll);
        System.out.println("Name of Student : " + name);
        System.out.println("Marks in Physics : " + phy);
        System.out.println("Marks in Chemistry : " + che);
        System.out.println("Marks in Computer Application : " + ca);
        System.out.println("Total Marks : " + Total);
        System.out.println(String.format("Percentage : %.2f", percentage));
        if (percentage >= 60)
            System.out.println("Division = First");
        else if (percentage >= 48)
            System.out.println("Division = Second");
        else if (percentage >= 36)
            System.out.println("Division = Pass");
        else
            System.out.println("Fail");
    }

    void Thirteenth(int t) {
        if (t >= 40)
            System.out.println("Its very hot");
        else if (t >= 30)
            System.out.println("Its Hot");
        else if (t >= 20)
            System.out.println("Normal in Temp");
        else if (t >= 10)
            System.out.println("Cold weather");
        else if (t >= 0)
            System.out.println("Very Cold weather");
        else
            System.out.println("Freezing weather");

    }

    void Fourteenth(int a, int b, int c) {
        if (a == b && a == c) {
            System.out.println("This is an equilateral triangle");
        } else if (a == b || b == c || a == c) {
            System.out.println("This is an isosceles traingle");
        } else {
            System.out.println("This is a Scalene");
        }
    }

    void Fifteenth(int a, int b, int c) {
        if ((a + b + c) == 180) {
            System.out.println("The triangle is valid");
        }

        else {
            System.out.println("The triangle is not valid");
        }
    }

    void Sixteenth(Character a) {
        if (a >= '0' && a <= '9') {
            System.out.println("This is a digit.");
        } else if (a >= 'A' && a <= 'Z' || a >= 'a' && a <= 'z') {
            System.out.println("This is an Alphabet.");
        } else
            System.out.println("This is a special character.");
    }

    void Seventeenth(Character a) {
        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'A' || a == 'E' || a == 'I' || a == 'O'
                || a == 'U') {
            System.out.println("The alphabet is a vowel");
        } else if (a >= 'A' && a <= 'Z' || a >= 'a' && a <= 'z') {
            System.out.println("The alphabet is a consonant");
        } else
            System.out.println("This is a not an alphabet.");
    }

    void Eighteenth(int a, int b) {
        if (b > a) {
            System.out.println("You can booked your profit amount : " + (b - a));
        } else if (b < a) {
            System.out.println("You incurred a loss of amount : " + (a - b));
        } else
            System.out.println("You are in a no profit, no loss condition.");
    }

    void Nineteenth(int id, String name, int unit) {
        double total = 0, t = 0, i = 0;
        if (unit >= 600) {
            total = unit * 2;
            i = 2.00;
        } else if (unit >= 400) {
            total = unit * 1.8;
            i = 1.80;
        } else if (unit >= 200) {
            total = unit * 1.5;
            i = 1.50;
        } else {
            total = unit * 1.2;
            i = 1.20;
        }
        // total=total>400 ? (15/100)*total:total;
        t = total;
        if (total > 400) {
            total = (15 / 100) * total;
            System.out.println("Customer IDNO :" + id);
            System.out.println("Customer Name :" + name);
            System.out.println("unit Consumed :" + unit);
            System.out.println(String.format("Amount Charges @Rs. %f per unit :", i, t));
            System.out.println("Surchage Amount :" + (total - t));
            System.out.println("Net Amount Paid By the Customer :" + total);
        }

    }

    void Twenteeth(String str) {
        if (str == "E")
            System.out.println("You have choosen :Excellent");
        else if (str == "V")
            System.out.println("You have choosen :Very Good");
        else if (str == "G")
            System.out.println("You have choosen :Good");
        else if (str == "A")
            System.out.println("You have choosen :Average");
        else if (str == "F")
            System.out.println("You have choosen :Fail");
    }

    void Twentyone(int n) {
        switch (n) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid");
                break;
        }
    }

    void Twentytwo(int n) {
        switch (n) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;

            default:
                System.out.println("Invalid digit! Please try again");
                break;
        }
    }

    void Twentythree(int n) {
        switch (n) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;

            default:
                System.out.println("Invalid number! Please try again");
                break;
        }
    }

    void Twentyfour(int n) {
        switch (n) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Months have 31 days");
                break;

            case 2:
                System.out.println("Month has 28 days");
                System.out.println("Month has 29 days(in leap year)");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Months have 30 days");
                break;
            default:
                System.out.println("Invalid number! Please try again");
                break;
        }
    }

    void Twentyfive(Scanner sc) {
        System.out.println("Input 1 for area of circle");
        System.out.println("Input 2 for area of rectangle");
        System.out.println("Input 3 for area of triangle");
        int n = sc.nextInt();
        final double pi = 3.14;
        double area = 0;
        switch (n) {
            case 1: {
                System.out.println("Enter the radius:");
                double r = sc.nextDouble();
                area = pi * r * r;
                break;
            }

            case 2: {
                System.out.println("Enter space separated length and width:");
                double l = sc.nextDouble();
                double w = sc.nextDouble();
                area = l * w;
                break;
            }
            case 3: {
                System.out.println("Enter space separated breadth and height:");
                double b = sc.nextDouble();
                double h = sc.nextDouble();
                area = 0.5 * b * h;

                break;
            }
        }
        System.out.println(String.format("The area is %.6f",area));
    }

    void Twentysix(Scanner sc) {
        System.out.println("Enter number 1:");
        int a = sc.nextInt();
        System.out.println("Enter number 2:");
        int b = sc.nextInt();
        System.out.println("1-Addition.\n2-Substraction.\n3-Multiplication.\n4-Division.\n5-Exit.\n");
        int n = sc.nextInt();
        switch (n) {
            case 1: {
                System.out.println(String.format("The addition of %d and %d = %d", a, b, (a + b)));
                break;
            }

            case 2: {
                System.out.println(String.format("The subtraction of %d and %d = %d", a, b, (a>b?a-b:b-a)));
                break;
            }
            case 3: {
                System.out.println(String.format("The Multiplication of %d and %d = %d",a,b,(a*b)));     
                break;
            }
            case 4: {
                if(b==0)
                System.out.println("Second number is 0,cannot perform division");
                else{
                System.out.println(String.format("The Division of %d and %d = %d",a,b,(a/b)));  
                }   
                break;
            }
            case 5:
            break;
        }
 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conditions obj = new Conditions();

        System.out.print("Enter question number:");
        int inp = sc.nextInt();
        switch (inp) {
            case 1: {
                System.out.print("Enter the number 1:");
                int a = sc.nextInt();
                System.out.print("Enter the number 2:");
                int b = sc.nextInt();
                obj.First(a, b);
                break;
            }
            case 2: {
                System.out.print("Enter the number:");
                int a = sc.nextInt();
                obj.Second(a);
                break;
            }
            case 3: {
                System.out.print("Enter the number:");
                int a = sc.nextInt();
                obj.Third(a);
                break;
            }
            case 4: {
                System.out.print("Enter the year:");
                int a = sc.nextInt();
                obj.Fourth(a);
                break;
            }
            case 5: {
                System.out.print("Enter the age :");
                int a = sc.nextInt();
                obj.Fifth(a);
                break;
            }
            case 6: {
                System.out.print("Enter the integer :");
                int m = sc.nextInt();
                obj.Sixth(m);
                break;
            }
            case 7: {
                System.out.print("Enter the height :");
                int a = sc.nextInt();
                obj.Seventh(a);
                break;
            }
            case 8: {
                System.out.print("Enter the Number1 :");
                int a = sc.nextInt();
                System.out.print("Enter the Number2 :");
                int b = sc.nextInt();
                System.out.print("Enter the Number3 :");
                int c = sc.nextInt();
                obj.Eigth(a, b, c);
                break;
            }
            case 9: {
                System.out.print("Enter the x coordinate :");
                int x = sc.nextInt();
                System.out.print("Enter the y coordinate :");
                int y = sc.nextInt();
                obj.Nineth(x, y);
                break;
            }
            case 10: {
                System.out.print("Enter the Maths mark:");
                int m = sc.nextInt();
                System.out.print("Enter the Physics mark:");
                int p = sc.nextInt();
                System.out.print("Enter the Chemistry mark:");
                int c = sc.nextInt();
                obj.Tenth(m, p, c);
                break;
            }
            case 11: {
                System.out.print("Enter the value a:");
                int a = sc.nextInt();
                System.out.print("Enter the value b:");
                int b = sc.nextInt();
                System.out.print("Enter the value c:");
                int c = sc.nextInt();
                obj.Eleventh(a, b, c);
                break;
            }
            case 12: {
                System.out.print("Enter your rollno:");
                int roll = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter your name:");
                String name = sc.nextLine();
                System.out.print("Enter space separated marks for physics,chemistry,CA:");
                int physics = sc.nextInt();
                int chemistry = sc.nextInt();
                int ca = sc.nextInt();
                obj.Twelth(roll, name, physics, chemistry, ca);
                break;
            }
            case 13: {
                System.out.print("Enter the temperature:");
                int temperature = sc.nextInt();
                obj.Thirteenth(temperature);
                break;
            }
            case 14: {
                System.out.print("Enter angle a:");
                int a = sc.nextInt();
                System.out.print("Enter angle b:");
                int b = sc.nextInt();
                System.out.print("Enter angle c:");
                int c = sc.nextInt();
                obj.Fourteenth(a, b, c);
                break;
            }
            case 15: {
                System.out.print("Enter angle a:");
                int a = sc.nextInt();
                System.out.print("Enter angle b:");
                int b = sc.nextInt();
                System.out.print("Enter angle c:");
                int c = sc.nextInt();
                obj.Fifteenth(a, b, c);
                break;
            }
            case 16: {
                System.out.print("Enter the character:");
                Character a = sc.next().charAt(0);
                obj.Sixteenth(a);
                break;
            }
            case 17: {
                System.out.print("Enter angle a:");
                char a = sc.next().charAt(0);
                obj.Seventeenth(a);
                break;
            }
            case 18: {
                System.out.print("Enter cost price:");
                int cp = sc.nextInt();
                System.out.print("Enter selling price:");
                int sp = sc.nextInt();
                obj.Eighteenth(cp, sp);
                break;
            }
            case 19: {
                System.out.print("Enter the customer ID");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter your name:");
                String b = sc.nextLine();
                System.out.print("Enter the units:");
                int c = sc.nextInt();
                obj.Nineteenth(id, b, c);
                break;
            }
            case 20: {
                System.out.print("Enter the grade:");
                String grade = sc.nextLine();
                obj.Twenteeth(grade);
                break;
            }
            case 21: {
                System.out.print("Enter the day number:");
                int a = sc.nextInt();
                obj.Twentyone(a);
                break;
            }
            case 22: {
                System.out.print("Enter the digit:");
                int a = sc.nextInt();
                obj.Twentytwo(a);
                break;
            }
            case 23: {
                System.out.print("Enter the digit for month:");
                int a = sc.nextInt();
                obj.Twentythree(a);
                break;
            }
            case 24: {
                System.out.print("Enter the digit for month:");
                int a = sc.nextInt();

                obj.Twentyfour(a);
                break;
            }
            case 25: {

                obj.Twentyfive(sc);
                break;
            }
            case 26: {
                obj.Twentysix(sc);
                break;
            }

        }

    }
}