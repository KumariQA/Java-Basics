package corejava;

public class Methods {

	public void meth1(int a)
		{
			System.out.println("meth()1 called");
			System.out.println("a value is: "+a);
		}
				 public void meth2(int a,String s)
				{
					System.out.println("meth()2 called");
					System.out.println("a value is " +a+ ", " + "s value is "+ s);
					
				}
				 public static void main(String args[]) {
					 Methods aobj=new Methods();
					 aobj.meth1(45);
					 aobj.meth2(32, "welcome to java programming");
					 new Methods().meth2(11, "Bye");
				 }
			
		
	}


