public class MediumChangeProblem {


    private float AmountToGiveBack;
    private float PriceOfArticle;
    private float TotalAmountGiven;
    private float[] GivenCash;

    public void setAmountToGiveBack(float amountToGiveBack) {
        AmountToGiveBack = amountToGiveBack;
    }

    public float getAmountToGiveBack() {
        return AmountToGiveBack;
    }

    /**
     * Class constructor
     *
     * @param articleprice price of the article
     * @param totalgiven   cash given by the customer
     * @param cashgiven    list of dollar bills and coins given
     */
    public MediumChangeProblem(float articleprice, float totalgiven, float[] cashgiven) {
        PriceOfArticle = articleprice;
        TotalAmountGiven = totalgiven;
        GivenCash = cashgiven;
    }


    /**
     * This method is used to compute if the cashier can give back some of the dollar change back to the customer
     *
     * @param USBillsAndCoinsGiven list of dollar bills and coins given
     * @param USBillsAndCoins      list of possible dollar cash
     * @param ArticlePrice         price of the article
     * @param MoneyGiven           cash given by the customer
     * @return A list of floats representing the dollars to return
     */
    public float[] MoneyExcess(float[] USBillsAndCoinsGiven, float[] USBillsAndCoins, float ArticlePrice, float MoneyGiven) {

        AmountToGiveBack = MoneyGiven - ArticlePrice;

        float[] DollarBillsToReturn = new float[8];

        int count = 0;

        boolean run = true;

        while (run) {

            if (AmountToGiveBack == 0) {

                run = false;
            }
            if (USBillsAndCoinsGiven[count] != 0 && getAmountToGiveBack() >= USBillsAndCoins[count]) {

                AmountToGiveBack -= USBillsAndCoins[count];

                USBillsAndCoinsGiven[count] += -1;

                DollarBillsToReturn[count] += 1;

            } else {
                count++;
            }

            if (count == USBillsAndCoins.length) {

                run = false;
            }


        }


        return DollarBillsToReturn;
    }

    /**
     * The method is used to convert in euro the excess money thant can't be return in dollar.
     *
     * @param Dollars
     * @param EuroList
     * @return
     */

    public float[] ConvertAndChange(float Dollars, float[] EuroList) {

        float Euro = Dollars * 0.84f;
        float[] EuroBillsToGive = new float[9];

        if (Dollars == 0) {
            return EuroBillsToGive;
        }

        for (int i = 0; i < EuroList.length; i++) {
            while (EuroList[i] <= Euro) {
                Euro = Euro - EuroList[i];
                EuroBillsToGive[i] += 1;
                Euro = Math.nextUp(Euro); //used to round properly
            }
        }
        return EuroBillsToGive;
    }


    /**
     * Used to nicely print information when ran as an interactive code.
     *
     * @param BillsToGive
     * @param PossibleBills
     * @param Currency
     */
    public void MoneyInfo(float[] BillsToGive, float[] PossibleBills, String Currency) {

        if (Currency.equals("dollars")) {
            for (int k = 0; k < BillsToGive.length; k++) {
                if (BillsToGive[k] != 0) {
                    if (PossibleBills[k] >= 1) {
                        System.out.println(BillsToGive[k] + " bill(s) of " + PossibleBills[k] + " dollar.");
                    }
                    if (PossibleBills[k] < 1) {
                        System.out.println(BillsToGive[k] + " coin(s) of " + PossibleBills[k] * 100 + " centimes.");
                    }
                }
            }
        } else if (Currency.equals("euros")) {
            for (int k = 0; k < BillsToGive.length; k++) {
                if (BillsToGive[k] != 0) {
                    if (PossibleBills[k] >= 1) {
                        System.out.println(BillsToGive[k] + " bill(s) of " + PossibleBills[k] + " euro.");
                    }
                    if (PossibleBills[k] < 1) {
                        System.out.println(BillsToGive[k] + " coin(s) of " + PossibleBills[k] * 100 + " centimes.");
                    }
                }
            }
        }
    }

}


