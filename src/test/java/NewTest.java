import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("This is a testNG test ");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is before test ");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is after test ");
	  
  }

}
