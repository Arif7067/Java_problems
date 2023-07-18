//Write a function to print the sum of all odd numbers from 1 to n
import java.util.*;

public class function2 {
    public static int sumOfOddNo(int n){
        if(n<=0){
            return -1;
        }
        int sum =0;
        for(int i=1; i<=n; i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The sum of odd numbers are "+sumOfOddNo(n));

    }
}
