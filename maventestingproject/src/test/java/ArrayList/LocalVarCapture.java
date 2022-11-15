package ArrayList;

import java.util.Arrays;
import java.util.List;

public class LocalVarCapture {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			List<Integer>intSeq=Arrays.asList(1,2,3);
			int var=10;
			intSeq.forEach(x->System.out.println(x+var));
			//intSeq.forEach(System.out::println);
		

	}

}
