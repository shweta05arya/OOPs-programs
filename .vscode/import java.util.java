import java.util.Scanner;

class Level4 {

    int arr[];
    int n;

    void input() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    void checkDuplicate() {
        boolean found = false;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    found = true;
                    break;
                }
            }
        }

        if (found)
            System.out.println("Duplicate found");
        else
            System.out.println("No duplicate");
    }

    public static void main(String[] args) {
        Level4 obj = new Level4();
        obj.input();
        obj.checkDuplicate();
    }
}
