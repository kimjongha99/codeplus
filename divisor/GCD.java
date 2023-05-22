package divisor;

//최대공약수
public class GCD {

   static  int gcd(int a, int b){
       if(b==0){
           return a;
       }else{
           return gcd(b,a%b);
       }
   }
   static  int lcm(int a, int b){
       int gcd = gcd(a,b);

       int l= gcd*(a/gcd)*(b/gcd);
       return l;
   }
    public static void main(String[] args) {

        System.out.println(gcd(10,15));
        System.out.println(lcm(10,15));
    }
}
