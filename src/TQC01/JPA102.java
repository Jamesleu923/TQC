package TQC01;
import java.util.Scanner;

public class JPA102 {

	public static void main(String[] args) {
		System.out.println("Please input�п�J�^�S�ƭ�:");
		//�ܼ�: ���int,��ƪ���Integer,�B�I��float,�B�I�ƪ����Float
		//����T���ܼ�double,����T�ת���Double
		//�r�� String �r�ꪫ��StringBuilder
		
		int score=90;
		Integer MyChineseTestScore=98;
		
		float myheight=173.2f;
		Float MaryHeight=150.7f;
		
		double myMoney=50.12323;
		Double myMotherMoney=100.23;
		
		String myName="James";
		StringBuilder MyFatherName=new StringBuilder();
		MyFatherName.append("James");
		
		
		//�ϥ�Scanner�o�Ӥ�k��Ū����L��J
		
		//1����=2.20462�S
		//1�S=0.454 ����
		//double k = Double.parseDouble(new Scanner(System.in).next()) ;
		Scanner sc=new Scanner(System.in);	
		double k=sc.nextDouble();
		System.out.println(k+"�Sponds = "+ (k*0.454) + "  kg���� ");		
		System.out.printf("%.3f�^�S����%.3f����%n", k, k*0.454);		
		System.out.println("Please input�п�J�W�r:");
		String name=sc.next();
		
		System.out.println("�A���W�r�O:"+name.toString());
		
		 sc.close();
	}

}
