package TQC03;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class JPA311 {

	public static void main(String[] args) {
		 //�G��for�j�骺��l��,�����,�פ��,���j�骺�ȨӦ۩�Ĥ@�� ,ex Bubble sort
		 //�w�z�ƧǪk
		 int[] mynumber= {10,67,90,23,12,90,100,33,65,59,78,92};
		 System.out.println("���Ƨǫe");
		 for (var i:mynumber)
			 System.out.printf("%d,",i);
		 System.out.println();
		 
		 System.out.println("�Ƨǫ�");
		 //bubble sort,�w�z�Ƨ�,�į�̮t,�̦n��
		 /*
		 int temp=0;
		 for (int i=0;i<mynumber.length;i++)
			 for (int k=i+1;k<mynumber.length;k++) {
				 if (mynumber[i]>mynumber[k]) {
					 temp=mynumber[i];
					 mynumber[i]=mynumber[k];
					 mynumber[k]=temp;
				 }
			 }
		 */
		 Arrays.sort(mynumber);
		 
		 for (var i:mynumber)
			 System.out.printf("%d,",i);
		 System.out.println(); 

		 //�Q��for�j�����
		 System.out.println("�Q��for�j��Ѥj��p");
		 for (int i=mynumber.length-1;i>=0;i--) {
			 System.out.printf("mynumber[%d]=%d,",i,mynumber[i]);
			 if (i%4==0)
				 System.out.printf("%n");
		 }
		    
		 
		 System.out.println();
		 //�Q��arrayulist����
		 System.out.println("�Q��arrayulist����");
		 ArrayList mynubmerlist=new ArrayList();
		 for (var i:mynumber)
			 mynubmerlist.add(i);
		 Collections.reverse(mynubmerlist);
		 System.out.println("����:"+mynubmerlist);

	}

}
