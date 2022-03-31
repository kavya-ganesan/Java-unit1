import java.util.*;
public class fact{
    public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int m=1;
      for(int i=n;i>=1;i--){
           m*=i;

}
      System.out.println(m);
      
    }
}
