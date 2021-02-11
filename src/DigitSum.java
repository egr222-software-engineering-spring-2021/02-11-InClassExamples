public class DigitSum {
    public static void main(String[] args) {
        System.out.println(digitMin(29107));
        System.out.println(digitMin(-456));
    }

    private static int digitSum(int num){
        if (num < 0) num *= -1;

        int sum = 0;
        while (num > 0){
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }

    private static int digitMin(int num) {
        if (num == 0) return 0;

        if (num < 0) num *= -1;

        // loop through all the digits and save the minimum
        int minDigit = 9;
        while (num > 0){
            int j = num % 10;
            if (j < minDigit) minDigit = j;
            num = num / 10;
        }

        return minDigit;
    }
}
