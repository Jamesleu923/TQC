package TQC03;
import java.util.*;

public class JPA301 {

	 public static void main(String argv[]) {
	        System.out.println("Input:");
	        
	        //�G�C���g�k//
	        //Scanner sc=new Scanner(System.in);
	        //int tm1 =sc.nextInt();
	        
	        //�֦��@�C���g�k//
	        int tm =new Scanner(System.in).nextInt();
	        
	        int sum = 0 ;
	        //�q1�}�l�[�A�B�ܼƷ|�@��+1�A�[�J�`�M�A�����ܼƤj��ϥΪ̿�J���ƫK����
	        /*
	        for (int a=1;a<=tm ; a++) {
	            sum = sum+a;
	        }
	        */
	        sum=((1+tm)*tm)/2;
	        System.out.printf("1 + ... + %d = %d",tm,sum);
	    }
	 
 public static void test(){
 		
	 //for�j�骺��l��,�����,�פ��,�����ХΤ����j�}
     //case 1: test�L10��
	 for (int i=0;i<10;i++)
	 	System.out.println("test");
	
    //case 2: test�L10��
	  int j;
	  for (j=0;j<10;j++)
		System.out.println("test");
	  
	//for�j�骺��l��,�����,�פ��,�P�_����,���S������??
	 for (int i=0;i<=10;i++)
	    	System.out.println("test");
	 
	 //�G��for�j�骺��l��,�����,�פ��,
	 for (int i=0;i<10;i++)
		 for (int k=0;k<10;k++)
	    	    System.out.println("test");

	 //�G��for�j�骺��l��,�����,�פ��,���j�骺�ȨӦ۩�Ĥ@�� ,ex Bubble sort
	 //�w�z�ƧǪk
	 int[] mynumber= {10,67,90,23,12,90,100,33,65,59};
	 int temp=0;
	 for (int i=0;i<10;i++)
		 for (int k=i+1;k<10;k++) {
			 if (mynumber[i]<mynumber[k]) {
				 temp=mynumber[i];
				 mynumber[i]=mynumber[k];
				 mynumber[k]=temp;
			 }

		 }	    	    
	 //�`�N for�j�餤�[�Wif�P�O���H��break;countiune;
	 //https://openhome.cc/Gossip/JavaGossip-V1/BreakContinue.htm
	 
	 
  } //end of test function

	
}




/*
//case 99 do..while
int x=10;
do{
System.out.print("value of x : " + x );
x++;
System.out.print("123");
}while( x < 20 );
}
*/