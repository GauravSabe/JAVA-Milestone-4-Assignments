/**
 * test1
 */
public class test1 {

    public static void main(String[] args) {
        int n = 3;
        int sum = 0;
        for(int i = 1; i <= n; i++) 
        {
            for(int j = 1; j <= i; j++) 
            {
                sum++;
            } 
        }
        System.out.println(sum);

    }
}