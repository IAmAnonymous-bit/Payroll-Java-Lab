package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppTest {
  // You can put your JUnit tests here
  // Feel free to create other files, as needed, to organize your tests

  Payroll pay;

  @BeforeEach
  void setUp()
  {
    pay = new Payroll();
  }

  @Test
  void testGrossZero() 
  {
    double g0 = 0 * 16.78;
    assertEquals(pay.gross(0), g0);
  }

  @Test
  void testSSZero() 
  {
    double ss0 = 0 * 0.06;
    assertEquals(pay.socSec(0), ss0);
  }

  @Test
  void testFIZero() 
  {
    double fi0 = 0 * 0.14;
    assertEquals(pay.fedIn(0), fi0);
  }

  @Test
  void testSIZero() 
  {
    double si0 = 0 * 0.05;
    assertEquals(pay.stIn(0), si0);
  }

  @Test
  void testGrossThirty()
  {
    double g30 = 30 * 16.78;
    assertEquals(pay.gross(30), g30);
  }

  @Test
  void testSSThirty() 
  {
    double ss30 = 30 * 0.06;
    assertEquals(pay.socSec(30), ss30);
  }

  @Test
  void testFIThirty() 
  {
    double fi30 = 30 * 0.14;
    assertEquals(pay.fedIn(30), fi30);
  }

  @Test
  void testSIThirty() 
  {
    double si30 = 30 * 0.05;
    assertEquals(pay.stIn(30), si30);
  }

  @Test
  void testGrossHundred()
  {
    double g100 = 100 * 16.78;
    assertEquals(pay.gross(100), g100);
  }

  @Test
  void testSSHundred() 
  {
    double ss100 = 100 * 0.06;
    assertEquals(pay.socSec(100), ss100);
  }

  @Test
  void testFIHundred() 
  {
    double fi100 = 100 * 0.14;
    assertEquals(pay.fedIn(100), fi100);
  }

  @Test
  void testSIHundred() 
  {
    double si100 = 100 * 0.05;
    assertEquals(pay.stIn(100), si100);
  }

  @Test
  void testGreater()
  {
    assertEquals(pay.ins(4), 35.00);
  }

  @Test
  void testLess()
  {
    assertEquals(pay.ins(2), 15.00);
  }

  @Test
  void testEqual()
  {
    assertEquals(pay.ins(3), 35.00);
  }

  @Test
  void testNet()
  {
    double gro = 5 * 16.78;
    double soc = 5 * 0.06;
    double fed = 5 * 0.14;
    double sta = 5 * 0.05;
    double net = gro - (soc + fed + sta + 10.00 + 35.00);
    assertEquals(pay.netIn(gro, soc, fed, sta, 35.00), net);
  }

}
