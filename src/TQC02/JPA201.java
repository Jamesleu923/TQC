package TQC02;

import java.util.Scanner;

public class JPA201 {
    //�U��keyboard���� ���ŧi,���t�m�O����,�B����static����r,��complier�sĶ���O�d�O�ЪŶ�
	//���O.....�{������L�{��,���ϥΨ�keyboard����.
	static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter score");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        test(a);
        int b = sc.nextInt();
        test(b);

        sc.close();
    }
    //�إߤ@��static����k�A�ӧP�_�O�_���j��60
    public static void test(int c) {
        if(c>=60) 
        	System.out.println("�ή�!!");
        // if( 60<=c<=70) ---->�����ƾ�, �Y�����~,�W�ҨS�bť!!!! 
        //��G�����Ӫ��c����60�P70����.������and�B��l&&�Ӧ�s. 
        // &&�N���޿����걵, ���謰�u,�B�k�謰�u, &�@�ӲŸ��N��⥪���k�谵and�޿�h�p��
        // && ���k�����,�����n�άA���]��,�p(c>=60)������@,(c<=70)������G
        // �̫�,�O�o.....��&&�޿����걵���P�O��,��Jif�����,
        //�n�Ϋ��榡, if�̥~�h�n���A��, if (  (�P�O���@) && (�P�O�G)  )
        // ||�޹D�Ÿ�-->�G�ӥN��Ϊ̷N��, shift+"��"
        
        if (  ((c>=60) && (c<70)) || (c<10)  )
        	System.out.println("�n�[�o!");
        
        if (  (c>=70) && (c<80)   )
        	System.out.println("�٤���");

        if (  (c>=80) && (c<90)   )
        	System.out.println("�ܦn");
            
        if   (c>=90) 
        	System.out.println("�W�u~!��!!");
        
        System.out.println("End");
            
   }
}