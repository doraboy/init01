package tw.org.iii.mytest;

public class TWId {
	private String id;
	
	TWId(){
		
	}
	
	TWId(boolean isMale){
		
	}	
	
	TWId(int area){
		
	}
	
	TWId(boolean isMale, int area){
		
	}
	
	//static內容不涉及本類別任何物件的存在(不能直接呼叫下方的m1方法,未建立實體物件)
	//static方法,只能呼叫static的方法
	static boolean checkId(String id) {//類別級別擁有的方法,內容不會涉及到this
	//1.長度為10
	//2.第一碼為大寫字母
	//3.第二碼為1或2
	//4.第三碼後全為數字
		boolean isRight = false;
		
		System.out.println("id長度"+id.length());
		System.out.println("第5個字元是"+id.charAt(5));
		
		if(id.matches("^[A-Z][12][0-9]{8}$")) {//正規表示法判斷身分證字號
			isRight = true;
		}

		return isRight;
		
//其他寫法...
//		char[] id2=id.toCharArray();//將String型態的id轉為char array
//		System.out.println((int)id2[1]);		
//		if(id.length()==10 && ((int)id2[0]>=65 && (int)id2[0]<=90)
//			&& ((int)id2[1]==49 || (int)id2[1]==50)) {
//			return true;
//		}else {
//			return false;
//		}
		

		
	}
	
	
	boolean m1(String id) {
		System.out.println("ok");
		checkId("sa");//本行ok,因為static的方法為m1同類別,可以任意呼叫
		return true;
	}
	
}
