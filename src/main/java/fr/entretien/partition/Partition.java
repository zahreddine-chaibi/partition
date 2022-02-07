package fr.entretien.partition;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import fr.entretien.partition.exception.PartitionException;

public class Partition {
  
  /**
   * Elle fait la partition d'une liste en sous liste avec un maximum de taille le
   * paramètre entier entré en second paramètre
   * 
   * @param liste  : Liste d'entier qui represente La liste à partionner
   * @param taille : Un entier qui reprsente La taille d'une partition
   * @return retourne une liste de sous liste qui represente les partitions
   */
  public static List<List<Integer>> partition(List<Integer> liste, Integer taille) {
    if (liste == null) {
      throw new PartitionException("La liste ne doit pas être null.");
    }
    if (taille <= 0) {
      throw new PartitionException("La taille ne doit pas être inferieur ou égale à zéro.");
    }
    List<List<Integer>> listeDeListe = new ArrayList<>();
    final AtomicInteger counter = new AtomicInteger();
    liste.stream().forEach(entier -> {
      if (counter.getAndIncrement() % taille == 0) {
        listeDeListe.add(new ArrayList<>());
      }
      listeDeListe.get(listeDeListe.size() - 1).add(entier);
    });
    return listeDeListe;
  }
}
