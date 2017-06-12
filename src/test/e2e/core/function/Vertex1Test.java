
// Generated by hack/generate-e2e-test.py
package test.e2e.core.function;

import static org.junit.Assert.fail;
import org.junit.Test;
import test.e2e.core.E2eTestBase;

public class Vertex1Test extends E2eTestBase {

  public Vertex1Test() {
    coreCodeTemplate = "POINTS <- as.integer(3)\nP3D <- \"processing.opengl.PGraphics3D\"\n\nsettings <- function() {\n    size(100, 100, P3D)\n}\n\ndraw <- function() {\n    beginShape(POINTS)\n    vertex(30, 20, -50)\n    vertex(85, 20, -50)\n    vertex(85, 75, -50)\n    vertex(30, 75, -50)\n    endShape()\n    saveFrame(\"%s\")\n    exit()\n}\n";
    referenceURI = "https://processing.org/reference/images/vertex_1.png";
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