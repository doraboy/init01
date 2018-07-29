package tw.org.iii.mytest;

public class java22 {

	public static void main(String[] args) {
//		TWId.checkId("aa");//有static為類別級別的方法, 無須物件,可直接呼叫方法
//		
//		TWId id1=new TWId();
//		id1.m1("aaa");//須先建立物件才能實現該方法
//		
		if(TWId.checkId("A123456987")) {
			System.out.println("身分證字號ok!");
		}else {
			System.out.println("身分證字號error!");
		}
	
		
		String b="0910-256966";
		if(b.matches("^[0][9][0-9]{2}[-][0-9]{6}$")) {//正規表示法判斷手機號碼
			System.out.println("手機號碼OK");
		}else {
			System.out.println("手機號碼XX");
		}

	}

}
