/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 10:36:05 GMT 2018
 */

package uk.ac.sanger.artemis.chado;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import javax.swing.JPasswordField;
import javax.swing.event.AncestorListener;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.chado.SqlMapClientWrapper;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SqlMapClientWrapper_ESTest extends SqlMapClientWrapper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JPasswordField jPasswordField0 = new JPasswordField(1140);
      SqlMapClientWrapper sqlMapClientWrapper0 = null;
      try {
        sqlMapClientWrapper0 = new SqlMapClientWrapper(jPasswordField0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Error initializing DbSqlConfig class.  Cause: org.evosuite.runtime.mock.java.lang.MockThrowable: Error occurred.  Cause: org.evosuite.runtime.mock.java.lang.MockThrowable: Error parsing XML.  Cause: org.evosuite.runtime.mock.java.lang.MockThrowable: Error parsing XPath '/sqlMapConfig/sqlMap'.  Cause: org.evosuite.runtime.mock.java.lang.MockThrowable: Error parsing XML.  Cause: org.evosuite.runtime.TooManyResourcesException: Loop has been executed more times than the allowed 10000
         //
         verifyException("uk.ac.sanger.artemis.chado.DbSqlConfig", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JPasswordField jPasswordField0 = new JPasswordField();
      SqlMapClientWrapper sqlMapClientWrapper0 = null;
      try {
        sqlMapClientWrapper0 = new SqlMapClientWrapper(jPasswordField0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Error initializing DbSqlConfig class.  Cause: org.evosuite.runtime.mock.java.lang.MockThrowable: Error occurred.  Cause: org.evosuite.runtime.mock.java.lang.MockThrowable: Error parsing XML.  Cause: org.evosuite.runtime.mock.java.lang.MockThrowable: Error parsing XPath '/sqlMapConfig/sqlMap'.  Cause: org.evosuite.runtime.mock.java.lang.MockThrowable: Error parsing XML.  Cause: org.evosuite.runtime.TooManyResourcesException: Loop has been executed more times than the allowed 10000
         //
         verifyException("uk.ac.sanger.artemis.chado.DbSqlConfig", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JPasswordField jPasswordField0 = new JPasswordField(" \n");
      jPasswordField0.removeAncestorListener((AncestorListener) null);
      SqlMapClientWrapper sqlMapClientWrapper0 = null;
      try {
        sqlMapClientWrapper0 = new SqlMapClientWrapper(jPasswordField0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Error initializing DbSqlConfig class.  Cause: org.evosuite.runtime.mock.java.lang.MockThrowable: Error occurred.  Cause: org.evosuite.runtime.mock.java.lang.MockThrowable: Error parsing XML.  Cause: org.evosuite.runtime.mock.java.lang.MockThrowable: Error parsing XPath '/sqlMapConfig/sqlMap'.  Cause: org.evosuite.runtime.mock.java.lang.MockThrowable: Error parsing XML.  Cause: org.evosuite.runtime.TooManyResourcesException: Loop has been executed more times than the allowed 10000
         //
         verifyException("uk.ac.sanger.artemis.chado.DbSqlConfig", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JPasswordField jPasswordField0 = new JPasswordField(0);
      SqlMapClientWrapper sqlMapClientWrapper0 = null;
      try {
        sqlMapClientWrapper0 = new SqlMapClientWrapper(jPasswordField0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Error initializing DbSqlConfig class.  Cause: org.evosuite.runtime.mock.java.lang.MockThrowable: Error occurred.  Cause: org.evosuite.runtime.mock.java.lang.MockThrowable: Error parsing XML.  Cause: org.evosuite.runtime.mock.java.lang.MockThrowable: Error parsing XPath '/sqlMapConfig/sqlMap'.  Cause: org.evosuite.runtime.mock.java.lang.MockThrowable: Error parsing XML.  Cause: org.evosuite.runtime.TooManyResourcesException: Loop has been executed more times than the allowed 10000
         //
         verifyException("uk.ac.sanger.artemis.chado.DbSqlConfig", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JPasswordField jPasswordField0 = null;
      SqlMapClientWrapper sqlMapClientWrapper0 = null;
      try {
        sqlMapClientWrapper0 = new SqlMapClientWrapper((JPasswordField) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Error initializing DbSqlConfig class.  Cause: org.evosuite.runtime.mock.java.lang.MockThrowable: Error occurred.  Cause: org.evosuite.runtime.mock.java.lang.MockThrowable: Error parsing XML.  Cause: org.evosuite.runtime.mock.java.lang.MockThrowable: Error parsing XPath '/sqlMapConfig/sqlMap'.  Cause: org.evosuite.runtime.mock.java.lang.MockThrowable: Error parsing XML.  Cause: org.evosuite.runtime.TooManyResourcesException: Loop has been executed more times than the allowed 10000
         //
         verifyException("uk.ac.sanger.artemis.chado.DbSqlConfig", e);
      }
  }
}