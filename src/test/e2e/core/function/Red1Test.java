
// Generated by hack/generate-e2e-test.py
package test.e2e.core.function;

import static org.junit.Assert.fail;
import org.junit.Test;
import test.e2e.core.E2eTestBase;

public class Red1Test extends E2eTestBase {

  public Red1Test() {
    coreCodeTemplate = "c = color(255, 204, 0)  # Define color 'c'\nfill(c)  # Use color variable 'c' as fill color\nrect(15, 20, 35, 60)  # Draw left rectangle\n\nredValue = red(c)  # Get red in 'c'\nprintln(redValue)  # Print '255.0'\nfill(redValue, 0, 0)  # Use 'redValue' in new fill\nrect(50, 20, 35, 60)  # Draw right rectangle\n\nsaveFrame(\"%s\")\nexit()\n";
    referenceURI = "https://processing.org/reference/images/red_.png";
  }

  @Test
  public void test() {
    try {
      defaultOperation();
    } catch (Exception exception) {
      System.err.println(exception);
      fail("Should not have thrown any exception");
    }
  }
}