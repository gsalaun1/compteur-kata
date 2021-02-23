package compteur

/**
 * <p>compteur.Compteur</p>
 */
interface Compteur {

    /** initialisation du compteur.
     *  La liste l ne peut être vide et les valeurs sont forcément positives ou nulles
     *  @param l la liste non vide de valeurs maximales pour chaque roue.*/
    fun init(l: List<Int>)

    /** @return la valeur courante du compteur */
    fun courant(): List<Int>

    /** incrémente le compteur (si cela est possible) */
    fun suivant()

    /** @return le compteur a-t-il atteint sa valeur maximale? */
    fun suivantPossible(): Boolean

    /** @return le nombre de valeurs possibles */
    fun valPossibles(): Int

    /** @return le nombre de valeurs restant */
    fun valRestantes(): Int
}
