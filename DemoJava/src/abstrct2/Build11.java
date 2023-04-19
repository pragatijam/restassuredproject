package abstrct2;

public abstract class Build11 {
	
	public void stockexchange() {
		System.out.println("logic for share and exchange");
	}
	public void mutualfunds() {
		 System.out.println("implemented");
	 }
	void test() {
		 System.out.println("implemented test");      //default method so public not used
	}
	abstract void notimplemented();
	
	public static void check() {
		 System.out.println("complete body required");       //for static method
	}

}
