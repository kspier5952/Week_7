import java.util.*;
public class Grades {
    public static void main(String[]args){
        int grade;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your numerical grade here: ");
        grade = input.nextInt();
        input.close();
        if (grade >= 90)
        {
            System.out.println("Wonderful job! You got an A");
        }
        else if (grade >= 80)
        {
            System.out.println("Good effort! You got a B");
        }
        else if (grade >= 70)
        {
            System.out.println("Study harder next time. You got a C");
        }
        else if (grade >= 65)
        {
            System.out.println("You passed. Barely. You got a D");
        }
        else if (grade < 65)
        {
            System.out.println("You failed, please see your teacher for extra help. You got an F");
        }
    }
}