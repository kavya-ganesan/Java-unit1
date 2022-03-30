import java.util.*;
public class arm {
    public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int num=n;
      int sum=0;
      while(n!=0){
          int rem =n%10;
          sum+=rem*rem*rem;
          n=n/10;
      }
     System.out.println(sum);
     if(num==sum){
          System.out.println("armstrong");
}
     else{
          System.out.println("not armstrong");
}
}
}