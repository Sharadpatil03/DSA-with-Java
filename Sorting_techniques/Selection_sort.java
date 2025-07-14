package Sorting_techniques;

import java.util.*;

public class Selection_sort {

    public static void  selectionSort(int arr[]){
        int n=arr.length;
        boolean didSwap=false;  //flag to check  if array is already sorted or not.
        for(int i=0; i<=n-2; i++){
            int mini=i;

            for(int j=i+1; j<n; j++){
                if(arr[j] <arr[mini]){
                    mini=j;
                    didSwap=true;
                }
            }

            if(!didSwap){
                return;
            }

            // now swap
            if(mini!=i){
                int temp=arr[i];
                arr[i]=arr[mini];
                arr[mini]=temp;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Selection sort :");

        // Selection sort: select the minimum element and swap it with the first element in an array and then move foreward
        
       Scanner sc= new Scanner(System.in);
       int n=sc.nextInt();

        int arr[]= new int[n];

        //take array as input
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        //call selection sort function
        selectionSort(arr);

        //printing sorted array
         for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
        

    }
}
