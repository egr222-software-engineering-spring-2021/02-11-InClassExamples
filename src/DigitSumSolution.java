public class DigitSumSolution {

    public static void main(String[] args) {
        System.out.println(digitSum(29107));
        System.out.println(digitSum(-456));
    }

    public static int digitSum(int num) {
        if (num < 0) num *= -1; //make it a positive integer
        int sum = 0;
        while (num > 0) {
            int d = num % 10; //extract the last digit
            sum += d; //process the last digit
            num /= 10; //chop off the last digit (because it is already processed)
        }
        return sum;
    }

    public static int digitMin(int num) {
        if (num == 0) {
            return 0;
        }
        if (num < 0) {
            num *= -1; //make it a positive integer
        }

        int min = 9; //initialize with the highest possible digit
        while (num > 0) {
            int d = num % 10; //extract the last digit
            if (d < min) {
                min = d; //process the last digit by updating the min to the last digit
            }
            num /= 10; //chop off the last digit (because it is already processed)
        }
        return min;
    }

    public static int digitMin2(int num) {
        if (num < 0) {
            num *= -1; //make it a positive integer
        }
        int min = 9; //initialize with the highest possible digit
        do {
            int d = num % 10; //extract the last digit
            if (d < min) {
                min = d; //process the last digit by updating the min to the last digit
            }
            num /= 10; //chop off the last digit (because it is already processed)
        } while (num > 0);

        return min;
    }

    public static int digitMin3(int num) {
        if (num < 0) {
            num *= -1; //make it a positive integer
        }
        int min = num % 10; //initialize with the first digit
        num /= 10;
        while (num > 0) {
            int d = num % 10; //extract the last digit
            if (d < min) {
                min = d; //process the last digit by updating the min to the last digit
            }
            num /= 10; //chop off the last digit (because it is already processed)
        }
        return min;
    }
}