package Java;

public class Java2 {
  public static void main(String[] args) {
    int j, i;
    for (j=0, i=0; i<=5; i++) {
      j += i;
      System.out.println(i);
      if (i == 5) {
        System.out.println("=");
        System.err.println(j);
      }
      else
      System.out.println("+");
    }
  }  
}
