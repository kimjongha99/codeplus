package divisor;
//에라토스테네스의 체.
public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int prime[] = new int[100];  //소수 저장 지정.
        int pn =0; //소수의 개수
        boolean check[] = new boolean[101]; //지워졌으면 트루
        int n = 100; // 100 지정. (1~100까지의 숫자중 소수 찾아라)
        for(int i=2; i<=n; i++){
            if(check[i] ==false){
                prime[pn++] =i;
                for (int j= i*i;j<=n; j+=i){
                    check[j]=true;
                }
            }
        }
        System.out.println(pn);
    }
}
