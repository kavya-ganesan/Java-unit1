import java.util.*;
public class fibo {
    public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
     int a=0;
     int b=1;
     int s=0;
      System.out.println(a);
       System.out.println(b);
      for(int i=2;i<n;i++){
              s=a+b;
              System.out.println(s);
              a=b;
              b=s;
              
}
     
    }
}