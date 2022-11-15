package com.java8;

public class LamdaExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int speed=200;
		/*old method
		 Runnable r=new Runnable();
		  public void run()
		  {
		  System.out.println("Running at the speed of "+speed);
		  }
		  r.run(); */
		
		//new approah lamda expressions
		
		/*withpoutParameter
		 Don't have to give parameter in interface's body like //public void run();
		LamdaEx r=()->{
			System.out.println("Running at the speed of "+speed);
		};
		r.run();*/
		
		//with Parameter
		LamdaEx r1=(int c)->{
			System.out.println("Running at the speed of "+c);
		};
		r1.run(speed);

	}

}
