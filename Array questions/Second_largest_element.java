class Solution {
    public int getSecondLargest(int[] arr) {
        
        
        // Brute force : sort the array and then start iterating from end and find second unique element
        // TC: o(nlof(n)) + o(n)   => o(n(log(n)))
        
        int n=arr.length;
        
        
        //optimal sol : 
        // 12, 35, 1, 10, 34, 1
        // at start lar=-1, slar=-1
        // then start with first ele, then if the curr element is greater than largest 
        // then first slargest=largest   and    largest=curr
        
        int slargest=-1;
        int largest=-1;
        for(int i=0; i<n; i++){
            
            if(arr[i]> largest){
                slargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>slargest && arr[i]<largest){
                slargest=arr[i];
            }
        }
        return slargest;
        
    }
}


