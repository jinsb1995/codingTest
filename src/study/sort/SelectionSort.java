package study.sort;

/*
    배열을 돌면서 가장 작은 값 부터 하나씩 앞으로 옮기는 것
    1. 가잘 작은 값을 찾는다.
    2. 찾으면 제일 시작한 인덱스위치에 있는 데이터와 바꿔준다.
    3. 그 다음방부터 찾는다.
    4. 시작한 인덱스튀치에 있는 데이터와 바꿔준다.
    0(n^2)
 */
/** 선택정렬 */
public class SelectionSort {

    public static void selectionSort(int[] arr) {
        // 제일 작은 값을 찾아야하는데 위치를 모르니까 일단 시작값은 0으로 준다.
        selectionSort(arr, 0);
    }

    private static void selectionSort(int[] arr, int start) {
        if (start < arr.length - 1) {

            int minIdx = start;
            for (int i = start; i < arr.length; i++) {
                if (arr[i] < arr[minIdx])
                    minIdx = i;
            }
            swap(arr, start, minIdx);
            selectionSort(arr, start + 1);
        }

    }

    private static void swap(int[] arr, int start, int minIdx) {
        int tmp = 0;
        tmp = arr[start];
        arr[start] = arr[minIdx];
        arr[minIdx] = tmp;

    }

    private static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {3,5,4,2,1};
        printArr(arr);
        selectionSort(arr);
        printArr(arr);

    }
}
