package TQC03;
import java.util.Scanner;
public class JPA312 {
	public static void main(String[] args) {
		 Scanner UserInput = new Scanner(System.in);
		 int WeatherType; float Temperature;
		 
		 System.out.print("�п�J�Ѯ𫬺A:");
		 WeatherType=UserInput.nextInt();
		 System.out.println("�п�J���:");
		 Temperature=UserInput.nextFloat();
		 
		 if (WeatherType==1)
			 System.out.println("�`�N����");
		 else
		     System.out.println("��ĳ�a�B��");
		 
		 if (Temperature>=26)
			 System.out.println("���Ū���,�ɥR����");
		 else if (Temperature>=16)
			 System.out.println("��ŵάO,���~�M");
		 else
			 System.out.println("�C�Ũ�ŧ");
		 
		 UserInput.close();
	}

}
