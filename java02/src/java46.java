import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class java46 {

	public static void main(String[] args) {
		try {
			FileInputStream fin=new FileInputStream("dir1/brad.txt");
			//InputStream永遠只能讀byte,所以不適合讀文字資料
			//InputStream適合用來讀binary file
			
			int temp;
			byte[] b = new byte[3];//設定一次讀幾個byte(中文字:1或2個都會出現亂碼)
			//寫法一
//			do{
//				temp = fin.read();//一次只能讀一個byte,讀完指標到下一個
//				if (temp==-1){
//					break;
//				}else {
//				System.out.println((char)temp);
//			  }
//			} while(true);
			
			//寫法二:先進行assign,再去判斷,較簡潔
			while((temp = fin.read(b))!=-1) {
				System.out.print(new String(b,0,temp));
				//System.out.print((char)temp);
			}

			//開檔案操作完,要記得關掉
			fin.close();
		}catch (FileNotFoundException fe) {

		}catch (IOException fe) {

		}
		

	}

}
