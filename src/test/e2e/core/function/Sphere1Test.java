
// Generated by hack/generate-e2e-test.py
package test.e2e.core.function;

import static org.junit.Assert.fail;
import org.junit.Test;
import test.e2e.core.E2eTestBase;

public class Sphere1Test extends E2eTestBase {

  public Sphere1Test() {
    coreCodeTemplate = "# sphere 1 https://processing.org/reference/sphere_.html\n\nsettings <- function() {\n    size(100, 100, P3D)\n}\n\nsetup <- function() {\n    noLoop()\n}\n\ndraw <- function() {\n    noStroke()\n    lights()\n    translate(58, 48, 0)\n    sphere(28)\n    saveFrame(\"%s\")\n    exit()\n}\n";
    referenceURI = "https://processing.org/reference/images/sphere_.png";
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