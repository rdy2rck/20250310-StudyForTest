package Java;

public class Java4 {
  public static void main(String[] args) {
    int ary[][] = new int[('a')][('b')];
    int n = 1;
    for(int i=0; i<3; i++) {
      for(int j=0; j<5; j++) {
        ary[i][j] = j*3 + i+1;
        System.out.println(ary[i][j] + " ");
      }
      System.out.println();
    }
  }
  
}
