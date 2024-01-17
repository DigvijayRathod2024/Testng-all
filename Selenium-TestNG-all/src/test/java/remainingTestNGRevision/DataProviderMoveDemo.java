package remainingTestNGRevision;

import org.testng.annotations.DataProvider;



public class DataProviderMoveDemo {
	
	
	@DataProvider(name="create")
	public Object[][] dataset1()
	{
		return new Object[][]
				{{"standard_user", "secret_sauce"},
				{"locked_out_user",  "secret_sauce"},
				{"problem_user","secret_sauce"},
				{"performance_glitch_user","secret_sauce"}
				};
	}
	
	
}
