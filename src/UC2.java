public class UC2 {
    public static void main(String[] args){
        int total_Amount = 100;
        int bet =1;
        int gameAmount =(int) Math.floor(Math.random() * 10) %2;
        System.out.println(gameAmount);
        if (bet ==gameAmount) {
            System.out.println("Gambler win the game");
            total_Amount++;
        }else {
            System.out.println("Gambler loss the game");
            total_Amount--;
        }
        System.out.println("the total amount of gambler are: "+ total_Amount);
        }
    }

