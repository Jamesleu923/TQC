package TQC02;
import java.util.*;

public class JPA210 {
	  static Scanner keyboard = new Scanner(System.in);
	    public static void main(String[] args) {
	        //test();
	    	System.out.print("��J�@�Ӧr��:");
	    	//�U�����16,18,20��{���g���@�� new Scanner(System.in).next().charAt(0)
	    	//��W�z���������浲�G����"�r��",�ҥH��W�z����ᵹmytest,�]��mytest�����r��
	    	System.out.println(mytest(new Scanner(System.in).next().charAt(0)));
	    }

	    public static void test() {
	    	System.out.println("Input a character:");
	        Scanner sc = new Scanner(System.in);
	        //Ū���r��
	        String tm = sc.next();
	        //���^���ۦꪺ�Ĥ@�Ӧr��
	        char tm0 = tm.charAt(0);
	        switch(tm0) {
	        case 'a'://�o�䤣�ݭn�S�O�h�B�z�A�]���S���gbreak�A�ҥH�|�~��]��case 'B'�����e�A����I��break
	        case 'b':
	            System.out.println("You entered a or b");
	            break;
	        case 'x':
	            System.out.println("You entered x");
	            break;
	        case 'y':
	            System.out.println("You entered y");
	            break;
	        default:
	            System.out.println("You entered something else.");
	            break;
	        };
	        sc.close();
	   }
		
	    public static String mytest(char myinput) {
	    	
			String rtnstr=new String();
				switch (myinput) {
			      case 'a'->rtnstr="��a";
			      case 'b'->rtnstr="��b";
			      case 'x'->rtnstr="��x";
			      case 'y'->rtnstr="��y";
			      default->rtnstr="����O��";
			    }						  
			return rtnstr;
		}
}
