package problems;

public class RevNum {
    public static void main(String[] args) {
        System.out.println(revNum(123123));
    }
    private static int revNum(int num) {
        if (num < 0) {
            throw new RuntimeException();
        }
        int quo = num/10;
        int rem = num%10;
        int res = 0;
        num = quo;
        while (quo != 0) {
            res = (res*10)+rem;
            quo = num/10;
            rem = num%10;
            num = quo;
            if (quo == 0) {
                res = (res*10)+rem;
            }
        }
        return res;
    }
}
