public class 버블정렬알고리즘 {
// 두 요소를 비교하여 큰수를 뒤로 보낸다
// 1번요소 vs 2번요소 비교 
// 2번요소 vs 3번요소 비교 ... 반복
	
	public static void main(String[] args) {
		int[] a = {254,3,213,64,75,56,4,324,65,78,9,5,76,3410,8,342,76};
		int b;
		for(int i = 0 ; i < a.length ; i ++) {
			for(int j = 0 ; j < a.length -i -1 ; j ++) {
				if(a[j]>a[j+1]) {
					b = a[j];
					a[j] = a[j+1];
					a[j+1] = b;
				}
			}
		}
		
		for(int i = 0 ; i < a.length ; i ++) {
			System.out.println(a[i]);
		}
	}
}