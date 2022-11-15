package com.mockito;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.*;
public class ApplicationTest {
	@InjectMocks
	MainClass mainClass;

	@Mock
	DatabaseDAO dependentClassOne;

	@Mock
	NetworkDAO dependentClassTwo;

	@Before
	public void init() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	public void validateTest()
	{
                //record expectations with mock methods
                when(dependentClassOne.save("sdfffg")).thenReturn(true);
                when(dependentClassTwo.save("sdfffg")).thenReturn(true);

		boolean saved = mainClass.save("E://temp.txt");
		assertEquals(true, saved);

                //verify recorded expectations
	}

	

}
