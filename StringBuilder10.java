import java.util.StringTokenizer;

public class StringBuilder10 {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Demonstrating methods from StringTokenizer class", "");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
