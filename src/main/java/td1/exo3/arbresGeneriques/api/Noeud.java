package td1.exo3.arbresGeneriques.api;

import td1.exo3.arbresGeneriques.ressource.Sommable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Noeud <T extends Sommable<T>> implements Arbre<T> {
    private final List<Arbre<T>> fils;

    public Noeud(List<Arbre<T>> fils) {
        this.fils = new ArrayList<>();
    }

    @Override
    public int taille() {
        return this.fils.stream().map(Arbre<T>::taille).reduce(0, Integer::sum);
    }

    @Override
    public boolean contient(T val) {
        for (final Arbre a : fils) {
            if (a.contient(val)) return true;
        }
        return false;
    }

    @Override
    public Set<T> valeurs() {
        Set<T> rtr = new HashSet<>();
        for (final Arbre a : fils) {
            rtr.addAll(a.valeurs());
        }
        return rtr;
    }

    @Override
    public T sommer() {
        return null;
    }

    @Override
    public T min() {
        return null;
    }

    @Override
    public T max() {
        return null;
    }

    @Override
    public boolean estTrie() {
        return condtionTrie() && condtiontrie2();
    }

    private boolean condtiontrie2() {
        boolean rtr = true;
        for (int i = 0; i < fils.size() - 1; i++) {
            final Arbre fi = fils.get(i);
            if (!fi.estTrie())
                return false;
        }
        return rtr;
    }

    private boolean condtionTrie() {
        boolean rtr = true;
        for (int i = 0; i < fils.size() - 1; i++) {
            final Arbre fi = fils.get(i);
            final Arbre fa = fils.get(i+1);
        }
        return rtr;
    }
}
