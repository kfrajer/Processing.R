
// Generated by hack/generate-e2e-test.py
package test.e2e.core.function;

import static org.junit.Assert.fail;
import org.junit.Test;
import test.e2e.core.E2eTestBase;

public class BeginShape3Test extends E2eTestBase {

  public BeginShape3Test() {
    coreCodeTemplate = "# beginShape 3 https://processing.org/reference/beginShape_.html\n\nbeginShape(LINES)\nvertex(30, 20)\nvertex(85, 20)\nvertex(85, 75)\nvertex(30, 75)\nendShape()\n\nsaveFrame(\"%s\")\nexit()\n";
    referenceURI = "https://processing.org/reference/images/beginShape_2.png";
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