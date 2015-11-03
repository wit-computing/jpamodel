import org.junit.*;

import java.util.*;
import play.test.*;
import models.*;

public class ClubTest extends UnitTest 
{
  private Club c1, c2, c3;

  @Before
  public void setup()
  {
    c1 = new Club("tramore");
    c2 = new Club("dunmore");
    c3 = new Club("fenor");
    c1.save();
    c2.save();
    c3.save();
  }

  @After
  public void teardown()
  {
    c1.delete();
    c2.delete();
    c3.delete();
  }

  @Test
  public void testCreate()
  {
    Club a = Club.findByName("tramore");
    assertNotNull(a);
    assertEquals("tramore", a.name);
    Club b = Club.findByName("dunmore");
    assertNotNull(b);
    assertEquals("dunmore", b.name);
    Club c = Club.findByName("fenor");
    assertNotNull(c);
    assertEquals("fenor", c.name);
  }

  @Test
  public void testNotThere()
  {
    Club a = Club.findByName("george");
    assertNull(a);
  }
}