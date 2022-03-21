package study.sort;


/**
    정렬이 안되어 있는 배열이 있을 떄
       5 2 4 7 8 9 0 3 1 6

   1. 아무거나(6) 잡고   얘보다 작은애들은 왼쪽에, 큰애들은 오른쪽에
      그러면 파티션이 두개로 나뉘어지는데

   2. 그중 작은 파티션부터 아무거나 (4)를 잡고 또 왼쪽 오른쪽을 나눈다.
      여기도 위처럼 파티션이 두개로 나뉘어진다.

    시간복잡도  O(n log n)
          최악 O(n^2)

 */
public class QuickSort {

    static int index = 0;

    private static void quickSort(int[] arr) {
        // start인덱스와  end인덱스를 넣어준다.
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int start, int end) {
        // 두번째 파티션의 첫번째 배열방 index를 가져온다.
        int part2FirstIndex = partition(arr, start, end);

        // 첫번째 파티션의 정렬을 한다.
        if (start < part2FirstIndex - 1) {
            quickSort(arr, start, part2FirstIndex - 1);
        }
        // 두번째 파티션의 정렬을 한다.
        if (part2FirstIndex <  end) {
            quickSort(arr, part2FirstIndex, end);
        }

    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[(start+end)/2];

        while (start <= end) {
            while (arr[start] < pivot) start++;  // 왼쪽이   pivot값 보다 작으면 ++
            while (arr[end] > pivot)   end--;    // 오른쪽이 pivot값 보다 크면 --;

//            if (arr[end] < pivot) {              // 오른쪽이 pivot값 보다 작으면 왼쪽의 데이터와 swap
            if (start <= end) {
                swap(arr, start, end);
                start++;
                end--;
            }
        }
        // 이 때 start가 가리키고 있는 배열 방이
        // 두번째 파티션의 첫번째 방 index이다.
        return start;
    }

    private static void swap(int[] arr, int start, int end) {
        int tmp = arr[start];
        arr[start] = arr[end];
        arr[end] = tmp;
    }

    private static void printArr(int[] arr) {
        for (int data : arr) {
            System.out.print(data + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 3,2,4,7,5,0,1,6,8,9 };
        printArr(arr);
        quickSort(arr);
        printArr(arr);
    }
}
