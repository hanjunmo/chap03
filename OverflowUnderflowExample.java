
public class OverflowUnderflowExample {

	public static void main(String[] args) {
		
		int bmax = Integer.MAX_VALUE;
		int bmin = Integer.MAX_VALUE;
		
		int max = Integer.MAX_VALUE;
		int min = Integer.MAX_VALUE;
		
		System.out.println("bmax=" + bmax);
		System.out.println("bmin=" + bmin);
		
		
		System.out.println("max=" + max);
		System.out.println("min=" + min);
		
		System.out.println("++max=" + ++max);   // overflow
		System.out.println("--min=" + --min);   // underflow

	}

}
