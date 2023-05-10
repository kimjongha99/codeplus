package divisor;

public class PrimeNumber {

    static boolean prime (int n){
        if(n<2){
            return false;
        }
        for(int i=2; i*i<=n ; i++){  // i<=n/2 해도 무방하지만 i*i<=n까지하는이유는 반절 까지했는데 n의 나머지가 1이 되는 수가없다면 없는것이다.
            if(n%i==0){
                return  false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(prime(7));
    }
}
