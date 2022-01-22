import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


public class MediumChangeProblemJUnittest {

    float[] PossibleDollarMoney = new float[]{20, 10, 5, 1, 0.25f, 0.10f, 0.05f, 0.01f};
    float[] PossibleEuroMoney = new float[]{20, 10, 5, 1, 0.50f, 0.20f, 0.10f, 0.05f, 0.01f};
    float Article_Price, Total_Given;


    @Test
    public void Test1() {

        float[] CashGiven = new float[]{2, 0, 0, 0, 0, 0, 0, 0};
        float[] USExcess = new float[]{0, 0, 0, 0, 0, 0, 0, 0};
        float[] EUChange = new float[]{0, 0, 1, 3, 0, 2, 0, 0, 0};
        Article_Price = 30;
        Total_Given = 40;

        float AmountToGiveBack = Total_Given - Article_Price;

        MediumChangeProblem Test1 = new MediumChangeProblem(Article_Price, Total_Given, CashGiven);

        float[] TempUS = Test1.MoneyExcess(CashGiven, PossibleDollarMoney, Article_Price, Total_Given);
        AmountToGiveBack = Test1.getAmountToGiveBack();
        float[] TempEU = Test1.ConvertAndChange(AmountToGiveBack, PossibleEuroMoney);


        assertEquals(Arrays.toString(USExcess), Arrays.toString(TempUS));
        assertEquals(Arrays.toString(EUChange), Arrays.toString(TempEU));
    }

    @Test
    public void Test2() {

        float[] CashGiven = new float[]{4, 6, 8, 4, 32, 50, 3, 1};
        float[] USExcess = new float[]{1, 0, 1, 4, 3, 0, 1, 0};
        float[] EUChange = new float[]{1, 0, 1, 0, 0, 0, 0, 0, 3};

        Article_Price = 167.36f;
        Total_Given = 197.16f;

        float AmountToGiveBack = Total_Given - Article_Price;

        MediumChangeProblem Test2 = new MediumChangeProblem(Article_Price, Total_Given, CashGiven);

        float[] TempUS = Test2.MoneyExcess(CashGiven, PossibleDollarMoney, Article_Price, Total_Given);
        float[] TempEU = Test2.ConvertAndChange(AmountToGiveBack, PossibleEuroMoney);


        assertEquals(Arrays.toString(USExcess), Arrays.toString(TempUS));
        assertEquals(Arrays.toString(EUChange), Arrays.toString(TempEU));
    }


    @Test
    public void Test3() {

        float[] CashGiven = new float[]{5, 6, 9, 4, 8, 0, 3, 6};
        float[] USExcess = new float[]{2, 0, 0, 3, 3, 0, 2, 0};
        float[] EUChange = new float[]{1, 1, 1, 1, 1, 1, 1, 0, 3};

        Article_Price = 167.36f;
        Total_Given = 211.21f;

        float AmountToGiveBack = Total_Given - Article_Price;

        MediumChangeProblem Test3 = new MediumChangeProblem(Article_Price, Total_Given, CashGiven);

        float[] TempUS = Test3.MoneyExcess(CashGiven, PossibleDollarMoney, Article_Price, Total_Given);
        float[] TempEU = Test3.ConvertAndChange(AmountToGiveBack, PossibleEuroMoney);


        assertEquals(Arrays.toString(USExcess), Arrays.toString(TempUS));
        assertEquals(Arrays.toString(EUChange), Arrays.toString(TempEU));
    }

    @Test
    public void Test4() {

        float[] CashGiven = new float[]{0, 0, 8, 4, 600, 50, 3, 0};
        float[] USExcess = new float[]{0, 0, 5, 2, 0, 0, 0, 0};
        float[] EUChange = new float[]{1, 0, 0, 2, 1, 0, 1, 1, 2};

        Article_Price = 172.15f;
        Total_Given = 199.15f;

        float AmountToGiveBack = Total_Given - Article_Price;

        MediumChangeProblem Test4 = new MediumChangeProblem(Article_Price, Total_Given, CashGiven);

        float[] TempUS = Test4.MoneyExcess(CashGiven, PossibleDollarMoney, Article_Price, Total_Given);
        float[] TempEU = Test4.ConvertAndChange(AmountToGiveBack, PossibleEuroMoney);


        assertEquals(Arrays.toString(USExcess), Arrays.toString(TempUS));
        assertEquals(Arrays.toString(EUChange), Arrays.toString(TempEU));
    }

    @Test //issue
    public void Test5() {

        float[] CashGiven = new float[]{2, 0, 30, 2, 9, 3, 6, 51};
        float[] USExcess = new float[]{2, 0, 1, 2, 4, 0, 0, 0};
        float[] EUChange = new float[]{2, 0, 0, 0, 0, 1, 1, 0, 2};

        Article_Price = 147.36f;
        Total_Given = 195.36f;

        float AmountToGiveBack = Total_Given - Article_Price;
        MediumChangeProblem Test5 = new MediumChangeProblem(Article_Price, Total_Given, CashGiven);

        float[] TempUS = Test5.MoneyExcess(CashGiven, PossibleDollarMoney, Article_Price, Total_Given);
        float[] TempEU = Test5.ConvertAndChange(AmountToGiveBack, PossibleEuroMoney);


        assertEquals(Arrays.toString(USExcess), Arrays.toString(TempUS));
        assertEquals(Arrays.toString(EUChange), Arrays.toString(TempEU));


    }

