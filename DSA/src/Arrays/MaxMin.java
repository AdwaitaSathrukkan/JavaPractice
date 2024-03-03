package Arrays;
import java.util.*;

public class MaxMin {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int nums[]=new int[size];
        for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();

        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<size;i++){
            if(min>nums[i]){
                min=nums[i];
            }
            if(max<nums[i]){
                max=nums[i];
            }
        }
        System.out.println("min is:"+min);
        System.out.println("max is:"+max);
    }
}
