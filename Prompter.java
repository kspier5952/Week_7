import java.util.*;
public class Prompter {
    public static void main(String[]args){
        double min;
        double max;
        double num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        min = input.nextDouble();
        System.out.print("Enter a number greater than the first: ");
        max = input.nextDouble();
        num = min;
        while ( num <= min || num >= max){
            System.out.print("Enter a number that is between " + min + " and " + max + ": ");
            num = input.nextDouble();
        }
        input.close();
    }
}
