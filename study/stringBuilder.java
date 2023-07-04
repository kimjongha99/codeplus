package study;

public class stringBuilder {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        System.out.println(sb.append("asd"));
        System.out.println(sb.append(1));
        System.out.println(sb.reverse());
        System.out.println(sb.replace(2,3,"q"));
    }
}
