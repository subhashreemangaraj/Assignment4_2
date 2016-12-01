
public class Assignment4_2 {
	
		private void method1(){
		 System.out.println ("Parent's method1()");
		}
		public void method2() {
		 System.out.println ("Parent's method2()");
		method1();
		}
		
}


//output:C. Prints : Parent's method2()
//			Parent's method1()




