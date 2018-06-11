/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 16:35:21 GMT 2018
 */

package uk.ac.sanger.artemis.sequence;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.ActionController;
import uk.ac.sanger.artemis.io.FastaStreamSequence;
import uk.ac.sanger.artemis.io.Range;
import uk.ac.sanger.artemis.sequence.Bases;
import uk.ac.sanger.artemis.sequence.MarkerInternal;
import uk.ac.sanger.artemis.sequence.SequenceChangeEvent;
import uk.ac.sanger.artemis.sequence.Strand;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SequenceChangeListener_ESTest extends SequenceChangeListener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ActionController actionController0 = new ActionController();
      Range range0 = new Range(1111);
      SequenceChangeEvent sequenceChangeEvent0 = new SequenceChangeEvent((-2531), (-2531), range0);
      actionController0.sequenceChanged(sequenceChangeEvent0);
      assertEquals(2, SequenceChangeEvent.INSERTION);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence("d 80rj25Y_jx$>;");
      Bases bases0 = new Bases(fastaStreamSequence0);
      Strand strand0 = bases0.getForwardStrand();
      MarkerInternal markerInternal0 = new MarkerInternal(strand0, 1);
      SequenceChangeEvent sequenceChangeEvent0 = new SequenceChangeEvent(bases0, 0);
      // Undeclared exception!
      try { 
        markerInternal0.sequenceChanged(sequenceChangeEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.sequence.MarkerInternal", e);
      }
  }
}