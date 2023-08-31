public class Main02 {

	public static void main(String[] args) {
		// 1.2.1 배열변수 초기화 방법1
		int[] iArrValue1 = { 10, 20, 30, 40, 50 };
		printArray(iArrValue1);
		int iStartNum = 5;
		int iEndNum = 20;
		printAcumVal(iStartNum, iEndNum);
		// 5. 계산기: +, -, *, /
		int iRet01 = 0;
		int iRet02 = 0;
		int iRet03 = 0;
		double dRet04 = 0;
		int iFirstVal = 15;
		int iSecondVal = 35;
		iRet01 = add(iFirstVal, iSecondVal);
		iRet02 = sub(iFirstVal, iSecondVal);
		iRet03 = mul(iFirstVal, iSecondVal);
		dRet04 = div(iFirstVal, iSecondVal);
		System.out.println("===========================");
		System.out.println(iRet01 + ":" + iRet02 + ":" + iRet03 + ":" + dRet04);

		// 6. 함수
		// 6.1 함수선언/정의
		// 리턴타입 함수명(파라메터1, 파라메터2, ... 파라메터n) { 명령문집합;}
		// 리턴타입: int/double/String/개체타입 or void
		// 6.2 함수호출: 함수명(아규먼트1, 아규먼트2, 아규먼트n);

	}
	
	public int add(int iFirstVal, int iSecondVal) {
		int iRet01 = 0;
		iRet01 = iFirstVal + iSecondVal;
		return iRet01;
	}
	
	public int sub(int iFirstVal, int iSecondVal) {
		int iRet02 = 0;
		if(iFirstVal >= iSecondVal) { iRet02 = iFirstVal - iSecondVal; } 
		else { iRet02 = iSecondVal - iFirstVal; }
		return iRet02;
	}
	
}

