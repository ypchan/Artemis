/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 14:07:17 GMT 2018
 */

package uk.ac.sanger.artemis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.ExternalProgramEvent;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ExternalProgramEvent_ESTest extends ExternalProgramEvent_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ExternalProgramEvent externalProgramEvent0 = new ExternalProgramEvent(1, "", (Process) null);
      int int0 = externalProgramEvent0.getType();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ExternalProgramEvent externalProgramEvent0 = new ExternalProgramEvent((-518), "5fe$vd% )Ps6uqN,TtV", (Process) null);
      int int0 = externalProgramEvent0.getType();
      assertEquals((-518), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Process process0 = mock(Process.class, new ViolatedAssumptionAnswer());
      ExternalProgramEvent externalProgramEvent0 = new ExternalProgramEvent(33, (String) null, process0);
      externalProgramEvent0.getMessage();
      assertEquals(33, externalProgramEvent0.getType());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ExternalProgramEvent externalProgramEvent0 = new ExternalProgramEvent((-518), "5fe$vd% )Ps6uqN,TtV", (Process) null);
      externalProgramEvent0.getMessage();
      assertEquals((-518), externalProgramEvent0.getType());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ExternalProgramEvent externalProgramEvent0 = new ExternalProgramEvent(1, "", (Process) null);
      externalProgramEvent0.getMessage();
      assertEquals(1, externalProgramEvent0.getType());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ExternalProgramEvent externalProgramEvent0 = new ExternalProgramEvent(0, "V[I>X<rP]V", (Process) null);
      int int0 = externalProgramEvent0.getType();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ExternalProgramEvent externalProgramEvent0 = new ExternalProgramEvent(0, "V[I>X<rP]V", (Process) null);
      externalProgramEvent0.getProcess();
      assertEquals(0, externalProgramEvent0.getType());
  }
}