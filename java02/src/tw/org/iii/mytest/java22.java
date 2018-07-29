package tw.org.iii.mytest;

public class java22 {

	public static void main(String[] args) {
//		TWId.checkId("aa");//有static為類別級別的方法, 無須物件,可直接呼叫方法
//		
//		TWId id1=new TWId();
//		id1.m1("aaa");//須先建立物件才能實現該方法
//		
		if(TWId.checkId("A123456789")) {
			System.out.println("ok!");
		}else {
			System.out.println("error!");
		}

	}

}
