import java.util.*;
public class prime {
    public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int f=0;
      for(int i=2;i<=n/2;i++){
           if(n%i==0){
             f=1;
             System.out.println("not prime");
             break;
      }
      if(f==0){
          System.out.println("prime");
    }
}
}
}