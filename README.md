### Description
La librairie expose une fonction � **partition** � qui prend un param�tre � **liste** � et un param�tre � **taille** � et retourne une liste de sous liste, o� chaque sous liste a au maximum � **taille** � �l�ments.
Exemples d'entr�es et sorties :
```
partition([1,2,3,4,5], 2) retourne: [ [1,2], [3,4], [5] ]
partition([1,2,3,4,5], 3) retourne: [ [1,2,3], [4,5] ]
partition([1,2,3,4,5], 1) retourne: [ [1], [2], [3], [4], [5] ]
```
### Exploitation 

#####Build
Pour faire un build il faut ex�cuter la commande suivante:
```
mvn clean install
```
#####Test
Pour tester il faut ex�cuter la commande suivante:
```
mvn test
```

####Packaging
Pour packager il faut ex�cuter la commande suivante:
```
mvn clean package
```
