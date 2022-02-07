### Description
La librairie expose une fonction « **partition** » qui prend un paramètre « **liste** » et un paramètre « **taille** » et retourne une liste de sous liste, où chaque sous liste a au maximum « **taille** » éléments.
Exemples d'entrées et sorties :
```
partition([1,2,3,4,5], 2) retourne: [ [1,2], [3,4], [5] ]
partition([1,2,3,4,5], 3) retourne: [ [1,2,3], [4,5] ]
partition([1,2,3,4,5], 1) retourne: [ [1], [2], [3], [4], [5] ]
```
### Exploitation 

##### Build
Pour faire un build il faut exécuter la commande suivante:
```
mvn clean install
```
##### Test
Pour tester il faut exécuter la commande suivante:
```
mvn test
```

##### Packaging
Pour packager il faut exécuter la commande suivante:
```
mvn clean package
```
