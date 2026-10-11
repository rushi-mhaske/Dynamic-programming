import java.util.Scanner;

public class Fibonacci {


    public int fib(int n){
        if(n <= 1){
            return n;
        }

        int dp [] = new int[n + 1];

        dp[0]= 0;
        dp[1]= 1;
        
        for(int i = 2; i <= n; i++){
           dp[i] = dp[i-1] + dp[i -2];
        }

        return dp[n];
    }


    public static void main(String x[]){

        Fibonacci f = new Fibonacci();


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");

        int n = sc.nextInt();

        int result = f.fib(n);
        System.out.println(result);


    }
    
}
