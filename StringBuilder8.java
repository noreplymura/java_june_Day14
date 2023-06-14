import java.util.StringTokenizer;
class StringBuilder8 {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("my,name,is,Murali");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
