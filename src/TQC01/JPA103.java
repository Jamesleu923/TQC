package TQC01;
import java.util.Scanner;
public class JPA103 {

	public static void main(String[] args) {
		System.out.println("Please input:");
		Scanner sc = new Scanner(System.in);
		//Scanner�bŪ�����ɭԷ|�H�ťլ��Ϲj
		int a,b;
		float c;
		//String name;

		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextFloat();
		//name=sc.next();
		
		//�o��O�o�n�N�T���ܼƤ��M�j���૬��double�A�o�˰��X�Ӫ��Ʀr�~�|�O�B�I��
		System.out.printf("Average: %5.2f",((double)(a+b+c)/3));
		 sc.close();

	}

}
