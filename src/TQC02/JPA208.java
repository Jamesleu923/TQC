package TQC02;
import java.util.*;
public class JPA208 {
	
	static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        test();
    }

    //�إߤ��ƧP�_����k�A�bmain��k���A�ŧi�����A�K���椭��
    public static void test()  {
    	System.out.println("Input:");
        Scanner sc = new Scanner(System.in);
        try {
        	
            float a = sc.nextFloat();
            //�ϥα���P�_���A"if" "else if" "else"�A�]���@�w�u��ŦX��̳W�h�A����Φh��if�ӧP�_
            //�o��ϥκ|�檺�g�k�A�p�G�S���j�󵥩�90���ӼƤ@�w�p��90���U�~�����A�����U�K�u�ݼg�P�_�j�󵥩�80�Y�i�A���ΦA�P�_�O�_�p��90            
            // *****�|��g�k  ***/     
            if(a>=90)
            	System.out.printf("Your grade is A\n");
            else if(a>=80)
            	System.out.printf("Your grade is B\n");
            else if(a>=70)
            	System.out.printf("Your grade is C\n");
            else if(a>=60)
            	System.out.printf("Your grade is D\n");
            else if(a<60)
            	System.out.printf("Your grade is F\n");
            else
                System.out.printf("grade input ERROR\n");
            
        } catch (InputMismatchException ex) {
        	
        	System.out.println("�Ф��n��KEY,�ڭn�ƭ�!!!");
        	return;
        }

        sc.close();


        
        /*
        if(a>=90)
        	System.out.printf("Your grade is A\n");
        if (a<90 && a>=80)
        	System.out.printf("Your grade is B\n");
        if (a<80 && a>=70)
        	System.out.printf("Your grade is C\n");
        if (a<70 && a>=60)
        	System.out.printf("Your grade is D\n");
        if (a<60 )
        	System.out.printf("Your grade is E\n");
        */        	

    }
}
