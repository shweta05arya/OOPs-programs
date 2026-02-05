class Level3 {

    void checkDuplicate(int arr[], int n) {

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
        int arr[] = {1, 2, 3, 2};

        Level3 obj = new Level3();
        obj.checkDuplicate(arr, arr.length);
    }
}
