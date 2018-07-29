package tw.org.iii.mytest;//代表路徑

public class Bike {//對外宣稱類別(通常首字大寫),括號內為類別的實作
	/*
	 *類別的實作內容(has-a)如下:
	 *1.靜態:這個類別所擁有的東西:屬性Field
	 *       (即不同物件間,最大的差異在於屬性,最重要)
	 *2.動態:方法(Method),方法為搭配屬性來設計處理的
	 *       方法是用來修改(操作)屬性值的
	 */
	private double speed;//private代表該屬性只能在該類別中被存取
	
	void upSpeed(){//方法:加速度,不需要參數故用void
		speed = speed==0?1:speed*1.4;//若速度為0,代表初次呼叫
	}
	
	void downSpeed(){//方法:減速度
		speed = speed==1?0:speed*0.7;//若速度為0,不需減速度
	}
	
	double getSpeed(){//方法:測速器
		return speed;//return的是值,別人看不到變數speed
	}
	
}
