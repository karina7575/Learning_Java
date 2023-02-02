public class Gambler
{
    public static void main (String[] args)
    {
        int stake = 500, goal = 2500, trials = 100, bets = 0;
        int wins = 0;
        for (int t = 0; t < trials; t++)
            //проведение одного опыта
        {
            int cash = stake;
            while (cash>0 && cash<goal)
                //моделирование одной ставки
            {
                bets++;
                if (Math.random() < 0.5) cash++;
                else cash--;
            }//сумма достигает 0(разорение) или $goal (победа)
            if (cash == goal) wins++;
        }
        System.out.println(100*wins/trials + "% wins");
        System.out.println("Avg # bets: " + bets/trials);
    }
}
