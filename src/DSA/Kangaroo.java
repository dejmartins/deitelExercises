package DSA;

public class Kangaroo {

    public String kangaroo(int x1, int v1, int x2, int v2) {
        if(v2 < v1) {
            while (x1 < x2){
                x1 += v1;
                x2 += v2;
                if(x1 == x2) return "YES";
            }
        }
        return "NO";
    }
}
