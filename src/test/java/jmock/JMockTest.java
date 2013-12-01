package jmock;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.junit.Before;
import org.junit.Test;

public class JMockTest {

	Mockery mock;
	ISocialNetwork instance;

	@Before
	public void init() {
		mock = new JUnit4Mockery();
		instance = new FacebookImitation();
	}

	@Test
	public void logTest() {
		final ILogger logger = mock.mock(ILogger.class);
		final String name = "John@gmail.com";
		final String pw = "SecretPassword";
		
		instance.setLogger(logger);

		mock.checking(new Expectations() {
			{
				one(logger).checkLogData(name, pw);
			}
		});

		instance.logIn(name, pw);
	}
}
