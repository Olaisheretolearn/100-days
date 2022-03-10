public class Main {
public static void main (String[] args){
        Main main = new Main();
        int[] arr =  {1,2,3,4,5};
        int n = arr.length;
        var res = main.productofArray(arr,n);
        System.out.println(res);
        System.out.println(n);
    }
    public int productofArray( int []arr, int n) 
    { 
    //   TODO
    if(n == 0){
        return arr[n]; 
    }
    //recursive case 
    return arr[n-1] * productofArray(arr, n-1);
    } 
}
