package tw.org.iii.mytest;

public class java17 {

	public static void main(String[] args) {
		int[] number = new int[7];

		for(int i=0;i<1000000;i++){//擲1000000次骰子
		int a=(int)(Math.random()*6)+1;
		if(a>=1 && a<=6) number[a]++;
		else number[0]++;
		}
		
		if(number[0]==0){
			for(int i=1;i<number.length;i++)
				System.out.println("點數"+i+"次數為"+number[i]);
		}else {
			System.out.println("XX");
		}
		
	}

}