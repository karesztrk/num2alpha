public class SequenceGenerator {

    private static final int MOD = 'Z' - 'A' + 1;

    static String num2alpha(int number) {
        if (number < MOD) {
            return String.valueOf((char) (number % MOD + 'A'));
        }
        return num2alpha(number / MOD - 1) + num2alpha(number - ((number / MOD) * MOD));
    }
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            System.out.println(num2alpha(i));
        }
    }
}
