package practice;

/**
 * 质数计算
 *
 * 获取n以下的所有质数，采用的是穷举的方法，判断每一个数字是否是质数
 * Created by Kerry on 16/9/19.
 */
public class Prime {

    public static boolean isPrime(int n) {
        if(n == 1) return false;

        for (int i = 2; i <= n/2; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }

    public static void getPrime(int n) {
        for (int i = 1;; i++) {
            if(isPrime(i)) {
                System.out.println(i + "");
            }
            if(i == n) break;
        }
    }

    public static void main(String[] args) {
        getPrime(11);
    }
}
