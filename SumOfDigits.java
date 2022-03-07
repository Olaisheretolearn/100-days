//How to find some of digit in a positive integr
public class Main {
  public static void main(String[] args){
    Main main = new Main();
    var result = main.SumOfDigits(233);
    System.out.println(result);
  }
  public int SumOfDigits(int n){
    /* i initially thought the base case should be  if n is less thab 10, But that would b wrong bwcause if the second round of rcursion is coming , it will give zero and that woould be like just getting the remainder, If it is two digits btw, Thre will giv the addition of remainder plus the division by 10 in the first cycle*/

    // Base case and unintentional case
    if(n==0|| n<0){
      return 0;
    }
    
    //Recursive case
    return n%10 + SumOfDigits(n/10);
  }
}
