package com.functional;

import org.junit.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by scottdierbeck on 5/16/15.
 */

public class JoinerTest
{
  static Joiner joiner;
  final List friends =
          Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott", "Stephen", "Ian");
  @BeforeClass
  public static void setUpClass() throws Exception
  {
    joiner = new Joiner();
  }

  @AfterClass
  public static void tearDownClass() throws Exception
  {
  }

  @Before
  public void setUp() throws Exception
  {
  }

  @After
  public void tearDown() throws Exception
  {
  }

  @Test
  public void returnsComaSeparatedStringOfAllElements()
  {

    String elementcsv = joiner.createComaSeparatedStringOfElements(friends);
    assertNotNull(elementcsv);
    assertEquals(8, elementcsv.split(",").length);
  }
}