    @Test
    public void Test6() {

        float[] CashGiven = new float[]{1, 0, 1, 0, 1, 4, 2, 1};
        float[] USExcess = new float[]{0, 0, 1, 0, 1, 4, 2, 1};
        float[] EUChange = new float[]{0, 0, 1, 1, 0, 1, 0, 0, 1};

        Article_Price = 18.36f;
        Total_Given = 25.76f;
        float AmountToGiveBack = Total_Given - Article_Price;

        MediumChangeProblem Test6 = new MediumChangeProblem(Article_Price, Total_Given, CashGiven);

        float[] TempUS = Test6.MoneyExcess(CashGiven, PossibleDollarMoney, Article_Price, Total_Given);
        float[] TempEU = Test6.ConvertAndChange(AmountToGiveBack, PossibleEuroMoney);


        assertEquals(Arrays.toString(USExcess), Arrays.toString(TempUS));
        assertEquals(Arrays.toString(EUChange), Arrays.toString(TempEU));
    }

    @Test
    public void Test7() {

        float[] CashGiven = new float[]{3, 2, 3, 2, 9, 7, 4, 8};
        float[] USExcess = new float[]{0, 0, 1, 2, 5, 1, 1, 0};
        float[] EUChange = new float[]{0, 0, 1, 2, 0, 0, 0, 1, 0};

        Article_Price = 91.83f;
        Total_Given = 100.23f;

        float AmountToGiveBack = Total_Given - Article_Price;

        MediumChangeProblem Test7 = new MediumChangeProblem(Article_Price, Total_Given, CashGiven);

        float[] TempUS = Test7.MoneyExcess(CashGiven, PossibleDollarMoney, Article_Price, Total_Given);
        float[] TempEU = Test7.ConvertAndChange(AmountToGiveBack, PossibleEuroMoney);


        assertEquals(Arrays.toString(USExcess), Arrays.toString(TempUS));
        assertEquals(Arrays.toString(EUChange), Arrays.toString(TempEU));
    }

    @Test
    //issue
    public void Test8() {

        float[] CashGiven = new float[]{3, 13, 26, 6, 243, 900, 632, 700};
        float[] USExcess = new float[]{3, 3, 0, 4, 2, 1, 1, 0};
        float[] EUChange = new float[]{3, 1, 1, 4, 1, 0, 0, 0, 1};

        Article_Price = 420.69f;
        Total_Given = 515.35f;

        float AmountToGiveBack = Total_Given - Article_Price;

        MediumChangeProblem Test = new MediumChangeProblem(Article_Price, Total_Given, CashGiven);

        float[] TempUS = Test.MoneyExcess(CashGiven, PossibleDollarMoney, Article_Price, Total_Given);
        float[] TempEU = Test.ConvertAndChange(AmountToGiveBack, PossibleEuroMoney);


        assertEquals(Arrays.toString(USExcess), Arrays.toString(TempUS));
        assertEquals(Arrays.toString(EUChange), Arrays.toString(TempEU));
    }

    @Test
    public void Test9() {

        float[] CashGiven = new float[]{4, 6, 8, 4, 32, 50, 3, 1};
        float[] USExcess = new float[]{1, 0, 1, 4, 3, 0, 1, 0};
        float[] EUChange = new float[]{1, 0, 1, 0, 0, 0, 0, 0, 3};

        Article_Price = 167.36f;
        Total_Given = 197.16f;

        float AmountToGiveBack = Total_Given - Article_Price;

        MediumChangeProblem Test = new MediumChangeProblem(Article_Price, Total_Given, CashGiven);

        float[] TempUS = Test.MoneyExcess(CashGiven, PossibleDollarMoney, Article_Price, Total_Given);
        float[] TempEU = Test.ConvertAndChange(AmountToGiveBack, PossibleEuroMoney);


        assertEquals(Arrays.toString(USExcess), Arrays.toString(TempUS));
        assertEquals(Arrays.toString(EUChange), Arrays.toString(TempEU));
    }

    @Test
    public void Test10() {

        float[] CashGiven = new float[]{12, 0, 0, 0, 9, 0, 2, 8};
        float[] USExcess = new float[]{8, 0, 0, 0, 7, 0, 2, 8};
        float[] EUChange = new float[]{6.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f};

        Article_Price = 35.18f;
        Total_Given = 197.16f;

        float AmountToGiveBack = Total_Given - Article_Price;


        MediumChangeProblem Test = new MediumChangeProblem(Article_Price, Total_Given, CashGiven);

        float[] TempUS = Test.MoneyExcess(CashGiven, PossibleDollarMoney, Article_Price, Total_Given);
        float[] TempEU = Test.ConvertAndChange(AmountToGiveBack, PossibleEuroMoney);


        assertEquals(Arrays.toString(USExcess), Arrays.toString(TempUS));
        assertEquals(Arrays.toString(EUChange), Arrays.toString(TempEU));
    }

