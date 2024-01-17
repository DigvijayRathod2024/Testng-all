package testNGall;

import org.testng.annotations.DataProvider;

public class MoveDataDemo {


		
		@DataProvider(name="tests")
		public Object[][] datset()
		{
			return new Object[][]
			{
			
				{"standard_user", "secret_sauce"},
				{"problem_user", "secret_sauce"}
				
			};
		}

	}
	

