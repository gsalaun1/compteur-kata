# compteur-kata

Un kata créé par [Thomas Genet](http://people.irisa.fr/Thomas.Genet)

![Compteur](compteur.jpg)

On souhaite représenter des compteurs basés sur les même principes que les compteurs mécaniques composés de
roues. Cependant, contrairement au compteurs usuels, on ne supposera pas que les roues ont toutes le même nombre
de valeurs possibles. Un compteur pourra être initialisé avec une liste de valeurs maximales pour chaque roue : une
liste non vide de valeurs supérieures ou égales à 0. Comme dans les compteurs mécaniques, lorsqu’une roue aura fait
un tour complet, elle fera avancer d’un cran la roue située à sa gauche (si elle existe). L'interface Compteur comprend les
opérations suivantes :

* _init(l: List<Int>)_ qui initialise le compteur comme décrit ci-dessus ;
* _courant: List<Int>_ qui retourne la liste de valeurs courante du compteur ;
* _suivant_ qui incrémente le compteur. Si on a atteint le maximum, le compteur est bloqué sur la dernière
valeur comptée ;
* _suivantPossible(): Boolean_ qui dit s’il est encore possible d’incrémenter le compteur ou s’il a atteint la valeur
maximum ;
* _valPossibles(): Int_ qui donne le nombre total de valeurs que le compteur peut prendre tel qu’il est
initialisé ;
* _valRestantes(): Int_ qui donne le nombre d’incréments que peut encore réaliser le compteur.

Implémentez ces méthodes en TDD.
