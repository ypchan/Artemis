/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 15:46:23 GMT 2018
 */

package uk.ac.sanger.artemis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.io.PipedReader;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.MegaBlastComparisonData;
import uk.ac.sanger.artemis.SimpleComparisonData;
import uk.ac.sanger.artemis.util.LinePushBackReader;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MegaBlastComparisonData_ESTest extends MegaBlastComparisonData_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MegaBlastComparisonData megaBlastComparisonData0 = new MegaBlastComparisonData();
      // Undeclared exception!
      try { 
        megaBlastComparisonData0.makeMatchFromString((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.StringTokenizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        MegaBlastComparisonData.formatCorrect((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.StringTokenizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MegaBlastComparisonData megaBlastComparisonData0 = null;
      try {
        megaBlastComparisonData0 = new MegaBlastComparisonData((LinePushBackReader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.SimpleComparisonData", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      LinePushBackReader linePushBackReader0 = new LinePushBackReader(pipedReader0);
      MegaBlastComparisonData megaBlastComparisonData0 = null;
      try {
        megaBlastComparisonData0 = new MegaBlastComparisonData(linePushBackReader0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StringReader stringReader0 = new StringReader("BUG: Attempting to add duplicate filter ");
      LinePushBackReader linePushBackReader0 = new LinePushBackReader(stringReader0);
      MegaBlastComparisonData megaBlastComparisonData0 = null;
      try {
        megaBlastComparisonData0 = new MegaBlastComparisonData(linePushBackReader0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // while reading MegaBlast data: first field (BUG:) is badly formatted in this line: BUG: Attempting to add duplicate filter 
         //
         verifyException("uk.ac.sanger.artemis.MegaBlastComparisonData", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MegaBlastComparisonData megaBlastComparisonData0 = new MegaBlastComparisonData();
      SimpleComparisonData simpleComparisonData0 = megaBlastComparisonData0.getNewSimpleComparisonData();
      assertNotSame(simpleComparisonData0, megaBlastComparisonData0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      boolean boolean0 = MegaBlastComparisonData.formatCorrect(") is badly formatted in this line: ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      LinePushBackReader linePushBackReader0 = new LinePushBackReader(stringReader0);
      MegaBlastComparisonData megaBlastComparisonData0 = new MegaBlastComparisonData(linePushBackReader0);
      try { 
        megaBlastComparisonData0.makeMatchFromString("");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // while reading MegaBlast data: not enough fields in this line: 
         //
         verifyException("uk.ac.sanger.artemis.MegaBlastComparisonData", e);
      }
  }
}
