package tw.org.iii.mytest;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class YahooFinance {//取得網頁原始碼訊息(文字訊息),可網路爬蟲
	public static double now_price=-1;
	
	public static void main(String[] args) {
			String symbol = "^DJI";
		try {
			//URL包含通訊協定(例如http)
			URL url = new URL("https://finance.yahoo.com/quote/"+symbol);
			HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
			conn.connect();
			//一次性連接取得原始碼
			
			//文字訊息,故用串接傳輸bytes
			InputStream in = conn.getInputStream();
			InputStreamReader isr = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(isr);//加上這個可以一次讀一列
			
			String line, line2;
			int point_value, point_value2, point_value3;
			point_value = point_value2 = point_value3=-1;
		
			while((line = br.readLine()) != null) {
				//System.out.println(line);
				point_value = line.indexOf("},\"currency\":\"USD\",\"regularMarketPrice\":{\"raw\":");
				if(point_value!=-1)
				{
					line2 = line.substring(point_value, point_value+75);
					point_value2 = line2.indexOf("\":{\"raw\":");
					point_value3 = line2.indexOf(",\"fmt\":\"");
					now_price = Double.parseDouble(line2.substring(point_value2+9, point_value3));
				}

			}
			
			br.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println(symbol+":"+now_price);
		

	}
	
	public getNowPrice(String name){
		
	}

}
