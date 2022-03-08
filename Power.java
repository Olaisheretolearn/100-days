class Main {
  public static void main(String[] args) {
    Main main = new Main();
    var rec = main.Power(2,5);
    System.out.println(rec);
  }
  public int Power(int base , int exp){
    if(exp == 0){
      return 1;
    }
    return base * Power( base, exp-1);
  }
}
