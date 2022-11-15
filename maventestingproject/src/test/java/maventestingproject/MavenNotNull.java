package maventestingproject;



import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class MavenNotNull {
	public String getPropValue(final String key)
	{
		Map<String,String> appProps=new HashMap<String,String>();
		appProps.put("key1", "value1");
		appProps.put("key2", "value2");
		appProps.put("key3", "value3");
		return appProps.get(key);
	}
	@Test
	public void test()
	{
		MavenNotNull  msnt=new MavenNotNull ();
		assertNotNull(msnt.getPropValue("key1"));
	}
		
		
	}


