import java.util.*;

public class kidwithGreatestNoofCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        int s =0;
        for(int i=0;i<n;i++){
            if(s<candies[i]){
                s=candies[i];
            }
        }
        List <Boolean> list = new ArrayList<Boolean>();
        for(int i=0;i<n;i++){
            if(extraCandies+candies[i]>=s){
                list.add(Boolean.TRUE);
            } else{
                list.add(Boolean.FALSE);
            }
        }
        return list;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of people with candies you want to mention : ");
        int n = sc.nextInt();
        int candies[] =new int[n];
//        ArrayList <Integer> candies = new ArrayList<Integer>();
//        int s=0;
        for(int i =0; i<n; i++){
//            s = sc.nextInt();
            candies[i] = sc.nextInt();
        }
        System.out.print("Eneter the extra candies : ");
        int extraCandies = sc.nextInt();
        System.out.println("The list is : "+ kidsWithCandies(candies, extraCandies));

    }
}