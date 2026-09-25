import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            char c = sc.next().charAt(0);
            String s = sc.next();
 
            int ans = 0;
 
            int i = 0;
            int j = n - 1;
 
            while (i < j) {
                if (s.charAt(i) != s.charAt(j)) {
                    if (s.charAt(i) == c || s.charAt(j) == c) {
                        ans++;
                    } else {
                        ans += 2;
                    }
                }
 
                i++;
                j--;
            }
 
            System.out.println(ans);
        }
    }
}