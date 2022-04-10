/**
 * 
 * @author John Maksuta
 * @course CPS231-610
 * @Instructor Dr. Tankeh
 * @since 04/10/2022
 * @purpose - Demonstrating Overloading.
 *
 */
public class Test {

	public static void main(String[] args) {
		// Create and initialize the a variable as instance of class A.
		A a = new A();
		// call the p(double) method.
		a.p(10.0);
		// call the p(int) method.
		a.p(10);
	}

	public static class B {

		/**
		 * This method prints out the parameter multiplied by 2.
		 * 
		 * @param i
		 *            - The parameter as double.
		 */
		public void p(double i) {
			System.out.println(i * 2);
		}

	}

	public static class A extends B {
		/**
		 * This method overloads the method p in class B.
		 * 
		 * @param i
		 *            - the parameter as integer.
		 */
		public void p(int i) {
			System.out.println(i * 2);
		}
	}

}
