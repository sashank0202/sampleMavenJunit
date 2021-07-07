package hello;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

public class GreeterTest {

  private Greeter greeter = new Greeter();

  @Test
  public void greeterSaysHello1() {
    assertThat(greeter.sayHello(), containsString("Bye"));
  }
  
    @Test
  public void greeterSaysHello2() {
    assertThat(greeter.sayHello(), containsString("sashank"));
  }
  
    @Test
  public void greeterSaysHello3() {
    assertThat(greeter.sayHello(), containsString("sai"));
  }

}
