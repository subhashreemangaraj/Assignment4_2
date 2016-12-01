
public class Assignment4_2_1 extends Assignment4_2{
	
	public void method1() {
		 System.out.println ("Child's method1()");
		} 
	
	public static void main(String args[]) {
		Assignment4_2 p = new Assignment4_2_1();
		p.method2();
		}

}

//output:C. Prints : Parent's method2()
//			Parent's method1()

