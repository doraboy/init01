package tw.org.iii.mytest;

import java.io.File;

public class jav44 {

	public static void main(String[] args) {
		System.out.println(File.pathSeparator);//";"用在path當中
		System.out.println(File.separator);//"\"用在路徑當中
		//不同作業系統,其path和路徑中的符號有可能不同,所以為了達到跨平台
		//才需要先取得該作業系統的所用符號

	}

}
