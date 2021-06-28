
public class OverloadedMethods {

	public static void main(String[] args) {
		OverloadedMethods om = new OverloadedMethods();
		
		om.print();
		om.print("           ");
		om.print("Print one line");
		om.print("Fist line", "Second line");
	}
	
	public void print() {
		System.out.println("original print method");
	}
	
	public void print(String s) {
		System.out.println(s);
	}
	
	public void print(String s1, String s2) {
		System.out.println(s1 + ", " + s2);
	}
	
}
