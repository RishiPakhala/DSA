    public class LinearSearch {
        public static void main(String[] args) {
            int[] arr={-3,0,1,3,4};
            int n=arr.length;
            int result=Sort(arr,n);
            System.out.println("Result: "+result);
        }
        static int Sort(int arr[],int n) {
            for(int i=0;i<n;i++) {
                if(arr[i]==i) {
                    return i;
                }
            }
            return -1;
        }
    }
