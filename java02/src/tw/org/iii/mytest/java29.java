package tw.org.iii.mytest;

public class java29 {
	public static void main(String[] args) {
		Brad291 obj1 = new Brad291();//宣告為291就只能呼叫291的方法
		//宣告=視為/看作,所以不會至知道291的m1方法
		//但實際上骨子裡還是292,實作上用292來執行
		obj1.m1();

		Brad291 obj2 = new Brad292();//宣告為291就只能呼叫291的方法
		obj2.m1();//視為291,不能用292的方法
		
		Brad292 obj3 = (Brad292)obj2;//obj2被視為291,故要強制轉型為292
		obj3.m1();//執行的動作永遠看骨子裡是誰實作出來的
		obj3.m2();
		System.out.println(obj2 == obj3);//
		//Brad292 obj4 = (Brad292)obj1; //=>Runtime Exception 語法(編譯)過,執行錯誤(轉型失敗)
		Brad294 obj5 = new Brad294();
		//Brad292 obj6 = (Brad292)obj5; //=>compile Exception 非直系血親,連編譯都不會過
		
		

	}
}

class Brad291{void m1(){System.out.println("Brad291:m1()");}}
class Brad292 extends Brad291{
	void m1(){//override
		System.out.println("Brad292:m1()");
	}
	void m2(){}
}
class Brad293 extends Brad292{void m3(){};}
class Brad294{}