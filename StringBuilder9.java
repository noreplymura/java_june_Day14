import java.util.StringTokenizer;
public class StringBuilder9 {
public static void main(String[] args) {
    StringTokenizer st = new StringTokenizer("my,name,is,Murali");
    System.out.println("Next token is:" + st.nextToken(","));
    System.out.println("Next token is:" + st.nextToken(","));
    System.out.println("Next token is:" + st.nextToken(","));
    System.out.println("Next token is:" + st.nextToken(","));
}
}