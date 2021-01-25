/*
 * This file was automatically generated by EvoSuite
 * Sun Dec 20 19:28:49 GMT 2020
 */

package model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.AbstractMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import model.Encomenda;
import model.GPS;
import model.LinhaEncomenda;
import model.Voluntario;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Voluntario_ESTest extends Voluntario_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GPS gPS0 = new GPS((-1632.0703767373618), 6.0);
      Voluntario voluntario0 = new Voluntario("", "#3f\"Tv*2b0/wyq/*PW", gPS0, 6.0);
      LinkedList<LinhaEncomenda> linkedList0 = new LinkedList<LinhaEncomenda>();
      Encomenda encomenda0 = new Encomenda("", "", "Coordenadas:\nPos X: -1632.0703767373618;\nPos Y: 6.0;\n", 6.0, linkedList0);
      boolean boolean0 = voluntario0.reviewEncomenda((-1632.0703767373618), encomenda0);
      assertEquals("", voluntario0.getCodigo());
      assertTrue(voluntario0.isDisponivel());
      assertEquals(0, voluntario0.getNrReviews());
      assertEquals(20.0, voluntario0.getVelocidade(), 0.01);
      assertEquals(0.0, voluntario0.getRating(), 0.01);
      assertFalse(boolean0);
      assertEquals("#3f\"Tv*2b0/wyq/*PW", voluntario0.getNome());
      assertEquals(6.0, voluntario0.getRaio(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Voluntario voluntario0 = new Voluntario();
      voluntario0.setRaio((-935.67139));
      Voluntario voluntario1 = new Voluntario();
      boolean boolean0 = voluntario0.equals(voluntario1);
      assertEquals((-935.67139), voluntario0.getRaio(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Voluntario voluntario0 = new Voluntario();
      voluntario0.review((-1390.0150907649));
      voluntario0.review(1934.646);
      assertEquals(2, voluntario0.getNrReviews());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[2];
      Voluntario voluntario0 = Voluntario.fromArgs(stringArray0);
      assertNull(voluntario0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GPS gPS0 = new GPS((-1632.0703767373618), 6.0);
      Voluntario voluntario0 = new Voluntario("", "#3f\"Tv*2b0/wyq/*PW", gPS0, 6.0);
      Double double0 = new Double(136.0834369037466);
      LinkedList<LinhaEncomenda> linkedList0 = new LinkedList<LinhaEncomenda>();
      Encomenda encomenda0 = new Encomenda("#3f\"Tv*2b0/wyq/*PW", "#3f\"Tv*2b0/wyq/*PW", "#3f\"Tv*2b0/wyq/*PW", (-481.124143), linkedList0);
      AbstractMap.SimpleImmutableEntry<Double, Encomenda> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Double, Encomenda>(double0, encomenda0);
      voluntario0.enviaPedido(abstractMap_SimpleImmutableEntry0);
      assertEquals("#3f\"Tv*2b0/wyq/*PW", voluntario0.getNome());
      assertEquals("", voluntario0.getCodigo());
      assertEquals(6.0, voluntario0.getRaio(), 0.01);
      assertTrue(voluntario0.isDisponivel());
      assertEquals(0, voluntario0.getNrReviews());
      assertEquals(20.0, voluntario0.getVelocidade(), 0.01);
      assertEquals(0.0, voluntario0.getRating(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Voluntario voluntario0 = new Voluntario();
      Voluntario.minVelocidade = 0.0;
      Voluntario.maxVelocidade = 0.0;
      double double0 = voluntario0.randomVelocidade();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, voluntario0.getRating(), 0.01);
      assertEquals(0.0, voluntario0.getRaio(), 0.01);
      assertEquals(0, voluntario0.getNrReviews());
      assertEquals(20.0, voluntario0.getVelocidade(), 0.01);
      assertTrue(voluntario0.isDisponivel());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Voluntario voluntario0 = new Voluntario();
      Voluntario.maxVelocidade = (-1737.825766049297);
      double double0 = voluntario0.randomVelocidade();
      assertTrue(voluntario0.isDisponivel());
      assertEquals(0.0, voluntario0.getRating(), 0.01);
      assertEquals(0.0, voluntario0.getRaio(), 0.01);
      assertEquals(0, voluntario0.getNrReviews());
      assertEquals((-155.78257660492972), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Voluntario voluntario0 = new Voluntario();
      Voluntario.maxVelocidade = (-1737.825766049297);
      Voluntario voluntario1 = new Voluntario(voluntario0);
      Double double0 = voluntario1.getVelocidade();
      assertTrue(voluntario1.isDisponivel());
      assertTrue(voluntario1.equals((Object)voluntario0));
      assertEquals(0.0, voluntario1.getRaio(), 0.01);
      assertTrue(voluntario0.isDisponivel());
      assertEquals(0.0, voluntario0.getRating(), 0.01);
      assertEquals((-155.78257660492972), (double)double0, 0.01);
      assertEquals(0, voluntario0.getNrReviews());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GPS gPS0 = new GPS();
      Voluntario voluntario0 = new Voluntario(", descricao='", ", descricao='", gPS0, (-2473.5512037));
      Voluntario.minVelocidade = 3002.4819792;
      Voluntario voluntario1 = new Voluntario(voluntario0);
      Double double0 = voluntario1.getVelocidade();
      assertEquals(0.0, voluntario0.getRating(), 0.01);
      assertTrue(voluntario1.equals((Object)voluntario0));
      assertEquals(2707.2337812799997, (double)double0, 0.01);
      assertTrue(voluntario1.isDisponivel());
      assertEquals((-2473.5512037), voluntario1.getRaio(), 0.01);
      assertEquals(0, voluntario0.getNrReviews());
      assertTrue(voluntario0.isDisponivel());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GPS gPS0 = new GPS();
      Voluntario voluntario0 = new Voluntario("2'{/I7}'PWhW", ", raio=", gPS0, (-667.7316094314));
      voluntario0.review(2.0);
      double double0 = voluntario0.getRating();
      assertEquals(2.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GPS gPS0 = new GPS();
      Voluntario voluntario0 = new Voluntario(";%rR&RARUp 3ua86V", "j`*%'?nj!{[", gPS0, 1270.835203);
      voluntario0.review((-390.965507));
      double double0 = voluntario0.getRating();
      assertEquals(1, voluntario0.getNrReviews());
      assertEquals((-390.965507), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GPS gPS0 = new GPS();
      Voluntario voluntario0 = new Voluntario("2'{/I7}'PWhW", ", raio=", gPS0, (-667.7316094314));
      voluntario0.setRaio(2.0);
      double double0 = voluntario0.getRaio();
      assertEquals(2.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GPS gPS0 = new GPS();
      Voluntario voluntario0 = new Voluntario(";%rR&RARUp 3ua86V", "j`*%'?nj!{[", gPS0, 1270.835203);
      voluntario0.review((-390.965507));
      int int0 = voluntario0.getNrReviews();
      assertEquals((-390.965507), voluntario0.getRating(), 0.01);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GPS gPS0 = new GPS();
      Voluntario voluntario0 = new Voluntario((String) null, (String) null, gPS0, 6.0);
      voluntario0.getNome();
      assertEquals(0.0, voluntario0.getRating(), 0.01);
      assertEquals(20.0, voluntario0.getVelocidade(), 0.01);
      assertTrue(voluntario0.isDisponivel());
      assertEquals(0, voluntario0.getNrReviews());
      assertEquals(6.0, voluntario0.getRaio(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GPS gPS0 = new GPS();
      Voluntario voluntario0 = new Voluntario("", "", gPS0, (-95.773576));
      voluntario0.getNome();
      assertEquals(0.0, voluntario0.getRating(), 0.01);
      assertTrue(voluntario0.isDisponivel());
      assertEquals(0, voluntario0.getNrReviews());
      assertEquals(20.0, voluntario0.getVelocidade(), 0.01);
      assertEquals((-95.773576), voluntario0.getRaio(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Voluntario voluntario0 = new Voluntario("", "", (GPS) null, 2.0);
      voluntario0.getLocal();
      assertEquals(20.0, voluntario0.getVelocidade(), 0.01);
      assertEquals(2.0, voluntario0.getRaio(), 0.01);
      assertEquals(0.0, voluntario0.getRating(), 0.01);
      assertEquals(0, voluntario0.getNrReviews());
      assertTrue(voluntario0.isDisponivel());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GPS gPS0 = new GPS(1336.65, 1336.65);
      Voluntario voluntario0 = new Voluntario("", "", gPS0, 1501.2409896);
      voluntario0.getLocal();
      assertEquals(1501.2409896, voluntario0.getRaio(), 0.01);
      assertEquals(0.0, voluntario0.getRating(), 0.01);
      assertTrue(voluntario0.isDisponivel());
      assertEquals(0, voluntario0.getNrReviews());
      assertEquals(20.0, voluntario0.getVelocidade(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Voluntario voluntario0 = new Voluntario();
      GPS gPS0 = new GPS((-908.722), 1112.4);
      voluntario0.setLocal(gPS0);
      voluntario0.getLocal();
      assertEquals(0, voluntario0.getNrReviews());
      assertEquals(0.0, voluntario0.getRating(), 0.01);
      assertEquals(20.0, voluntario0.getVelocidade(), 0.01);
      assertEquals(0.0, voluntario0.getRaio(), 0.01);
      assertTrue(voluntario0.isDisponivel());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GPS gPS0 = new GPS();
      Voluntario voluntario0 = new Voluntario((String) null, "$W$N;!W]|EYe^<", gPS0, 251.8);
      String string0 = voluntario0.getCodigo();
      assertTrue(voluntario0.isDisponivel());
      assertNull(string0);
      assertEquals(251.8, voluntario0.getRaio(), 0.01);
      assertEquals(0, voluntario0.getNrReviews());
      assertEquals(20.0, voluntario0.getVelocidade(), 0.01);
      assertEquals(0.0, voluntario0.getRating(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GPS gPS0 = new GPS();
      Voluntario voluntario0 = new Voluntario(";%rR&RARUp 3ua86V", "j`*%'?nj!{[", gPS0, 1270.835203);
      String string0 = voluntario0.getCodigo();
      assertEquals(1270.835203, voluntario0.getRaio(), 0.01);
      assertEquals(0, voluntario0.getNrReviews());
      assertEquals(20.0, voluntario0.getVelocidade(), 0.01);
      assertEquals(0.0, voluntario0.getRating(), 0.01);
      assertEquals("j`*%'?nj!{[", voluntario0.getNome());
      assertEquals(";%rR&RARUp 3ua86V", string0);
      assertTrue(voluntario0.isDisponivel());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GPS gPS0 = new GPS();
      Voluntario voluntario0 = new Voluntario(";%rR&RARUp 3ua86V", "j`*%'?nj!{[", gPS0, 1270.835203);
      Voluntario voluntario1 = new Voluntario(", quant=", "u=}L|iieLfIO1[3", gPS0, 1270.835203);
      int int0 = voluntario0.compareTo(voluntario1);
      assertEquals("u=}L|iieLfIO1[3", voluntario1.getNome());
      assertEquals(23.0, voluntario1.getVelocidade(), 0.01);
      assertEquals(0.0, voluntario1.getRating(), 0.01);
      assertEquals(15, int0);
      assertEquals(0, voluntario1.getNrReviews());
      assertEquals(1270.835203, voluntario1.getRaio(), 0.01);
      assertTrue(voluntario1.isDisponivel());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Voluntario voluntario0 = new Voluntario();
      GPS gPS0 = new GPS(0.0, (-1737.825766049297));
      Voluntario voluntario1 = new Voluntario("Model.Voluntario{codigo='', nome='', local=Coordenadas:\nPos X: 0.0;\nPos Y: 0.0;\n, raio=-1737.825766049297}", "Model.Voluntario{codigo='', nome='', local=Coordenadas:\nPos X: 0.0;\nPos Y: 0.0;\n, raio=0.0}", gPS0, (-1737.825766049297));
      int int0 = voluntario0.compareTo(voluntario1);
      assertEquals((-106), int0);
      assertEquals(0, voluntario1.getNrReviews());
      assertEquals(23.0, voluntario1.getVelocidade(), 0.01);
      assertEquals(0.0, voluntario0.getRaio(), 0.01);
      assertEquals(0.0, voluntario0.getRating(), 0.01);
      assertEquals(0, voluntario0.getNrReviews());
      assertTrue(voluntario1.isDisponivel());
      assertTrue(voluntario0.isDisponivel());
      assertEquals(0.0, voluntario1.getRating(), 0.01);
      assertEquals("Model.Voluntario{codigo='', nome='', local=Coordenadas:\nPos X: 0.0;\nPos Y: 0.0;\n, raio=0.0}", voluntario1.getNome());
      assertEquals((-1737.825766049297), voluntario1.getRaio(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GPS gPS0 = new GPS();
      Voluntario voluntario0 = new Voluntario((String) null, "$W$N;!W]|EYe^<", gPS0, 251.8);
      voluntario0.setRaio(0.0);
      voluntario0.clone();
      assertEquals(0.0, voluntario0.getRaio(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GPS gPS0 = new GPS();
      Voluntario voluntario0 = new Voluntario(";%rR&RARUp 3ua86V", "j`*%'?nj!{[", gPS0, 1270.835203);
      voluntario0.setRaio((-390.965507));
      voluntario0.clone();
      assertEquals((-390.965507), voluntario0.getRaio(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Voluntario voluntario0 = new Voluntario();
      // Undeclared exception!
      try { 
        voluntario0.reviewEncomenda((-250.05400924), (Encomenda) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("model.Voluntario", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "Coordenadas:\nPos X: 0.0;\nPos Y: -1737.825766049297;\n";
      stringArray0[2] = "Model.Voluntario{codigo='', nome='', local=Coordenadas:\nPos X: 0.0;\nPos Y: 0.0;\n, raio=-1737.825766049297}";
      // Undeclared exception!
      try { 
        Voluntario.fromArgs(stringArray0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = ", local=";
      // Undeclared exception!
      try { 
        Voluntario.fromArgs(stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("model.Voluntario", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Voluntario voluntario0 = new Voluntario();
      // Undeclared exception!
      try { 
        voluntario0.compareTo((Voluntario) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("model.Voluntario", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Voluntario voluntario0 = new Voluntario("D", "D", (GPS) null, 63.81187011);
      // Undeclared exception!
      try { 
        voluntario0.clone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("model.Voluntario", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Voluntario voluntario0 = null;
      try {
        voluntario0 = new Voluntario((Voluntario) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("model.Voluntario", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      GPS gPS0 = new GPS();
      Voluntario voluntario0 = new Voluntario(", descricao='", ", descricao='", gPS0, (-2473.5512037));
      double double0 = voluntario0.randomVelocidade();
      assertEquals((-2473.5512037), voluntario0.getRaio(), 0.01);
      assertEquals(0.0, voluntario0.getRating(), 0.01);
      assertTrue(voluntario0.isDisponivel());
      assertEquals(0, voluntario0.getNrReviews());
      assertEquals(23.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      GPS gPS0 = new GPS();
      Voluntario voluntario0 = new Voluntario(";%rR&RARUp 3ua86V", "j`*%'?nj!{[", gPS0, 1270.835203);
      String string0 = voluntario0.getNome();
      assertEquals(20.0, voluntario0.getVelocidade(), 0.01);
      assertEquals(0.0, voluntario0.getRating(), 0.01);
      assertEquals(";%rR&RARUp 3ua86V", voluntario0.getCodigo());
      assertTrue(voluntario0.isDisponivel());
      assertEquals("j`*%'?nj!{[", string0);
      assertEquals(1270.835203, voluntario0.getRaio(), 0.01);
      assertEquals(0, voluntario0.getNrReviews());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Voluntario voluntario0 = new Voluntario();
      voluntario0.getCodigo();
      assertEquals(20.0, voluntario0.getVelocidade(), 0.01);
      assertEquals(0.0, voluntario0.getRating(), 0.01);
      assertEquals(0.0, voluntario0.getRaio(), 0.01);
      assertTrue(voluntario0.isDisponivel());
      assertEquals(0, voluntario0.getNrReviews());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Voluntario voluntario0 = new Voluntario();
      double double0 = voluntario0.getRaio();
      assertTrue(voluntario0.isDisponivel());
      assertEquals(20.0, voluntario0.getVelocidade(), 0.01);
      assertEquals(0.0, voluntario0.getRating(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0, voluntario0.getNrReviews());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Voluntario voluntario0 = new Voluntario();
      voluntario0.getLocal();
      assertTrue(voluntario0.isDisponivel());
      assertEquals(0, voluntario0.getNrReviews());
      assertEquals(20.0, voluntario0.getVelocidade(), 0.01);
      assertEquals(0.0, voluntario0.getRating(), 0.01);
      assertEquals(0.0, voluntario0.getRaio(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Voluntario voluntario0 = new Voluntario();
      Encomenda encomenda0 = new Encomenda();
      List<LinhaEncomenda> list0 = encomenda0.getLinha();
      Encomenda encomenda1 = new Encomenda("", "", "", 2729.22113897, list0);
      boolean boolean0 = voluntario0.reviewEncomenda(0, encomenda1);
      assertTrue(voluntario0.isDisponivel());
      assertTrue(boolean0);
      assertEquals(0, voluntario0.getNrReviews());
      assertEquals(20.0, voluntario0.getVelocidade(), 0.01);
      assertEquals(0.0, voluntario0.getRaio(), 0.01);
      assertEquals(0.0, voluntario0.getRating(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      GPS gPS0 = new GPS(1336.65, 1336.65);
      Voluntario voluntario0 = new Voluntario("", "", gPS0, 1501.2409896);
      LinkedList<LinhaEncomenda> linkedList0 = new LinkedList<LinhaEncomenda>();
      Encomenda encomenda0 = new Encomenda("", "model.Voluntario", "", (-2968.111477011058), linkedList0);
      boolean boolean0 = voluntario0.reviewEncomenda(52.23136, encomenda0);
      assertTrue(voluntario0.isDisponivel());
      assertEquals(0, voluntario0.getNrReviews());
      assertEquals(1501.2409896, voluntario0.getRaio(), 0.01);
      assertEquals(20.0, voluntario0.getVelocidade(), 0.01);
      assertFalse(boolean0);
      assertEquals(0.0, voluntario0.getRating(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Voluntario voluntario0 = new Voluntario();
      LinkedList<LinhaEncomenda> linkedList0 = new LinkedList<LinhaEncomenda>();
      Encomenda encomenda0 = new Encomenda("", "", "", 0, linkedList0);
      boolean boolean0 = voluntario0.reviewEncomenda(1336.65, encomenda0);
      assertEquals(20.0, voluntario0.getVelocidade(), 0.01);
      assertTrue(boolean0);
      assertTrue(voluntario0.isDisponivel());
      assertEquals(0.0, voluntario0.getRating(), 0.01);
      assertEquals(0.0, voluntario0.getRaio(), 0.01);
      assertEquals(0, voluntario0.getNrReviews());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Voluntario voluntario0 = new Voluntario();
      Voluntario voluntario1 = new Voluntario(voluntario0);
      assertTrue(voluntario1.equals((Object)voluntario0));
      
      voluntario0.setLocal((GPS) null);
      boolean boolean0 = voluntario1.equals(voluntario0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      GPS gPS0 = new GPS(390.467911, 390.467911);
      Voluntario voluntario0 = new Voluntario(".1KCxh]_AzLQ", ".1KCxh]_AzLQ", gPS0, 390.467911);
      Voluntario voluntario1 = new Voluntario(".1KCxh]_AzLQ", "?AcNR\"HNq", gPS0, 390.467911);
      boolean boolean0 = voluntario0.equals(voluntario1);
      assertEquals(390.467911, voluntario1.getRaio(), 0.01);
      assertFalse(boolean0);
      assertEquals(23.0, voluntario1.getVelocidade(), 0.01);
      assertEquals(0.0, voluntario1.getRating(), 0.01);
      assertEquals(0, voluntario1.getNrReviews());
      assertTrue(voluntario1.isDisponivel());
      assertEquals(".1KCxh]_AzLQ", voluntario1.getCodigo());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      GPS gPS0 = new GPS(390.467911, 390.467911);
      Voluntario voluntario0 = new Voluntario("?AcNR\"HNq", ".1KCxh]_AzLQ", gPS0, 390.467911);
      Voluntario voluntario1 = new Voluntario(".1KCxh]_AzLQ", ".1KCxh]_AzLQ", gPS0, 390.467911);
      boolean boolean0 = voluntario0.equals(voluntario1);
      assertEquals(0.0, voluntario1.getRating(), 0.01);
      assertEquals(".1KCxh]_AzLQ", voluntario0.getNome());
      assertFalse(boolean0);
      assertEquals(0, voluntario1.getNrReviews());
      assertEquals(23.0, voluntario1.getVelocidade(), 0.01);
      assertEquals(390.467911, voluntario1.getRaio(), 0.01);
      assertTrue(voluntario1.isDisponivel());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      GPS gPS0 = new GPS();
      Voluntario voluntario0 = new Voluntario((String) null, (String) null, gPS0, 6.0);
      Voluntario voluntario1 = new Voluntario("", "", gPS0, (-95.773576));
      boolean boolean0 = voluntario0.equals(voluntario1);
      assertEquals(23.0, voluntario1.getVelocidade(), 0.01);
      assertEquals((-95.773576), voluntario1.getRaio(), 0.01);
      assertFalse(boolean0);
      assertTrue(voluntario1.isDisponivel());
      assertEquals(0.0, voluntario1.getRating(), 0.01);
      assertEquals(0, voluntario1.getNrReviews());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      GPS gPS0 = new GPS();
      Voluntario voluntario0 = new Voluntario((String) null, (String) null, gPS0, 6.0);
      Double double0 = new Double(6.0);
      boolean boolean0 = voluntario0.equals(double0);
      assertEquals(6.0, voluntario0.getRaio(), 0.01);
      assertTrue(voluntario0.isDisponivel());
      assertEquals(0, voluntario0.getNrReviews());
      assertFalse(boolean0);
      assertEquals(20.0, voluntario0.getVelocidade(), 0.01);
      assertEquals(0.0, voluntario0.getRating(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Voluntario voluntario0 = new Voluntario();
      boolean boolean0 = voluntario0.equals(voluntario0);
      assertEquals(20.0, voluntario0.getVelocidade(), 0.01);
      assertEquals(0.0, voluntario0.getRaio(), 0.01);
      assertEquals(0.0, voluntario0.getRating(), 0.01);
      assertTrue(boolean0);
      assertEquals(0, voluntario0.getNrReviews());
      assertTrue(voluntario0.isDisponivel());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Voluntario voluntario0 = new Voluntario();
      boolean boolean0 = voluntario0.equals((Object) null);
      assertTrue(voluntario0.isDisponivel());
      assertEquals(20.0, voluntario0.getVelocidade(), 0.01);
      assertEquals(0.0, voluntario0.getRating(), 0.01);
      assertEquals(0.0, voluntario0.getRaio(), 0.01);
      assertEquals(0, voluntario0.getNrReviews());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      String[] stringArray0 = new String[7];
      Voluntario voluntario0 = Voluntario.fromArgs(stringArray0);
      assertNull(voluntario0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      String[] stringArray0 = new String[5];
      // Undeclared exception!
      try { 
        Voluntario.fromArgs(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("model.Voluntario", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      GPS gPS0 = new GPS(1336.65, 1336.65);
      Voluntario voluntario0 = new Voluntario("", "", gPS0, 1501.2409896);
      double double0 = voluntario0.getRating();
      assertTrue(voluntario0.isDisponivel());
      assertEquals(0.0, double0, 0.01);
      assertEquals(1501.2409896, voluntario0.getRaio(), 0.01);
      assertEquals(20.0, voluntario0.getVelocidade(), 0.01);
      assertEquals(0, voluntario0.getNrReviews());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      GPS gPS0 = new GPS();
      Voluntario voluntario0 = new Voluntario((String) null, (String) null, gPS0, 6.0);
      voluntario0.getEncomendasEntregadas();
      assertEquals(6.0, voluntario0.getRaio(), 0.01);
      assertEquals(0.0, voluntario0.getRating(), 0.01);
      assertTrue(voluntario0.isDisponivel());
      assertEquals(0, voluntario0.getNrReviews());
      assertEquals(20.0, voluntario0.getVelocidade(), 0.01);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      GPS gPS0 = new GPS();
      Voluntario voluntario0 = new Voluntario((String) null, (String) null, gPS0, 6.0);
      voluntario0.getEncomendasNaQueue();
      assertEquals(20.0, voluntario0.getVelocidade(), 0.01);
      assertEquals(0.0, voluntario0.getRating(), 0.01);
      assertTrue(voluntario0.isDisponivel());
      assertEquals(0, voluntario0.getNrReviews());
      assertEquals(6.0, voluntario0.getRaio(), 0.01);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Voluntario voluntario0 = new Voluntario();
      voluntario0.hashCode();
      assertTrue(voluntario0.isDisponivel());
      assertEquals(0, voluntario0.getNrReviews());
      assertEquals(20.0, voluntario0.getVelocidade(), 0.01);
      assertEquals(0.0, voluntario0.getRaio(), 0.01);
      assertEquals(0.0, voluntario0.getRating(), 0.01);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Voluntario voluntario0 = new Voluntario();
      boolean boolean0 = voluntario0.isDisponivel();
      assertEquals(20.0, voluntario0.getVelocidade(), 0.01);
      assertEquals(0.0, voluntario0.getRating(), 0.01);
      assertTrue(boolean0);
      assertEquals(0.0, voluntario0.getRaio(), 0.01);
      assertEquals(0, voluntario0.getNrReviews());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Voluntario voluntario0 = new Voluntario();
      // Undeclared exception!
      try { 
        voluntario0.enviaPedido((Map.Entry<Double, Encomenda>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayDeque", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Voluntario voluntario0 = new Voluntario();
      assertTrue(voluntario0.isDisponivel());
      
      voluntario0.setDisponivel(false);
      boolean boolean0 = voluntario0.isDisponivel();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Voluntario voluntario0 = new Voluntario();
      GPS gPS0 = new GPS(0.0, (-1737.825766049297));
      voluntario0.setLocal(gPS0);
      voluntario0.getLocal();
      assertEquals(0.0, voluntario0.getRaio(), 0.01);
      assertEquals(0.0, voluntario0.getRating(), 0.01);
      assertTrue(voluntario0.isDisponivel());
      assertEquals(0, voluntario0.getNrReviews());
      assertEquals(20.0, voluntario0.getVelocidade(), 0.01);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      GPS gPS0 = new GPS();
      Voluntario voluntario0 = new Voluntario((String) null, (String) null, gPS0, 6.0);
      Voluntario voluntario1 = voluntario0.clone();
      assertEquals(23.0, voluntario1.getVelocidade(), 0.01);
      assertTrue(voluntario0.isDisponivel());
      assertEquals(6.0, voluntario0.getRaio(), 0.01);
      assertTrue(voluntario1.isDisponivel());
      assertEquals(6.0, voluntario1.getRaio(), 0.01);
      assertEquals(0.0, voluntario0.getRating(), 0.01);
      assertEquals(0, voluntario0.getNrReviews());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Voluntario voluntario0 = new Voluntario();
      voluntario0.setRaio((-1737.825766049297));
      double double0 = voluntario0.getRaio();
      assertEquals((-1737.825766049297), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Voluntario voluntario0 = new Voluntario();
      voluntario0.compareTo(voluntario0);
      assertEquals(0, voluntario0.getNrReviews());
      assertEquals(20.0, voluntario0.getVelocidade(), 0.01);
      assertEquals(0.0, voluntario0.getRating(), 0.01);
      assertEquals(0.0, voluntario0.getRaio(), 0.01);
      assertTrue(voluntario0.isDisponivel());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      GPS gPS0 = new GPS();
      Voluntario voluntario0 = new Voluntario(", descricao='", ", descricao='", gPS0, (-2473.5512037));
      int int0 = voluntario0.getNrReviews();
      assertEquals((-2473.5512037), voluntario0.getRaio(), 0.01);
      assertEquals(0, int0);
      assertTrue(voluntario0.isDisponivel());
      assertEquals(20.0, voluntario0.getVelocidade(), 0.01);
      assertEquals(0.0, voluntario0.getRating(), 0.01);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Voluntario voluntario0 = new Voluntario();
      Voluntario voluntario1 = new Voluntario(voluntario0);
      boolean boolean0 = voluntario0.equals(voluntario1);
      assertTrue(boolean0);
      assertEquals(23.0, voluntario1.getVelocidade(), 0.01);
      assertEquals(0.0, voluntario1.getRaio(), 0.01);
      assertTrue(voluntario1.isDisponivel());
      assertEquals(0, voluntario0.getNrReviews());
      assertEquals(0.0, voluntario0.getRating(), 0.01);
      assertTrue(voluntario0.isDisponivel());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Voluntario voluntario0 = new Voluntario();
      String string0 = voluntario0.toString();
      assertEquals(0, voluntario0.getNrReviews());
      assertTrue(voluntario0.isDisponivel());
      assertEquals("Model.Voluntario{codigo='', nome='', local=Coordenadas:\nPos X: 0.0;\nPos Y: 0.0;\n, raio=0.0}", string0);
      assertEquals(0.0, voluntario0.getRating(), 0.01);
      assertEquals(20.0, voluntario0.getVelocidade(), 0.01);
  }
}
