import java.util.Arrays;

public class Q6 {
    public void findOne(int arr[]){
        Arrays.sort(arr);
        for(int i:arr){ System.out.println(i + " ");}
        int ans = -1;
        for(int i=0; i<arr.length-1; i+=2){
            if(arr[i] != arr[i+1]){
                ans = arr[i];
                break;
            }
        }
        if(arr[arr.length-2] != arr[arr.length-1]){
            ans = arr[arr.length-1];
        }
        System.out.println("Non-Repeated number is: " + ans);
    }
    public static void main(String[] args) {
        Q6 nm = new Q6();
        int arr[] = {1,3,5,9,5,44,3,1,9};
        nm.findOne(arr);
    }
}
