/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 13:00:18 GMT 2018
 */

package uk.ac.sanger.artemis.components;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.ProgressThread;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ProgressThread_ESTest extends ProgressThread_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ProgressThread progressThread0 = new ProgressThread((JFrame) null, "fjS(AJ5x#:/{.2[R");
      // Undeclared exception!
      try { 
        progressThread0.run();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ProgressThread progressThread0 = new ProgressThread((JFrame) null, "");
      progressThread0.finished();
      assertEquals(0, progressThread0.countStackFrames());
  }
}