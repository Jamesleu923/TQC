package TQC01;

public class JPA106 {

	//�禡�@ (���Function) (��kMethod) �D�禡
	public static void main(String[] args) {
		
		countf CountFunction=new countf();
		
		JPA106 MyFunction=new JPA106();
		
		double x;
		x = -3.2;
		System.out.printf("f(%.1f) = %4.4f\n",x,MyFunction.f(x));
		x = -2.1;
		System.out.printf("f(%.1f) = %4.4f\n",x,CountFunction.f(x));
		x = 0;
		System.out.printf("f(%.1f) = %4.4f\n",x,countf2.f(x));
		x = 2.1;
		System.out.printf("f(%.1f) = %4.4f\n",x,f(x));
	}
	
	//�禡�G (���Function)(��kMethod) f(x)=3x^3+2x-1
	 static double f(double d) {
		return (3*(Math.pow(d, 3))+2*d-1);
	}
	
}

class countf{	
	public double f(double d) {
		return (3*(Math.pow(d, 3))+2*d-1);
	}
}

class countf2{	
	public static double f(double d) {
		return (3*(Math.pow(d, 3))+2*d-1);
	}
}
