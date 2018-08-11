package tw.org.iii.mytest;

public class java39 {

	public static void main(String[] args) {
		Brad391 obj1 = new Brad391();//要先建立外部物件實體Brad391
	    Brad391.Brad392 obj2=obj1.new Brad392();//才能做出其內部的物件實體Brad392
	    obj2.m1();
	}

}

class Brad391{
	class Brad392{
		void m1() {
			System.out.println("Brad391:Brad392:m1()");
		}
	}
	
}
