import java.util.Scanner;

class sumNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int num, sum = 0;
        num = sc.nextInt();

        for (int i = 1; i <= num; ++i) {
            // sum = sum + i;
            sum += i;
        }

        System.out.println("Sum of Natual number 1 to 505" + num + " is " + sum);
    }
}