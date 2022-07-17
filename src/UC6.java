public class UC6
{
    public static void main(String[] args)
    {
        int total_Stake_Amount = 100;
        final  int BET_AMOUNT = 1;
        int winDays = 0;
        int lossDays = 0;
        int win = 0;
        int loss = 0;
        int winMax = 0;
        int lossMax = 0;
        int luckyDay = 0;
        int unluckyDay = 0;


        int winning = 0;
        int stake_Upper = 150;
        int stake_Lower = 50;

        for (int days = 1; days <= 30; days++) {
            total_Stake_Amount = 100;

            while (total_Stake_Amount > stake_Lower && total_Stake_Amount < stake_Upper) {
                int gameAmount = (int) (Math.floor(Math.random() * 10)) % 2;

                //System.out.println("Gambler received amount : " + gameAmount);

                if (BET_AMOUNT == gameAmount) {
                    // System.out.println("Gambler won the current game");
                    total_Stake_Amount = total_Stake_Amount + BET_AMOUNT;
                    win++;
                    // System.out.println("Total Current cash of gambler has : " + total_Stake_Amount);

                } else {
                    //System.out.println("Gambler lost the  current game");
                    total_Stake_Amount = total_Stake_Amount - BET_AMOUNT;
                    loss++;
                    //System.out.println("Total Current cash of gambler has : " + total_Stake_Amount);
                }
            }
            if (total_Stake_Amount == stake_Upper) {
                winDays += 1;
                winning += 50;
            } else {
                lossDays += 1;
                winning -= 50;
            }
            if (win > winMax) {
                winMax = win;
                luckyDay = days + 1;
            }
            if (loss > lossMax) {
                lossMax = loss;
                unluckyDay = days + 1;
            }
            win = 0;
            loss = 0;
        }
        System.out.println("The Luckiest day is : " + "Day " + luckyDay);
        System.out.println("The Unluckiest day is : " + "Day " + unluckyDay);
        System.out.println("Total win days : " + winDays);
        System.out.println("Total loss days : " + lossDays);
        System.out.println("Total win price won in month is : " + winning + "\n");
    }
}
