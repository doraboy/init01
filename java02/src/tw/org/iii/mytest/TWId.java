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
	
		
		return true;
	}
	
	
	boolean m1(String id) {
		System.out.println("ok");
		checkId("sa");//本行ok,因為static的方法為m1同類別,可以任意呼叫
		return true;
	}
	
}
