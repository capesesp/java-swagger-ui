package br.com.capesesp.opus;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.mockito.Mockito.*;

/**
 * Dummy test 
 */
public class DummyTest extends TestCase {

  /**
   * Create the test case
   * @param testName name of the test case
   */
  public DummyTest(String testName) {
    super(testName);
  }

  /**
   * @return the suite of tests being tested
   */
  public static Test suite() {
    return new TestSuite(DummyTest.class);
  }

  /**
   * Rigourous Test :-)
   */
  public void testRigourous() {
    assertTrue(true);
  }
}
