package com.functional;

import org.junit.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by scottdierbeck on 5/12/15.
 */

public class PickElementsTest
{
  static ElementPicker elementPicker;
  final List friends =
          Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
  @BeforeClass
  public static void setUpClass() throws Exception
  {
    elementPicker = new ElementPicker();
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

    List matchingNames = elementPicker.getNamesStartingWith(friends, "N");
    assertNotNull(matchingNames);
    assertThat(matchingNames.size(), equalTo(2));
  }

  @Test
  public void returnsFirstNameOrOptionalFromListStartingWithTheLetterS() {
    Optional<String> matchingName = elementPicker.pickName(friends, "S");
    Predicate predicate;
    Function fn;
    assertNotNull(matchingName);
    assertTrue(matchingName.isPresent());
    assertThat(matchingName.get(), equalTo("Sara"));
  }

  @Test
  public void checkingSomeMethods() {
    String abc = "abc";
    abc.chars()
            .forEach(System.out::println);
    abc.codePoints()
            .forEach(System.out::println);
  }
}