import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      
      int arr[]= new int[n];
      
      //taking input   Array
      for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
      }
      
      //to print all the subarray
      
      for(int i=0;i<n; i++){
        
        for(int j=i; j<n; j++){
          
          System.out.print("[");
          
          for(int k=i; k<=j; k++){
            System.out.print(arr[k] +" ");
          }
          System.out.print("]");
          
        }
      }
      
  }
}