import java.util.StringTokenizer;

public class StringBuilder11 {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Hello everyone i am java Developer", "");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
