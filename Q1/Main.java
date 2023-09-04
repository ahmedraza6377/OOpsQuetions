import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array length: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("enter elements value: ");
            int num=sc.nextInt();
            if(num!=0){
                arr[i]=num;
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            ans.add(arr[i]);
            if(sum==0){
                break;
            }

        }
        if(sum==0){
            for(int ele:ans) System.out.print(ele+" ");
        }else{
            System.out.println("Elements not found");
        }
    }
}
