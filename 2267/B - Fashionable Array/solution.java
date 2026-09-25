import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder out = new StringBuilder();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] freq = new int[101];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                freq[arr[i]]++;
            }
 
            int maxFreq = 0;
            for (int v = 1; v <= 100; v++) {
                if (freq[v] > maxFreq) 
                    maxFreq= freq[v];
            }
            
            List<Integer> list = new ArrayList<>();
 
            for (int v = 100; v >= 1; v--) 
            {
                if (freq[v] > 0) list.add(v);
            }
 
            StringBuilder sb = new StringBuilder();
            for (int lvl = 1; lvl <= maxFreq; lvl++) 
            {
                for (int v : list) 
                {
                    if (freq[v] >= lvl) 
                    {
                        sb.append(v).append(' ');
                    }
                }
            }
            System.out.println(sb.toString());
        }
        System.out.print(out);
    }
}