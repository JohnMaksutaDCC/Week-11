/**
 * 
 * @author John Maksuta
 * @course CPS231-610
 * @Instructor Dr. Tankeh
 * @since 04/10/2022
 * @purpose - Demonstrating Overriding.
 *
 */
public class Test2 {

	public static void main(String[] args) {
		// Create and initialize the a variable as instance of class A.
		A a = new A();
		// call the p(double) method.
		a.p(10.0);
		// call the p(double) method where the input is an int that is widened
		// to double.
		a.p(10);
	}

	public static class B {
		/**
		 * This method prints out the parameter multiplied by 2.
		 * @param i - The parameter as double.
		 */
		public void p(double i) {
			System.out.println(i * 2);
		}
	}

	public static class A extends B {
		
		/**
		 * This method overrides the p(double) method in class B.
		 */
		public void p(double i) {
			System.out.println(i);
		}
	}

}
