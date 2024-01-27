package corejava;

public class ClassA {

		public int meth1(int a)
		{
			System.out.println("Hi");
			return 100+a;
		}
		public void meth2() {
			System.out.println("Hello");
		}
		public static void main(String[] args) {
			ClassA aobj=new ClassA();
			
//			int result=aobj.meth1(100);
//			System.out.println(result);
			
//			aobj.meth1(100);
			
			System.out.println(aobj.meth1(100));
			
			aobj.meth2();
	}

}
