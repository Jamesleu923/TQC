package TQC03;
// 5!=5*4*3*2*1,  10!=10*9*8....*1;
import java.util.Scanner;
public class JPA305 {
	static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        test();

    }

    public static void test() {
    	System.out.print("Please enter one value:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum=1;
        //����P�_�A�O�_�b�ϥΪ̿�J��1~10����
        if(a>0&&a<=10)
        {
        	//�i�涥���B��
        	for(int t=1 ; t<=a ; t++)
        		sum = sum*t;
        	System.out.printf("%d! : %d\n",a,sum);
        }
        else
        	System.out.printf("Error, the value is out of range.");
    }
}
