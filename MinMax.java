public class MaxMin {
    int arr[] = {23, 12, 43, 6, 21};

    public static void max() {
        int arr[] = {23, 12, 43, 6, 21};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public static void min() {
        int arr[] = {23, 12, 43, 6, 21};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        int arr[] = {23, 12, 43, 6, 21};

        max();
        min();
    }
}

