package assignments;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class Tables {

	public static void main(String[] args) {
		
		for(int i = 1;i<=20;i++)
		{
			if (i==6 || i== 12 || i == 17)
				continue;
			else {
			System.out.print(i + " = ");
			for(int j = 1 ; j<=20;j++) {
				
				System.out.print(i*j + " ");
				
			}
			System.out.println();	
			}
			}
	}

}
