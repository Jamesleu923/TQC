package TQC01;
import java.util.Scanner;

public class JPA102 {

	public static void main(String[] args) {
		System.out.println("Please input請輸入英磅數值:");
		//變數: 整數int,整數物件Integer,浮點數float,浮點數物件用Float
		//倍精確度變數double,倍精確度物件Double
		//字串 String 字串物件StringBuilder
		
		int score=90;
		Integer MyChineseTestScore=98;
		
		float myheight=173.2f;
		Float MaryHeight=150.7f;
		
		double myMoney=50.12323;
		Double myMotherMoney=100.23;
		
		String myName="James";
		StringBuilder MyFatherName=new StringBuilder();
		MyFatherName.append("James");
		
		
		//使用Scanner這個方法來讀取鍵盤輸入
		
		//1公斤=2.20462磅
		//1磅=0.454 公斤
		//double k = Double.parseDouble(new Scanner(System.in).next()) ;
		Scanner sc=new Scanner(System.in);	
		double k=sc.nextDouble();
		System.out.println(k+"磅ponds = "+ (k*0.454) + "  kg公斤 ");		
		System.out.printf("%.3f英磅等於%.3f公斤%n", k, k*0.454);		
		System.out.println("Please input請輸入名字:");
		String name=sc.next();
		
		System.out.println("你的名字是:"+name.toString());
		
		 sc.close();
	}

}
