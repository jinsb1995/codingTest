package study.sort;

/**
 * 병합 정렬
 */
public class MergeSort {


    private static void mergeSort(int[] arr) {
        int[] tmp = new int[arr.length];
        mergeSort(arr, tmp, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int[] tmp, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, tmp, start, mid);
            mergeSort(arr, tmp, mid + 1, end);
            merge(arr, tmp, start, mid, end);
        }
    }

    private static void merge(int[] arr, int[] tmp, int start, int mid, int end) {
        for (int i = start; i <= end; i++) {
            tmp[i] = arr[i];
        }

        // 배열이 지금 두개가 [중간]을 기준으로 하나로 붙어있으니까,
        int part1 = start;
        int part2 = mid + 1;  // 각 방의 첫번째 인덱스들
        int index = start;

        // 첫번째 방이 끝까지 가거나, 두번째 방이 끝까지 갈 때 까지 반복문을 돌린다.
        while (part1 <= mid && part2 <= end) {
            if (tmp[part1] <= tmp[part2]) {
                arr[index] = tmp[part1];
                part1++;
            } else {
                arr[index] = tmp[part2];
                part2++;
            }
            index++;
        }
        for (int i = 0; i <= mid - part1; i++) {
            arr[index + i] = tmp[part1 + i];
        }


    }

    private static void printArr(int[] arr) {
        for (int data : arr) {
            System.out.print(data  + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {3, 9, 4, 7, 5, 0, 1, 6, 8, 2};
        printArr(arr);
        mergeSort(arr);
        printArr(arr);
    }


}
