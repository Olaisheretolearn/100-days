class Main {
public static void main (String [] args){
  Main main = new Main();
  var res = main.DecimalToBinary (10);
  System.out.println(res);
  
}
  public int DecimalToBinary (int n ){
    if (n == 0){
      return 0;
    }
    return (n%2 + 10* DecimalToBinary (n/2));
  }
}

/*

*/
