import java.util.*;
public class ncube {
    public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
     int sum=0; 
      for(int i=1;i<=n;i++){
              sum+=i*i*i;
}
      System.out.println(sum);
      
    }
}