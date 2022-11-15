package defaultEx;
interface message{
	default void say()
	{
		System.out.println("Hello,this is default method");
	}
	void say1(String s);
	}
public class DefaultExample implements message{
	public void say1(String s)
	{
		System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultExample dExample=new DefaultExample();
		dExample.say();
		dExample.say1("Hello,this is normal method");
		

	}

}
