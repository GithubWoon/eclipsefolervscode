public class study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startMillsTime = System.currentTimeMillis();
		System.out.println("시작: 헬로월드!");
		for(int i = 0; i < 1000; i++)
		{
			for(int j = 0; j < 1000; j++)
			{
				System.out.println(1);
			}
		}
		System.out.println("끝: 헬로월드!");
		long endMillsTime = System.currentTimeMillis();
		long endNanosTime = System.nanoTime();
		long duringMillsTime = (endMillsTime - startMillsTime);
		long duringSecsTime = (endMillsTime - startMillsTime)/1000;
		long duringMicrosTime = (endNanosTime - startMillsTime)/10000;
		System.out.println("Mills:" + duringMillsTime);
		System.out.println("Seconds:" + duringSecsTime);
		System.out.println("Micros:" + duringMicrosTime);

	}

}