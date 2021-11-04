package TQC02;
import java.util.*;
public class JPA205 {
	 static Scanner input = new Scanner(System.in);
	    public static void main(String[] args) {
	        test235();

	    }
	    //糶よ猭ㄓ磅︽计耞

	    static void test236() {
	        System.out.println("Enter an integer:");
	        Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();

	        //パ计秨﹍耞狦耞计琌借计玥抖ぃ紇臫祘Α
	        
	        //耞琌琌6计パ程计秨﹍耞
	        if ((a%6)==0)
	            System.out.printf("%d琌236计\n",a);
	        //狦ぃ琌6计耞琌2┪3计ㄤい耞2┪3抖⊿Τ畉
	        else if ((a%2)==0)
	            System.out.printf("%d琌2计\n",a);
	        else if ((a%3)==0)
	            System.out.printf("%d琌3计\n",a);
	        else
	            System.out.printf("%dぃ琌236计\n",a);
	        

	        sc.close();
	   }
	    
	    static void test235() {
	        System.out.println("Enter an integer:");
	        Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();

	        //パ计秨﹍耞狦耞计琌借计玥抖ぃ紇臫祘Α
	        
	        //2*3*5=30
	        
	        if ((a%30)==0) //2*3*5=30
	            System.out.printf("%d琌235计\n",a);
	        else if ((a%15)==0)  //3*5=15
	            System.out.printf("%d琌35计\n",a);	 
	        else if ((a%10)==0)  //2*5=10
	            System.out.printf("%d琌25计\n",a);		
	        else if ((a%6)==0)  //2*3=6
	            System.out.printf("%d琌23计\n",a);		        
	        else if ((a%2)==0)
	            System.out.printf("%d琌2计\n",a);
	        else if ((a%3)==0)
	            System.out.printf("%d琌3计\n",a);
	        else if ((a%5)==0)
	            System.out.printf("%d琌5计\n",a);	        
	        else
	            System.out.printf("%dぃ琌235计\n",a);
	       
	        sc.close();
	   }	    

        static void test357() {
        	//糶..
        }
}

