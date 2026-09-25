import java.util.*;
 
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) 
        {
            int n = sc.nextInt();
            int x = sc.nextInt();
 
            int[] a = new int[n];
 
            for (int i = 0; i < n; i++) 
            {
                a[i] = sc.nextInt();
            }
 
            long ans = 0;
            int temp = x;
 
            for (int p = 2; p * p <= temp; p++) 
            {
                if (temp % p == 0) 
                {
                    long sum = 0;
 
                    for (int i = 0; i < n; i++) 
                    {
                        if (a[i] % p == 0) 
                        {
                            sum += a[i];
                        }
                    }
 
                    ans = Math.max(ans, sum);
 
                    while (temp % p == 0) 
                    {
                        temp /= p;
                    }
                }
            }
 
            if (temp > 1) 
            {
                long sum = 0;
 
                for (int i = 0; i < n; i++) 
                {
                    if (a[i] % temp == 0) 
                    {
                        sum += a[i];
                    }
                }
 
                ans = Math.max(ans, sum);
            }
 
            System.out.println(ans);
        }
    }
}