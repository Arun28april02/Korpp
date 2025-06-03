package Javaworld;
class MaxArray {
    public static void main(String[] args) {
        int[] arr = {12, 45, 67, 23, 89, 34};
        int max = arr[0];

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum number: " + max);
    }
}
