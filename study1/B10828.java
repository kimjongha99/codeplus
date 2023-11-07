package study1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B10828 {

    static ArrayList<Integer> stackList; // 어레이리스트의 사이즈는어캐정함?

    static void push(int n) {
        stackList.add(n);

    }
    static void top(){
        if (stackList.isEmpty()) {
            System.out.println("-1");
        } else {
            System.out.println(stackList.get(stackList.size() - 1)); // 수정
        }

    }
    static void pop() {
        if(stackList.isEmpty()){
            System.out.println("-1");
        }else{
            System.out.println(stackList.remove(stackList.size() - 1)); // 수정
        }
    }
    static  void size(){
        System.out.println(stackList.size()); // 수정
    }
    static  void empty(){
        System.out.println(stackList.isEmpty() ? 1 : 0); // 수정

    }
        public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
        int tc = Integer.parseInt(st.nextToken());
        stackList= new ArrayList<>();
        for (int t = 0; t < tc; t++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            switch (str){
                case "push":
                    int n = Integer.parseInt(st.nextToken());
                    push(n);
                    break;
                case "top":
                    top();
                    break;
                case "pop":
                    pop();
                    break;
                case "size":
                    size();
                    break;
                case "empty":
                    empty();
                    break;
            }
        }

    }
}
