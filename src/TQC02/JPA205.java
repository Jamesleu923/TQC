package TQC02;
import java.util.*;
public class JPA205 {
	 static Scanner input = new Scanner(System.in);
	    public static void main(String[] args) {
	        test235();

	    }
	    //�g�@�Ӥ�k�Ӱ��歿�ƧP�_

	    static void test236() {
	        System.out.println("Enter an integer:");
	        Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();

	        //�Ѥj���Ʀr�}�l�P�_�A�p�G�P�_���Ʀr�O��ơA�h���ᶶ�Ǥ��v�T�{���C
	        
	        //���P�_�O�_�O6�����ơA�ѳ̤j���ƶ}�l�P�_
	        if ((a%6)==0)
	            System.out.printf("%d�O2�B3�B6������\n",a);
	        //�p�G���O6�����ơA�A�P�_�O�_��2��3�����ơA�䤤�P�_2��3�����ǨS���t
	        else if ((a%2)==0)
	            System.out.printf("%d�O2������\n",a);
	        else if ((a%3)==0)
	            System.out.printf("%d�O3������\n",a);
	        else
	            System.out.printf("%d���O2�B3�B6������\n",a);
	        

	        sc.close();
	   }
	    
	    static void test235() {
	        System.out.println("Enter an integer:");
	        Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();

	        //�Ѥj���Ʀr�}�l�P�_�A�p�G�P�_���Ʀr�O��ơA�h���ᶶ�Ǥ��v�T�{���C
	        
	        //2*3*5=30
	        
	        if ((a%30)==0) //2*3*5=30
	            System.out.printf("%d�O2�B3�B5������\n",a);
	        else if ((a%15)==0)  //3*5=15
	            System.out.printf("%d�O3�B5������\n",a);	 
	        else if ((a%10)==0)  //2*5=10
	            System.out.printf("%d�O2�B5������\n",a);		
	        else if ((a%6)==0)  //2*3=6
	            System.out.printf("%d�O2�B3������\n",a);		        
	        else if ((a%2)==0)
	            System.out.printf("%d�O2������\n",a);
	        else if ((a%3)==0)
	            System.out.printf("%d�O3������\n",a);
	        else if ((a%5)==0)
	            System.out.printf("%d�O5������\n",a);	        
	        else
	            System.out.printf("%d���O2�B3�B5������\n",a);
	       
	        sc.close();
	   }	    

        static void test357() {
        	//�ۤv�g..
        }
}

