package td1.exo3.arbresGeneriques.api;

import td1.exo3.arbresGeneriques.ressource.Sommable;

import java.util.Set;

public interface Arbre<T extends Sommable<T>> {
    int taille();
    boolean contient(final T val);
    Set<T> valeurs();
    T sommer ();
    T min();
    T max();
    boolean estTrie();
}