package fr.test.parttion;

import java.util.Arrays;

import org.junit.Assert;

import fr.test.partition.Partition;
import junit.framework.TestCase;

public class ParttionTest extends TestCase {
  
  public void parttion() {
    Assert.assertTrue(Partition.partion(Arrays.asList(1, 2, 3, 4, 5), 2).size() == 3);
    Assert.assertTrue(Partition.partion(Arrays.asList(1, 2, 3, 4, 5), 3).size() == 2);
    Assert.assertTrue(Partition.partion(Arrays.asList(1, 2, 3, 4, 5), 1).size() == 5);
    Assert.assertTrue(Partition.partion(Arrays.asList(1, 2, 3, 4, 5), 6).size() == 1);
  }

  public void testListeNull() {
    try {
      Partition.partion(null, 1);
      Assert.fail("IllegalArgumentException non levée avec la propriété liste à null");
    } catch (IllegalArgumentException iae) {
      // ignorer l'exception puisque le test est OK (l'exception est levée)
    }
  }

  public void testtailleNull() {
    try {
      Partition.partion(Arrays.asList(1, 2, 3, 4, 5), 0);
      Assert.fail("IllegalArgumentException non levée avec la propriété taille à null");
    } catch (IllegalArgumentException iae) {
      // ignorer l'exception puisque le test est OK (l'exception est levée)
    }
  }
}
