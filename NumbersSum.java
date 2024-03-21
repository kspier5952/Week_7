import java.util.*;
public class NumbersSum {
    public static void main(String[]args){
        int number;
        int num;
        int sum;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();
        input.close();
        num = 1;
        sum = 0;
        while (num <= number){
            System.out.println(num);
            sum += num;
            num = num + 1;
        }
        System.out.println("Sum: " + sum);
    }
}
