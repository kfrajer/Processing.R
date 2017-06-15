
// Generated by hack/generate-e2e-test.py
package test.e2e.core.function;

import static org.junit.Assert.fail;
import org.junit.Test;
import test.e2e.core.E2eTestBase;

public class Specular0Test extends E2eTestBase {

  public Specular0Test() {
    coreCodeTemplate = "P3D <- \"processing.opengl.PGraphics3D\"\n\nsettings <- function() {\n    size(100, 100, P3D)\n}\n\ndraw <- function() {\n    background(0)\n    noStroke()\n    background(0)\n    fill(0, 51, 102)\n    lightSpecular(255, 255, 255)\n    directionalLight(204, 204, 204, 0, 0, -1)\n    translate(20, 50, 0)\n    specular(255, 255, 255)\n    sphere(30)\n    translate(60, 0, 0)\n    specular(204, 102, 0)\n    sphere(30)\n    saveFrame(\"%s\")\n    exit()\n}\n";
    referenceURI = "https://processing.org/reference/images/specular_.png";
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