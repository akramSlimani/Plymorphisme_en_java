<div align="center">

# Plymorphisme en java

</div>
Le projet est une application Java qui gère différents types de véhicules tels que des camions et des fourgonnettes. Il permet de créer, manipuler et afficher des informations sur les véhicules, y compris leur immatriculation, leur poids, leur charge maximale et leur vitesse maximale.

##  `Vehicule`
La classe abstraite Vehicule est la classe de base pour tous les types de véhicules. Elle comprend les fonctionnalités suivantes :

Des attributs privés pour l'immatriculation du véhicule et son poids.
Un constructeur pour initialiser l'immatriculation et le poids du véhicule.
Des méthodes d'accès pour obtenir l'immatriculation et le poids du véhicule.
Des méthodes abstraites pour la vitesse maximale du véhicule, la charge maximale qu'il peut transporter et le type de véhicule.
Une méthode toString() pour obtenir une représentation textuelle du véhicule.

##  `Camion`
La classe Camion est une sous-classe de Vehicule et représente un camion. Elle comprend les fonctionnalités suivantes :

Un attribut statique pour le type de véhicule ("Fourgonnette").
Un attribut pour la charge maximale du camion.
Un constructeur pour initialiser l'immatriculation, le poids et la charge maximale du camion.
Une implémentation de la méthode abstraite vitesseMaximale() pour calculer la vitesse maximale en fonction de la charge du camion.
Des méthodes d'accès pour obtenir la charge maximale et le type de véhicule du camion.

##  `Fourgonnette`
La classe Fourgonnette est une sous-classe de Vehicule et représente une fourgonnette. Elle comprend les fonctionnalités suivantes :

Un attribut statique pour le type de véhicule ("Fourgonnette").
Un attribut pour la charge maximale de la fourgonnette.
Un constructeur pour initialiser l'immatriculation, le poids et la charge maximale de la fourgonnette.
Une implémentation de la méthode abstraite vitesseMaximale() pour calculer la vitesse maximale en fonction de la charge de la fourgonnette.
Des méthodes d'accès pour obtenir la charge maximale et le type de véhicule de la fourgonnette.

##  `VehiculeException`
La classe VehiculeException est une exception personnalisée qui peut être levée lorsqu'un objet n'est pas un véhicule valide. Elle comprend les fonctionnalités suivantes :

Un constructeur prenant en paramètre un message d'erreur.

##  `Electrique`
L'interface Electrique est une interface marquant les véhicules électriques. Elle ne définit aucune méthode, mais est utilisée pour indiquer qu'un véhicule est électrique.

##  `FourgonnetteElectrique`
La classe FourgonnetteElectrique est une sous-classe de Fourgonnette qui implémente l'interface Electrique. Elle représente une fourgonnette électrique.

##  `MainConvoi`
La classe MainConvoi contient les méthodes principales du programme. Elle comprend les fonctionnalités suivantes :

Une méthode `vitesseMaxConvoi(Object[] convoi)` qui parcourt un tableau d'objets "convoi" et retourne la vitesse maximale parmi les véhicules présents. Si un élément du convoi n'est pas un véhicule, une exception de type VehiculeException est levée.

Une méthode infoConvoi(Object[] convoi) qui affiche les informations sur chaque véhicule du convoi en utilisant la méthode toString(), puis affiche la vitesse maximale du convoi en appelant la méthode vitesseMaxConvoi().

La méthode main(String[] args) qui crée des tableaux de véhicules (camions et fourgonnettes) et appelle les méthodes infoConvoi() pour afficher les informations sur les convois.

Note: Assurez-vous d'avoir toutes les classes dans le même package pour exécuter le programme correctement.

N'hésitez pas à explorer le code source et à exécuter le programme pour observer le fonctionnement de la gestion des véhicules, notamment l'affichage des informations et le calcul de la vitesse maximale des convois.

## Exemple d'exécution :

```java
- Fourgonnette : (poids = 2) (charge = 0)(immatriculation = BV 563 GH) (vitesse maximale = 100)
- Camion : (poids = 3) (charge = 3)(immatriculation = FA 122 FX) (vitesse maximale = 80)
- Camion : (poids = 1) (charge = 1)(immatriculation = BA 622 JX) (vitesse maximale = 90)
Vitesse max du convoi : 80
- Fourgonnette : (poids = 2) (charge = 0)(immatriculation = BQ 583 GH) (vitesse maximale = 100)
- Fourgonnette : (poids = 3) (charge = 3)(immatriculation = AB 583 GH) (vitesse maximale = 100)
- Fourgonnette : (poids = 2) (charge = 2)(immatriculation = HJ 583 GH) (vitesse maximale = 100)
Vitesse max du convoi : 100
```

