package assignment3.Bruce;

public class CalcImpl {

	static int a = 4;
	static int b = 7;
	CalcInterface obj;
	
	public int add(int a, int b) {		
		return obj.add(a, b);
	}

	public int subtract(int a, int b) {	
		return obj.subtract(a, b);
	}

	public int multiply(int a, int b) {		
		return obj.multiply(a, b);
	}

	public double divide(int a, int b) {		
		return (double) obj.divide(a, b);
//		System.out.println(obj.divide(a, b));
	}
	
	public void setIntObj(CalcInterface obj){
		this.obj = obj;
	}

	public static void main(String[] args) {
		CalcInterface obj = null;
		obj.add(a, b);
		obj.subtract(a, b);
		obj.multiply(a, b);
		obj.divide(a, b);

	}

}
