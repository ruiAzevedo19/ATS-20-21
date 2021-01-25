/*
 * This file was automatically generated by EvoSuite
 * Sun Dec 20 18:23:59 GMT 2020
 */

package model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import model.Encomenda;
import model.GPS;
import model.LinhaEncomenda;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Encomenda_ESTest extends Encomenda_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "Coordenadas:\nPos X: 0.0;\nPos Y: 0.0;\n";
      stringArray0[3] = "8";
      stringArray0[6] = "8";
      // Undeclared exception!
      try { 
        Encomenda.fromArgs(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<LinhaEncomenda> linkedList0 = new LinkedList<LinhaEncomenda>();
      Encomenda encomenda0 = new Encomenda("4#iWxS", "9 b", "4#iWxS", 214.4722833, linkedList0);
      double double0 = encomenda0.getPeso();
      assertEquals("9 b", encomenda0.getCodUtilizador());
      assertEquals("4#iWxS", encomenda0.getCodEncomenda());
      assertEquals(214.4722833, double0, 0.01);
      assertEquals("4#iWxS", encomenda0.getCodLoja());
      assertEquals(0.0, encomenda0.getDistancia(), 0.01);
      assertFalse(encomenda0.isAccepted());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      List<LinhaEncomenda> list0 = encomenda0.getLinha();
      Encomenda encomenda1 = new Encomenda("Qtj:3Zrwthm*", "", "Qtj:3Zrwthm*", (-1.0), list0);
      double double0 = encomenda1.getPeso();
      assertEquals((-1.0), double0, 0.01);
      assertEquals(0.0, encomenda0.getPeso(), 0.01);
      assertEquals(0.0, encomenda1.getDistancia(), 0.01);
      assertFalse(encomenda1.isAccepted());
      assertFalse(encomenda0.isAccepted());
      assertEquals(0.0, encomenda0.getDistancia(), 0.01);
      assertEquals("", encomenda1.getCodUtilizador());
      assertEquals("Qtj:3Zrwthm*", encomenda1.getCodEncomenda());
      assertEquals("Qtj:3Zrwthm*", encomenda1.getCodLoja());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedList<LinhaEncomenda> linkedList0 = new LinkedList<LinhaEncomenda>();
      linkedList0.offerFirst((LinhaEncomenda) null);
      Encomenda encomenda0 = new Encomenda(", peso=", ", peso=", ", peso=", (-3212.88), linkedList0);
      encomenda0.getLinha();
      assertEquals((-3212.88), encomenda0.getPeso(), 0.01);
      assertEquals(0.0, encomenda0.getDistancia(), 0.01);
      assertFalse(encomenda0.isAccepted());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      GPS gPS0 = new GPS();
      GPS gPS1 = new GPS(gPS0);
      gPS1.setY(1045.5696203);
      encomenda0.setDistancia(gPS1, gPS0);
      double double0 = encomenda0.getDistancia();
      assertEquals(1045.5696203, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedList<LinhaEncomenda> linkedList0 = new LinkedList<LinhaEncomenda>();
      Encomenda encomenda0 = new Encomenda((String) null, (String) null, ":", 1.0, linkedList0);
      String string0 = encomenda0.getCodUtilizador();
      assertEquals(1.0, encomenda0.getPeso(), 0.01);
      assertFalse(encomenda0.isAccepted());
      assertEquals(0.0, encomenda0.getDistancia(), 0.01);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.setCodUtilizador("ug-tNIC!y>A).NZm");
      encomenda0.getCodUtilizador();
      assertEquals(0.0, encomenda0.getPeso(), 0.01);
      assertFalse(encomenda0.isAccepted());
      assertEquals(0.0, encomenda0.getDistancia(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.setCodTransporte((String) null);
      encomenda0.getCodTransporte();
      assertFalse(encomenda0.isAccepted());
      assertEquals(0.0, encomenda0.getPeso(), 0.01);
      assertEquals(0.0, encomenda0.getDistancia(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.setCodTransporte(":");
      encomenda0.getCodTransporte();
      assertEquals(0.0, encomenda0.getDistancia(), 0.01);
      assertFalse(encomenda0.isAccepted());
      assertEquals(0.0, encomenda0.getPeso(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<LinhaEncomenda> linkedList0 = new LinkedList<LinhaEncomenda>();
      Encomenda encomenda0 = new Encomenda("4#iWxS", "9 b", "4#iWxS", 214.4722833, linkedList0);
      String string0 = encomenda0.getCodLoja();
      assertEquals(214.4722833, encomenda0.getPeso(), 0.01);
      assertEquals("4#iWxS", string0);
      assertEquals("4#iWxS", encomenda0.getCodEncomenda());
      assertFalse(encomenda0.isAccepted());
      assertEquals(0.0, encomenda0.getDistancia(), 0.01);
      assertEquals("9 b", encomenda0.getCodUtilizador());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.setCodEncomenda((String) null);
      encomenda0.getCodEncomenda();
      assertFalse(encomenda0.isAccepted());
      assertEquals(0.0, encomenda0.getDistancia(), 0.01);
      assertEquals(0.0, encomenda0.getPeso(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      List<LinhaEncomenda> list0 = encomenda0.getLinha();
      Encomenda encomenda1 = new Encomenda("Qtj:3Zrwthm*", "", "Qtj:3Zrwthm*", (-1.0), list0);
      String string0 = encomenda1.getCodEncomenda();
      assertFalse(encomenda0.isAccepted());
      assertEquals(0.0, encomenda1.getDistancia(), 0.01);
      assertEquals(0.0, encomenda0.getDistancia(), 0.01);
      assertFalse(encomenda1.isAccepted());
      assertEquals((-1.0), encomenda1.getPeso(), 0.01);
      assertEquals("Qtj:3Zrwthm*", string0);
      assertEquals("", encomenda1.getCodUtilizador());
      assertEquals(0.0, encomenda0.getPeso(), 0.01);
      assertEquals("Qtj:3Zrwthm*", encomenda1.getCodLoja());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      List<LinhaEncomenda> list0 = encomenda0.getLinha();
      Encomenda encomenda1 = new Encomenda("cs\"r%>{Gw( KAo^", "cs\"r%>{Gw( KAo^", "cs\"r%>{Gw( KAo^", 0.0, list0);
      int int0 = encomenda1.compareTo(encomenda0);
      assertEquals(0.0, encomenda1.getPeso(), 0.01);
      assertFalse(encomenda0.isAccepted());
      assertEquals(0.0, encomenda0.getPeso(), 0.01);
      assertEquals(0.0, encomenda0.getDistancia(), 0.01);
      assertFalse(encomenda1.isAccepted());
      assertEquals(16, int0);
      assertEquals(0.0, encomenda1.getDistancia(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.setPeso(2025.285846094107);
      encomenda0.clone();
      assertEquals(2025.285846094107, encomenda0.getPeso(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedList<LinhaEncomenda> linkedList0 = new LinkedList<LinhaEncomenda>();
      Encomenda encomenda0 = new Encomenda("C[>W", "C[>W", "", (-1.0), linkedList0);
      assertEquals(0.0, encomenda0.getDistancia(), 0.01);
      
      GPS gPS0 = new GPS((-1.0), 0.0);
      GPS gPS1 = new GPS();
      encomenda0.setDistancia(gPS0, gPS1);
      encomenda0.clone();
      assertEquals(1.0, encomenda0.getDistancia(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      GPS gPS0 = new GPS();
      // Undeclared exception!
      try { 
        encomenda0.setDistancia((GPS) null, gPS0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("model.Encomenda", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "Coordenadas:\nPos X: 3676.3829476101973;\nPos Y: 3676.3829476101973;\n";
      stringArray0[3] = "8";
      stringArray0[6] = "bi+uX,4wx`0LAQ+}Wra";
      // Undeclared exception!
      try { 
        Encomenda.fromArgs(stringArray0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "";
      // Undeclared exception!
      try { 
        Encomenda.fromArgs(stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("model.Encomenda", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.setCodEncomenda((String) null);
      // Undeclared exception!
      try { 
        encomenda0.compareTo(encomenda0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("model.Encomenda", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Encomenda encomenda0 = null;
      try {
        encomenda0 = new Encomenda((Encomenda) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("model.Encomenda", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Encomenda encomenda0 = null;
      try {
        encomenda0 = new Encomenda(", preco=", ", preco=", ":)a;iZX>", 0.0, (List<LinhaEncomenda>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.getCodLoja();
      assertEquals(0.0, encomenda0.getPeso(), 0.01);
      assertEquals(0.0, encomenda0.getDistancia(), 0.01);
      assertFalse(encomenda0.isAccepted());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      double double0 = encomenda0.getPeso();
      assertEquals(0.0, encomenda0.getDistancia(), 0.01);
      assertFalse(encomenda0.isAccepted());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      double double0 = encomenda0.getDistancia();
      assertFalse(encomenda0.isAccepted());
      assertEquals(0.0, encomenda0.getPeso(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.getCodEncomenda();
      assertEquals(0.0, encomenda0.getDistancia(), 0.01);
      assertFalse(encomenda0.isAccepted());
      assertEquals(0.0, encomenda0.getPeso(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.getCodUtilizador();
      assertEquals(0.0, encomenda0.getPeso(), 0.01);
      assertFalse(encomenda0.isAccepted());
      assertEquals(0.0, encomenda0.getDistancia(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      Encomenda encomenda1 = new Encomenda();
      assertTrue(encomenda1.equals((Object)encomenda0));
      
      String[] stringArray0 = new String[8];
      encomenda1.setCodLoja(stringArray0[1]);
      boolean boolean0 = encomenda1.equals(encomenda0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      Encomenda encomenda1 = new Encomenda();
      assertTrue(encomenda1.equals((Object)encomenda0));
      
      encomenda0.setCodUtilizador("cs\"r%>{Gw( KAo^");
      boolean boolean0 = encomenda1.equals(encomenda0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      LinkedList<LinhaEncomenda> linkedList0 = new LinkedList<LinhaEncomenda>();
      Encomenda encomenda1 = new Encomenda("cs\"r%>{Gw( KAo^", "cs\"r%>{Gw( KAo^", "cs\"r%>{Gw( KAo^", 0.0, linkedList0);
      boolean boolean0 = encomenda1.equals(encomenda0);
      assertEquals(0.0, encomenda0.getPeso(), 0.01);
      assertFalse(boolean0);
      assertEquals(0.0, encomenda1.getPeso(), 0.01);
      assertFalse(encomenda1.isAccepted());
      assertFalse(encomenda0.isAccepted());
      assertEquals(0.0, encomenda1.getDistancia(), 0.01);
      assertEquals(0.0, encomenda0.getDistancia(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      Encomenda encomenda1 = new Encomenda(encomenda0);
      boolean boolean0 = encomenda0.equals(encomenda1);
      assertFalse(encomenda1.isAccepted());
      assertEquals(0.0, encomenda0.getDistancia(), 0.01);
      assertFalse(encomenda0.isAccepted());
      assertTrue(boolean0);
      assertEquals(0.0, encomenda1.getPeso(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      boolean boolean0 = encomenda0.equals("");
      assertFalse(encomenda0.isAccepted());
      assertEquals(0.0, encomenda0.getDistancia(), 0.01);
      assertEquals(0.0, encomenda0.getPeso(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      boolean boolean0 = encomenda0.equals((Object) null);
      assertFalse(boolean0);
      assertEquals(0.0, encomenda0.getDistancia(), 0.01);
      assertEquals(0.0, encomenda0.getPeso(), 0.01);
      assertFalse(encomenda0.isAccepted());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      boolean boolean0 = encomenda0.equals(encomenda0);
      assertFalse(encomenda0.isAccepted());
      assertEquals(0.0, encomenda0.getPeso(), 0.01);
      assertEquals(0.0, encomenda0.getDistancia(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      Encomenda encomenda1 = new Encomenda(encomenda0);
      encomenda0.setPeso((-2212.0));
      boolean boolean0 = encomenda0.equals(encomenda1);
      assertEquals((-2212.0), encomenda0.getPeso(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String[] stringArray0 = new String[5];
      Encomenda encomenda0 = Encomenda.fromArgs(stringArray0);
      assertNull(encomenda0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.hashCode();
      assertEquals(0.0, encomenda0.getDistancia(), 0.01);
      assertEquals(0.0, encomenda0.getPeso(), 0.01);
      assertFalse(encomenda0.isAccepted());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      List<LinhaEncomenda> list0 = encomenda0.getLinha();
      Encomenda encomenda1 = new Encomenda("2=[ag+%=otXkQ7GSX", "", (String) null, 1045.5696203, list0);
      int int0 = encomenda0.compareTo(encomenda1);
      assertFalse(encomenda1.isAccepted());
      assertEquals(0.0, encomenda1.getDistancia(), 0.01);
      assertFalse(encomenda0.isAccepted());
      assertEquals(1045.5696203, encomenda1.getPeso(), 0.01);
      assertEquals((-17), int0);
      assertEquals(0.0, encomenda0.getDistancia(), 0.01);
      assertEquals(0.0, encomenda0.getPeso(), 0.01);
      assertEquals("", encomenda1.getCodUtilizador());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      assertFalse(encomenda0.isAccepted());
      
      encomenda0.setAccepted(true);
      boolean boolean0 = encomenda0.isAccepted();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      boolean boolean0 = encomenda0.isAccepted();
      assertEquals(0.0, encomenda0.getDistancia(), 0.01);
      assertEquals(0.0, encomenda0.getPeso(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.getCodTransporte();
      assertEquals(0.0, encomenda0.getDistancia(), 0.01);
      assertEquals(0.0, encomenda0.getPeso(), 0.01);
      assertFalse(encomenda0.isAccepted());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      Encomenda encomenda1 = encomenda0.clone();
      encomenda1.setPeso(970.3610300345);
      boolean boolean0 = encomenda1.equals(encomenda0);
      assertEquals(970.3610300345, encomenda1.getPeso(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      String string0 = encomenda0.toString();
      assertFalse(encomenda0.isAccepted());
      assertEquals("Model.Encomenda{cod_Encomenda='', cod_Utilizador='', codLoja='', peso=0.0, linha=[]}", string0);
      assertEquals(0.0, encomenda0.getDistancia(), 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.compareTo(encomenda0);
      assertFalse(encomenda0.isAccepted());
      assertEquals(0.0, encomenda0.getPeso(), 0.01);
      assertEquals(0.0, encomenda0.getDistancia(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.setCodLoja((String) null);
      encomenda0.getCodLoja();
      assertEquals(0.0, encomenda0.getDistancia(), 0.01);
      assertEquals(0.0, encomenda0.getPeso(), 0.01);
      assertFalse(encomenda0.isAccepted());
  }
}
