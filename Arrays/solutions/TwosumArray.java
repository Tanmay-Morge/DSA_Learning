/*Given an integer array nums and an integer target, 
return the indices of the two numbers such that they add up to the target.*/

public class TwosumArray {
    public static void main(String [] args){
        int arr[]={2,7,11,15};
        int target = 9;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}
