import java.util.Scanner;

public class canPlanFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count =0;
        for(int i=0; i<flowerbed.length; i++){
            if(flowerbed[i]==0){
                int prev = (i==0 || flowerbed[i-1]==0)?0:1;
                int next = (i==flowerbed.length-1 || flowerbed[i+1]==0)?0:1;

                if(prev==0 && next==0){
                    flowerbed[i]=1;
                    count++;
                }
            }
        }
        return count>=n;
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the total people with and without plant u want: ");
        int n = scn.nextInt();
        System.out.println("Enter 0 if no plant , enter 1 if there is plant");
        int plant[] = new int[n];
        for(int i=0;i<n;i++){
            plant[i] = scn.nextInt();
        }
        System.out.print("How many more plant youwant to plat in this group : ");
        int extra = scn.nextInt();
        boolean ans = canPlaceFlowers(plant, extra);
        if(ans==true){
            System.out.println("Possible to put "+extra+" plant in this group");
        } else if(ans==false){
            System.out.println("Not possible sorry for that");
        }
    }
}
