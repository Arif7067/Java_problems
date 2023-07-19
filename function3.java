// Write a program to enter the numbers till the user wants and at the end it
//should display the count of positive, negative and zeros entered.
import java.util.*;

public class function3 {
    public static List<Integer> posNegZeros(ArrayList<Integer> list){
        Iterator itr = list.iterator();
        int countp =0;
        int countn=0;
        int countz=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i) > 0){
                countp++;
            } else if (list.get(i)<0) {
                countn++;
            } else if (list.get(i)==0) {
                countz++;
            }
        }
        List<Integer> values = new ArrayList<Integer>();

        values.add(countp);
        values.add(countn);
        values.add(countz);
        return values;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many no. you want to enter : ");
        int n = sc.nextInt();
        ArrayList<Integer> l = new ArrayList<Integer>();
        int a =0;
        while(n>0){
            a = sc.nextInt();
            l.add(a);
            n--;
        }
        List<Integer> ans = new ArrayList<Integer>();
        ans = posNegZeros(l);
        Iterator itr = ans.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
