package TQC01;
import java.util.Scanner;
public class JPA104 {

	public static void main(String[] args) {
		
	
		//System.out.println(Math.sqrt(100));
		//System.out.println(Math.pow(2, 3));
		
		
		Scanner sc = new Scanner(System.in);
		double x1,x2,y1,y2; //a(x1,y1), b(x2,y2)

		System.out.print("��J��1�ժ�x�My�y��:");
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();

		System.out.print("��J��2�ժ�x�My�y��:");
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		//printf���Ϊk�O�O��ܥX�@��r��A�Ӧr�ꤤ�|���@���ܼƥi�a�J�A
		//�Ҧp%d �N�O�a�J��ơA%f�N�O�a�J�B�I�ơA
		//��%4.2f�O����������Ʀ��|��(�]�t�p���I)�A�Ӥp���I�᭱�����
		//���L�p�G��X�����Ƥj��ϥΪ̿�X���A�h�|�����ϥΪ̩ҿ�J����ƭ���
		//Math.sqrt(X) = X�}�ڸ�
		//Math.pow(2.0,3.0) = �G���T����A�䤤����ܼƬҬOdouble�Φ�
		double Xminus,Yminus;
		Xminus=x2-x1;
		Yminus=y2-y1;
		
		double result=Math.sqrt( Math.pow((x2-x1),2) + Math.pow((y2-y1),2)  );
		
		System.out.printf("����(%4.2f,%4.2f)�M(%4.2f,%4.2f)�������Z���O%4.2f",
				x1,y1,x2,y2,result);
				
		 sc.close();
	}

}