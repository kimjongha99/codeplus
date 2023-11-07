import java.io.*;
import java.util.StringTokenizer;

public class test {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String x =st.nextToken();

        String y = st.nextToken();


        System.out.println(x);
        System.out.println(y);


        int arr[]=new int[10];

        arr[0] = x.charAt(0)-'0';
        arr[1] = x.charAt(1)-'0';


        System.out.println(arr[0]);
        System.out.println(arr[1]);


        System.out.println(arr[0]+arr[1]);

        int digit = Integer.parseInt(x) % 10;
        int nextNumber = (int) Math.pow(digit,Integer.parseInt( y));


        System.out.println(nextNumber);
    }
}