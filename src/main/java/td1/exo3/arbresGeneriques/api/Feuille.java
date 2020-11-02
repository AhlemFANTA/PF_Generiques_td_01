package td1.exo3.arbresGeneriques.api;

import td1.exo3.arbresGeneriques.ressource.Sommable;
import java.util.Set;

public class Feuille<T extends Sommable<T>> implements Arbre<T> {
    private final T valeur;

    public Feuille(T valeur) {
        this.valeur = valeur;
    }

    @Override
    public int taille() {
        return 1;
    }

    @Override
    public boolean contient(final T val) {
        return val.equals(this.valeur);
    }

    @Override
    public Set<T> valeurs() {
        return Set.of(this.valeur);
    }

    @Override
    public T sommer() {
        return valeur;
    }

    @Override
    public T min() {
        return valeur;
    }

    @Override
    public T max() {
        return valeur;
    }

    @Override
    public boolean estTrie() {
        return false;
    }
}
