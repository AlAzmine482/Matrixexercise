import java.util.HashMap;
import java.util.Map

class HelloWorld {
    public static void main(String[] args) {
        int n = 4;
        int m = 5; 
        int[][] a = { { 0, 6, 8, 9, 11 },
                 { 20, 22, 28, 29, 31 },
                 { 36, 38, 50, 61, 63 },
                 { 64, 66, 100, 122, 128 } };
        int k = 31;
        for (int i =0; i< n; i++) {
            for (int j = 0; j< m; j++) {
                if (k == a[i][j]) {
                    System.out.println("Found At (" + i + ","+ j+")");
                }
            }
        }
    }
}
