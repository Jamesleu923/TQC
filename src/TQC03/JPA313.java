package TQC03;
import java.lang.Math;
import java.util.Arrays;
public class JPA313 {

	public static void main(String[] args) {

        double[] StdScore= {12,34,55,60,8,100,80,34,65,59};
        //��for �j�騫�X�}�C,��C�@�����Z�}�ڸ�*10
        for (int i=0;i<StdScore.length;i++)
        	StdScore[i]=Math.sqrt(StdScore[i])*10;
        //�Ƨ�
        Arrays.sort(StdScore);
        
        //��for �j�騫�X�}�C,�L�X�C�@�����Z,�����X�C�������@�C.
        for (int i=0;i<StdScore.length;i++) {
        	System.out.printf("��%d��:%.2f,",i+1,StdScore[i]); 
        	if (i==4)               
                System.out.println();
        }        
        System.out.println();

        // �P�W�D�A�ЮھڤW�D�[���αƧǫᵲ�G�A�^���H�U�l�D�G�U��{���@�ά���? 
        double[] NewScore1=Arrays.copyOf(StdScore, 5);
        // Ans:���X�e���Ӥ����ƻs��NewScore1 �}�C��.
        
        //�P�W�D�A�ЮھڤW�D�[���αƧǫᵲ�G�A�^���H�U�l�D�G���槹��ANewScore1�̧ǥѤp��j�̧Ǧ����ǭ�?
        //�Ш̧Ǽg�X�e2�Ӿ�Ƴ���(���t�p���I,���t�p�Ʀ��)
        System.out.printf("NewScore1�e�G�ո��:%f,%f%n", NewScore1[0],NewScore1[1]);
        
        //�ϥ�Math.floor�L����h���p�Ʀ�
        System.out.printf("NewScore1�e�G�ո�ƾ�Ƴ���:%.0f �� %.0f%n", 
        		Math.floor(NewScore1[0]),Math.floor(NewScore1[1]));
        
        /*
         * �P�W�D�A�ЮھڤW�D�[���αƧǫᵲ�G�A�^���H�U�l�D�G
           �U��{�����槹��A�Х�for..each�j��L�XNewScore1�}�C������ơA
          �B�C����ƨ�p�Ʀ�����e2��(�Шϥ�printf�禡�t�X�p�Ʀ�Ʊ���)6% 
         */        
        for (double score:NewScore1)
        	  System.out.printf("%.2f,",score);
        System.out.println();
        
        // �P�W�D�A�ЮھڤW�D�[���αƧǫᵲ�G�A�^���H�U�l�D�G�U��{���@�ά���?
        double[] NewScore2=Arrays.copyOfRange(StdScore, 5,11);
        //�q�Ĥ��Ӥ���copy ���11�Ӥ���,�B��JNewScore2�}�C��.
        
        //�P�W�D�A�ЮھڤW�D�[���αƧǫᵲ�G�A�^���H�U�l�D�G
        //���槹��ANewScore2�̧ǥѤp��j�A�e���������ǭ�? (�������r���j�}) 10%
        
        //��for �j�騫�X�}�C,�L�X�e����.
        for (int i=0;i<NewScore2.length;i++) {
        	if (i<5)
        	   System.out.printf("��%d��:%.2f,",i+1,NewScore2[i]); 
        	else {
        		System.out.println();
        		break;
        	}
                
        }  
        
	}

}

