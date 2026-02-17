import java.util.Scanner;
class Sum {
    public static void main(String[] args) {
        int n , sum = 0;
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
            try {
                for (int i=1 ; i<=n;i++){
                    sum += n/i; //by default declared in java , it is arthematic exception , IO exception
                }
            }
            catch (ArithmeticException e) {
                System.out.println(e);
            }
        }
        System.out.println(sum);
    }
}