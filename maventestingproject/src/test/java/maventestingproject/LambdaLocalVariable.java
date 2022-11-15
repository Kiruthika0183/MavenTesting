package maventestingproject;

import java.util.Arrays;
import java.util.List;

public class LambdaLocalVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<Integer> intSeq=Arrays.asList(1,2,3);
		
		intSeq.forEach(x->{
			int y=x*2;
		
		System.out.println(y);	 
		});
		
		

	}

}
