package fr.test.partition;

import java.util.ArrayList;
import java.util.List;

public class Partition {

  public static List<List<Integer>> partion(List<Integer> liste, Integer taille) {
    if (liste == null)
      throw new IllegalArgumentException("La liste ne doit pas �tre null.");
    if (taille <= 0)
      throw new IllegalArgumentException("La taille ne doit pas �tre inferieur ou �gale � z�ro.");
    List<List<Integer>> listeDeListe = new ArrayList<>();
    liste.stream().forEach(entier -> {
      if (liste.indexOf(entier) % taille == 0) {
        listeDeListe.add(new ArrayList<>());
      }
      listeDeListe.get(listeDeListe.size() - 1).add(entier);
    });
    return listeDeListe;
  }
}
