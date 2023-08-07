public class 퀵정렬알고리즘 {
// 리스트 안에 있는 요소를 하나 설정하고 그것을 피벗이라고 부른다 
// 피벗은 가운데에 위치하여 피벗 요소보다 작은것들은 왼쪽, 큰것들은 오른쪽으로 배치한다
// 왼쪽에서 첫번째 요소, 오른쪽에서 첫번째 요소를 비교한다
// 왼쪽에서 두번째 요소, 오른쪽에서 두번째 요소를 비교한다 ... 비교할 요소가 없을때까지 반복
// 비교가 다 끝난후 피벗은 가운데 위치로 이동
		
    private static void quickSort(int[] arr){
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int start, int end){
        int part2 = partition(arr, start, end);

        if(start < part2 - 1){
            quickSort(arr, start, part2 - 1);
        }

        if(part2 < end){
            quickSort(arr, part2, end);
        }
    }

    private static int partition(int[] arr, int start, int end){
        int pivot = arr[(start + end) / 2];
        while(start <= end){
            while(arr[start] < pivot) start++;
            while(arr[end] > pivot) end--;
            if(start <= end){
                swap(arr, start, end);
                start++;
                end--;
            }
        }

        return start;
    }

    private static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    private static void printArray(int[] arr){
        for(int data : arr){
            System.out.print(data + " ,");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {3, 9, 4, 7, 5, 0, 1, 6, 8, 2};
        printArray(arr);
        quickSort(arr);
        printArray(arr);
    }
}