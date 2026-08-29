import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        long MOD = 1000000007;
        long ans = 1;
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                ans = (ans * count) % MOD;
                count = 1;
            }
        }
        ans = (ans * count) % MOD;
        System.out.println(ans);
    }
}
