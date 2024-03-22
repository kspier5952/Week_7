import java.util.*;
public class DigitsSum {
    public static void main(String[]args){
    int original;
    int sum = 0;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a positive integer: ");
    original = input.nextInt();
    while (original > 0){
        sum += original % 10;
        original = (original - original % 10)/10;
    }
    input.close();
    System.out.println("The sum of the digits is: " + sum);
    }
}
