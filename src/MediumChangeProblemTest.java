import java.util.Arrays;
import java.util.Scanner;


public class MediumChangeProblemTest {


    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);

        System.out.println("Please enter the price of your article: ");
        float PriceOfArticle = UserInput.nextFloat();
        float AmountPaid, AmountToGiveBack;
        float[] MoneyDetailGiven = new float[8];
        float[] PossibleDollarMoney = new float[]{20, 10, 5, 1, 0.25f, 0.10f, 0.05f, 0.01f};
        float[] PossibleEuroMoney = new float[]{20, 10, 5, 1, 0.50f, 0.20f, 0.10f, 0.05f, 0.01f};
        float[] USDollarChange= new float [8];
        System.out.println("Please enter how much you're giving: ");

        AmountPaid = UserInput.nextFloat();

        AmountToGiveBack = AmountPaid - PriceOfArticle;
        //Base case
        if (PriceOfArticle == 0 || PriceOfArticle == AmountPaid) {
            System.out.println("Thank you and goodbye");
            return;
        }
        if (PriceOfArticle > AmountPaid) {
            System.out.println("Sorry you don't have enough money to pay this article.");
            System.out.println("Come back with the needed amount of cash.");
            return;
        }


        System.out.println("Please tell us how you'll give it today. ");
        System.out.println("Enter in the following order the number of bills and coins you'll be giving of each:");
        System.out.println("20$ , 10$ , 5$ , 1$ , 25cents , 10cents , 5cents or 1 cents");


        for (int i = 0; i < PossibleDollarMoney.length; i++) {
            System.out.print("Number of " + PossibleDollarMoney[i] + "$: ");
            MoneyDetailGiven[i] = UserInput.nextFloat();

        }


        MediumChangeProblem Object = new MediumChangeProblem(PriceOfArticle, AmountPaid, MoneyDetailGiven);


        System.out.println();
        System.out.println("Total Money Given: " + AmountPaid + "$");
        System.out.println("Change given: ");

        Object.MoneyInfo(MoneyDetailGiven, PossibleDollarMoney, "dollars");

        System.out.println();

        USDollarChange = Object.MoneyExcess(MoneyDetailGiven, PossibleDollarMoney, PriceOfArticle, AmountPaid);

        System.out.println(Arrays.toString(USDollarChange));

        System.out.println("Change back in US dollars: ");


        Object.MoneyInfo(USDollarChange, PossibleDollarMoney, "dollars");

        System.out.println();
        System.out.println();


        float[] EuroBillsToGive = Object.ConvertAndChange(AmountToGiveBack, PossibleEuroMoney);

        System.out.println("Change back in Euros: ");
        Object.MoneyInfo(EuroBillsToGive, PossibleEuroMoney, "euros");


    }

}
