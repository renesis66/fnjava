package com.functional;

import org.junit.*;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertNotNull;

/**
 * Created by scottdierbeck on 5/12/15.
 */

public class PickElementsTest
{
  @BeforeClass
  public static void setUpClass() throws Exception
  {
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
  public void returnsListWithNamesThatStartWithTheLetterN()
  {
    ElementPicker elementPicker = new ElementPicker();
    final List friends =
        Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

    List matchingNames = elementPicker.getNamesStartingWith(friends, "N");
    assertNotNull(matchingNames);
    assertThat(matchingNames.size(), equalTo(2));
  }
}