package td1.exo3.arbresSimples;

import java.util.Set;

public interface Arbre {
    int taille();
    boolean contient(final Integer val);
    Set<Integer> valeurs();  // ensemble des valeurs différentes dans l'arbre
    Integer somme(); // somme des valeurs
    Integer min(); // valeur minimale
    Integer max(); // valeur maximale
    boolean estTrie(); // vrai si l'arbre est trié, faux sinon
}
