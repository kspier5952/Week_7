import java.text.NumberFormat;
public class Investment {
    public static void main(String[]args){
        double investment = 2500;
        int years;
        years = 0;
        while (investment < 5000){
            investment = (investment * 1.075);
            years = years + 1;
        }
        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.println("It will take " + years + " years to reach $5,000.");
        System.out.print("After " + years + " years, you will have ");
        System.out.println(money.format(investment));
    }

}
