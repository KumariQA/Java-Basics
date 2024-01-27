package corejava;


public class P2methods {
	public void meth1(int a) 
//	{
//		System.out.println("hii");
//	}
//	void meth2()
//	{
//		System.out.println("hello");
//	}
//
//	public static void main(String[] args) {
//		P2methods aobj=new P2methods();
//		aobj.meth1();
//		aobj.meth2();
//		System.out.println("Namaste");
	
	
	{
	System.out.println("meth()1 called");
		System.out.println("a value is..:"+a);
	}
	public static void main(String[] args) {
		P2methods aobj=new P2methods();
		aobj.meth1(50);
		new P2methods().meth1(20);
	}
}
	
	
	
	
	
	
	
	
	


