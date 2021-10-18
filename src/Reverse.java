class Reverse {
    static void reverse(int arr[],int n){
        int low =0;
        int high=n-1;
        while(low<high){
            int temp= arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }
    public static void main(String args[]){
        int arr[]={2,3,23,78,80,90};
        int n=6;
        System.out.println("Before reverse: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        reverse(arr,n);
        System.out.println("after reverse");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}