    @Test
    public void Test11() {

        float[] CashGiven = new float[]{5, 3, 0, 1, 1, 7, 2, 4};
        float[] USExcess = new float[]{1, 0, 0, 0, 1, 7, 0, 2};
        float[] EUChange = new float[]{0, 1, 1, 2, 1, 0, 1, 0, 2};

        Article_Price = 111.11f;
        Total_Given = 132.09f;

        float AmountToGiveBack = Total_Given - Article_Price;

        MediumChangeProblem Test = new MediumChangeProblem(Article_Price, Total_Given, CashGiven);

        float[] TempUS = Test.MoneyExcess(CashGiven, PossibleDollarMoney, Article_Price, Total_Given);
        float[] TempEU = Test.ConvertAndChange(AmountToGiveBack, PossibleEuroMoney);


        assertEquals(Arrays.toString(USExcess), Arrays.toString(TempUS));
        assertEquals(Arrays.toString(EUChange), Arrays.toString(TempEU));
    }

    @Test
    public void Test12() {

        float[] CashGiven = new float[]{2, 1, 3, 0, 7, 0, 4, 48};
        float[] USExcess = new float[]{2, 1, 0, 0, 0, 0, 3, 0};
        float[] EUChange = new float[]{2, 0, 0, 2, 0, 0, 1, 0, 3};

        Article_Price = 17.27f;
        Total_Given = 67.43f;

        float AmountToGiveBack = Total_Given - Article_Price;

        MediumChangeProblem Test = new MediumChangeProblem(Article_Price, Total_Given, CashGiven);

        float[] TempUS = Test.MoneyExcess(CashGiven, PossibleDollarMoney, Article_Price, Total_Given);
        float[] TempEU = Test.ConvertAndChange(AmountToGiveBack, PossibleEuroMoney);


        assertEquals(Arrays.toString(USExcess), Arrays.toString(TempUS));
        assertEquals(Arrays.toString(EUChange), Arrays.toString(TempEU));
    }

    @Test
    public void Test13() {

        float[] CashGiven = new float[]{1, 6, 0, 7, 3, 8, 4, 24};
        float[] USExcess = new float[]{1, 5, 0, 6, 0, 1, 1, 1};
        float[] EUChange = new float[]{3, 0, 0, 3, 1, 2, 0, 1, 3};

        Article_Price = 12.82f;
        Total_Given = 88.99f;

        float AmountToGiveBack = Total_Given - Article_Price;

        MediumChangeProblem Test = new MediumChangeProblem(Article_Price, Total_Given, CashGiven);

        float[] TempUS = Test.MoneyExcess(CashGiven, PossibleDollarMoney, Article_Price, Total_Given);
        float[] TempEU = Test.ConvertAndChange(AmountToGiveBack, PossibleEuroMoney);


        assertEquals(Arrays.toString(USExcess), Arrays.toString(TempUS));
        assertEquals(Arrays.toString(EUChange), Arrays.toString(TempEU));
    }

    @Test
    public void Test14() {

        float[] CashGiven = new float[]{0, 6, 0, 7, 1, 4, 4, 3};
        float[] USExcess = new float[]{0, 1, 0, 4, 1, 4, 4, 2};
        float[] EUChange = new float[]{0, 1, 0, 2, 0, 2, 0, 1, 4};

        Article_Price = 53;
        Total_Given = 67.88f;

        float AmountToGiveBack = Total_Given - Article_Price;

        MediumChangeProblem Test = new MediumChangeProblem(Article_Price, Total_Given, CashGiven);

        float[] TempUS = Test.MoneyExcess(CashGiven, PossibleDollarMoney, Article_Price, Total_Given);
        float[] TempEU = Test.ConvertAndChange(AmountToGiveBack, PossibleEuroMoney);


        assertEquals(Arrays.toString(USExcess), Arrays.toString(TempUS));
        assertEquals(Arrays.toString(EUChange), Arrays.toString(TempEU));
    }

    @Test
    public void Test15() {

        float[] CashGiven = new float[]{0, 0, 0, 0, 64, 4, 4, 3};
        float[] USExcess = new float[]{0, 0, 0, 0, 37, 1, 1, 2};
        float[] EUChange = new float[]{0, 0, 1, 2, 1, 2, 0, 0, 2};

        Article_Price = 7.2f;
        Total_Given = 16.63f;

        float AmountToGiveBack = Total_Given - Article_Price;

        MediumChangeProblem Test = new MediumChangeProblem(Article_Price, Total_Given, CashGiven);

        float[] TempUS = Test.MoneyExcess(CashGiven, PossibleDollarMoney, Article_Price, Total_Given);
        float[] TempEU = Test.ConvertAndChange(AmountToGiveBack, PossibleEuroMoney);


        assertEquals(Arrays.toString(USExcess), Arrays.toString(TempUS));
        assertEquals(Arrays.toString(EUChange), Arrays.toString(TempEU));
    }

}