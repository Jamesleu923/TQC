package TQC02;

import java.util.*;

public class JPA202{
    static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args) {
       	test1();
        test1();
    }

    public static void test() {
    	System.out.println("Input:");
        Scanner sc = new Scanner(System.in);
        int a,b;
     
        a = sc.nextInt();
        b = sc.nextInt();
        //�إ߱���P�_���A���G�i�঳�T�ت��p�Aa>b�Aa=b�Aa<b�A�ҥH�P�_���B�z�p�U
        //if..else if ..else���c,�u�|�]�䤤�@��,�p�G���������ŦX,�h�|�]�̫�@��else      
        if(a>b)
        	System.out.printf("%d is larger than %d\n",a,b);
        else if(b>a)
        	System.out.printf("%d is larger than %d\n",b,a);
        else
        	System.out.printf("%d is equal to %d\n",a,b);

        sc.close();

    }
    public static void test1() {
    	//if ..else if ..else if...else if ...else
    	//�����i�H���L����else if ...
    	//���O�̫�@��,�@�w�Oelse,�Ĥ@�դ@�w�Oif
    	
    	System.out.println("�п�J����:");
        Scanner sc = new Scanner(System.in);
        int c;
        c = sc.nextInt();
        if (c>=90)
        	System.out.println("�ܴ�!");
        else if (c>=80)
        	System.out.println("�ܦn!");
        else if (c>=70)
        	System.out.println("�i�H");
        else if (c>=60)
        	System.out.println("�n�a�b�ή�F!");
        else
        	System.out.println("���ή�!");
        

        sc.close();

    }    
}