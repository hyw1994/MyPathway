public class LopsidedNumberTriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.print('\n');
        }
    }
}