class Level5 {

    int arr[];

    Level5(int arr[]) {
        this.arr = arr;
    }

    void checkDuplicate() {
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
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

        Level5 obj = new Level5(arr);
        obj.checkDuplicate();
    }
}
