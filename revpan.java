import java.util.*;
public class revpan {
    public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int num=n;
      int rev=0;
      while(n!=0){
          int rem =n%10;
          rev=rev*10+rem;
          n=n/10;
      }
     System.out.println(rev);
     if(num==rev){
           System.out.println("palindrome");
    }
    else{
          System.out.println("not");
}
}
}
