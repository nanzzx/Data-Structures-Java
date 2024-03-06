package General_problems;
import java.util.*;

class CoinChanger {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of coins: ");
        int numCoins = scanner.nextInt();
        int[] coins = new int[numCoins];
        int[] coinCounts = new int[numCoins]; // Array to store the count of each coin used
        for (int i = 0; i < numCoins; i++) 
        {
            System.out.print("Enter the value of coin " + (i + 1) + ": ");
            coins[i] = scanner.nextInt();
        }

        System.out.print("Enter the sum: ");
        int sum = scanner.nextInt();
        CoinChanger coinChanger = new CoinChanger();
        int minCoins = coinChanger.coinChangeProblem(coins, sum, coinCounts);
        System.out.println("At least " + minCoins + " coins are required to make a value of " + sum);
        for (int i = 0; i < numCoins; i++)
        {
            if (coinCounts[i] > 0) 
            {
                System.out.println(coins[i] + " rs --> " + coinCounts[i]);
            }
        }

        scanner.close();
    }

    int coinChangeProblem(int[] coins, int sum, int[] coinCounts)
    {
        int totalCoins = coins.length;
        int[][] arr = new int[totalCoins + 1][sum + 1];

        for (int j = 0; j <= sum; j++) 
        {
            arr[0][j] = Integer.MAX_VALUE;
        }

        for (int i = 1; i <= totalCoins; i++) 
        {
            arr[i][0] = 0;
        }

        for (int i = 1; i <= totalCoins; i++)
        {
            for (int j = 1; j <= sum; j++)
            {
                if (coins[i - 1] <= j)
                {
                    arr[i][j] = min(1 + arr[i][j - coins[i - 1]], arr[i - 1][j]);
                } 
                else 
                {
                    arr[i][j] = arr[i - 1][j];
                }
            }
        }

        // Backtracking to find the counts of each coin used
        int i = totalCoins;
        int j = sum;
        while (i > 0 && j > 0)
        {
            if (arr[i][j] == arr[i - 1][j])
            {
                i--;
            } 
            else
            {
                coinCounts[i - 1]++;
                j -= coins[i - 1];
            }
        }

        return arr[totalCoins][sum];
    }

    int min(int a, int b)
    {
        return a <= b ? a : b;
    }
}
