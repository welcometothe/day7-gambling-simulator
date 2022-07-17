
public class UC5
{
    public static void main(String[] args)
    {

        int total_Stake_Amount = 100;
        int bet_Amount = 1;
        int winning = 0;
        int stake_Upper = 0;
        int stake_Lower = 0;

        for (int days = 1; days <= 30; days++)
        {
            while (total_Stake_Amount > stake_Lower && total_Stake_Amount < stake_Upper)
            {
                int gameAmount = (int) (Math.floor(Math.random() * 10)) % 2;



                if (bet_Amount == gameAmount)
                {
                    total_Stake_Amount = total_Stake_Amount + bet_Amount;
                }

                else {
                    total_Stake_Amount = total_Stake_Amount - bet_Amount;
                }
            }
            if (total_Stake_Amount == stake_Upper)
            {
                System.out.println("Player has won gambler for day " +days);
                winning += 50;
            }
            else
            {
                System.out.println("Player has won gambler for day " +days);
                winning -= 50;
            }

            System.out.println("Total win price " + winning + "\n");

        }
    }
}