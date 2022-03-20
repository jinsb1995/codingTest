package study.sort;

/**  버블정렬   */
public class BubbleSort {

    // 배열을 받을 함수
    public static void bubbleSort(int[] arr) {
        // 정렬이 안된 부분의 마지막 인덱스
        bubbleSort(arr, arr.length - 1);
    }

    // 재귀호출로 정렬해주는 함수
    public static void bubbleSort(int[] arr, int last) {
        // 마지막 인덱스가 0보다 클 때 까지만 재귀호출
        if (last > 0) {
            for (int i = 1; i <= last; i++) {
                // 내 앞에있는 애가 나보다 큰가 검사
                if (arr[i-1] > arr[i]) {
                    swap(arr, i-1, i);
                }
            }
            bubbleSort(arr, last - 1);
        }
    }

    public static void swap(int[] arr, int big, int small) {
        int tmp = 0;
        tmp = arr[big];
        arr[big] = arr[small];
        arr[small] = tmp;
    }

    // 위치를 바꿔주는 함수
    public static void printArr(int[] arr) {
        for (int data : arr) {
            System.out.print(data + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {3,5,4,2,1};
        printArr(arr);
        bubbleSort(arr);
        printArr(arr);
    }
}






