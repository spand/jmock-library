package testdata.jmock.acceptance.junit4;

import org.jmock.Mockery;
import org.jmock.integration.junit4.JMock;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.junit.runner.RunWith;

@RunWith(JMock.class)
public class BaseClassWithMockery {
    protected Mockery context = new JUnit4Mockery();
}
