package fr.entretien.parttion;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import fr.entretien.partition.Partition;
import fr.entretien.partition.exception.PartitionException;

public class ParttionTest {

  @Test
  public void testSixValeur() {
    int taille = 2;
    List<Integer> liste = Arrays.asList(1, 2, 3, 4, 5, 6);
    List<List<Integer>> resultat = Partition.partition(liste, taille);
    Assert.assertTrue(resultat.size() == 3);
    for (List<Integer> sousListe : resultat) {
      Assert.assertTrue(sousListe.size() == taille);
    }
  }

  @Test
  public void testValeursDupliquees() {
    int taille = 3;
    List<Integer> liste = Arrays.asList(1, 2, 1, 1, 2);
    List<List<Integer>> resultat = Partition.partition(liste, taille);
    Assert.assertTrue(resultat.size() == 2);
  }
  
  @Test
  public void testTailleSuperieurTailleListe() {
    int taille = 6;
    List<Integer> liste = Arrays.asList(1, 2, 3, 4, 5);
    List<List<Integer>> resultat = Partition.partition(liste, taille);
    Assert.assertTrue(resultat.size() == 1);
  }

  @Test(expected = PartitionException.class)
  public void testListeNull() {
    Partition.partition(null, 1);
  }

  @Test(expected = PartitionException.class)
  public void testtailleNull() {
    Partition.partition(Arrays.asList(1, 2, 3, 4, 5), 0);
  }
}
