package TQC02;
import java.util.*;
public class JPA207 {
	static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        test();

    }
    static void test() {

    	//�T���α���P�_�A��ӵu��ۥ[�j��̤j��A�åB�䤤�@�䪺�Ƥ��i���s
    	System.out.print("�п�J�T�Ӿ��:");
        Scanner sc = new Scanner(System.in);
        int[] n= new int[3];
    	n[0]=sc.nextInt(); //3
    	n[1]=sc.nextInt(); //5
    	n[2]=sc.nextInt(); //4
    
    	//�ҩ������Ƨ�
    	/*
    	System.out.println("�ϥΪ̿�J��:");
    	for (int i=0;i<n.length;i++)
    	   System.out.printf("n[%d]=%d%n",i,n[i]);
    	
    	//�ϥ�Arrays.sort(n)�A�N�}�C�����Ʀr�Ѥp�ƨ�j
    	Arrays.sort(n);

    	System.out.println("�s��Arrays.sort�Ƨǫ�:");
    	for (int i=0;i<n.length;i++)
    	   System.out.printf("n[%d]=%d%n",i,n[i]);
    	*/
    	
    	//�ϥ�Arrays.sort(n)�A�N�}�C�����Ʀr�Ѥp�ƨ�j
    	Arrays.sort(n);    	
    	
    	//�T���α���P�_�A��ӵu��ۥ[�j��̤j��A�åB�䤤�@�䪺�Ƥ��i���s
    	if(n[0]+n[1]>n[2] && n[0]*n[1]*n[2]!=0)
        	{
    		//�����T����:���p�����䥭��M����̤j�䪺����
        	if(n[0]*n[0]+n[1]*n[1]==n[2]*n[2])
        		System.out.print("�����T����\n");
        	//�w���T����:���p�����䥭��M�p��̤j�䪺����
        	else if(n[0]*n[0]+n[1]*n[1]<n[2]*n[2])
        		System.out.print("�w���T����\n");
        	//�U���T����:���p�����䥭��M�j��̤j�䪺����
        	else if(n[0]*n[0]+n[1]*n[1]>n[2]*n[2])
        		System.out.print("�U���T����\n");
        	}
            //�Y�L�k�c���T���Ϋh�i�J���P�_��
    	else
        	System.out.print("���i�H�c���T����\n");
    	
        
        sc.close();
    }
}
