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
        // 배열에서 가장 작은 값을 찾아야 하는데 그 위치를 모르니까 0부터 시작한다.
        selectionSort(arr, 0);
    }

    public static void selectionSort(int[] arr, int start) {
        // 배열의 길이만큼만 재귀호출
        if (start < arr.length - 1) {

            // 최소값이 들어있는 index
            int minIndex = start;

            for (int i = start; i < arr.length; i++) {
                if (arr[minIndex] > arr[i]) {
                    swap(arr, i, minIndex);
                }
            }
            selectionSort(arr, start+1);
        }
    }

    public static void swap(int[] arr, int target, int minIndex) {
        int tmp = arr[target];
        arr[target] = arr[minIndex];
        arr[minIndex] = tmp;
    }

    public static void printArr(int[] arr) {
        for (int data : arr) {
            System.out.print(data + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 2, 1};
        printArr(arr);
        selectionSort(arr);
        printArr(arr);
    }
}
