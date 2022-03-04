public class Main{
 public static void main (String[] args) {
        /* create a recursion object*/
        Main recursion = new Main();
        var rec = recursion.Factorial(4);
        System.out.print(rec);
    }
    public int Factorial(int n){
        // looking out for unintentional cases
        if(n < 0){
            return -1;
        }
        // base case 
        if (n == 0 || n==1){
            return 1;
        }
        /*recursive case
        finally ends in Factorial(1), which equals 1
        from Factorial(1) = 1 , we know that factorial 2 = 2*(factorial(1))
        and 2*1 = 2;
        and then factorial 3 = 3*(factorial (2));
        which is 3*2 =6;
        And then Factorial 4 = 4*(Factorial (3));
        whic is 4 * 6 = 24;
        */
        return n * Factorial(n-1);
    }
}
