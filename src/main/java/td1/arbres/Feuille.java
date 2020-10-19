package td1.arbres;

import java.util.Set;

public class Feuille implements Arbre {
    public Feuille(int i) {
    }

    @Override
    public int taille() {
        return 0;
    }

    @Override
    public boolean contient(Integer val) {
        return false;
    }

    @Override
    public Set<Integer> valeurs() {
        return null;
    }

    @Override
    public Integer somme() {
        return null;
    }

    @Override
    public Integer min() {
        return null;
    }

    @Override
    public Integer max() {
        return null;
    }

    @Override
    public boolean estTrie() {
        return false;
    }
}
