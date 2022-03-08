/* Understand the concept of Euclidean Algorithm
and this should be straightforward*/


class Main {
public static void main (String [] args){
  Main main = new Main();
  var res = main.gcd(18,48);
  System.out.println(res);
  
}
  public int gcd (int a, int b ){
    if (b == 0){
      return a;
    }
    return gcd(b ,a%b);
  }
}

/*

*/
