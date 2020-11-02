package td1.exo3.arbresGeneriques.ressource;

import java.util.Objects;

public class Chaine implements Sommable<Chaine>, Comparable<Chaine> {
    private String valeur;

    public Chaine(String _valeur) { this.valeur = _valeur; }

    @Override
    public Chaine sommer(final Chaine valeur) {
        return new Chaine(this.valeur + valeur.getValeur());
    }
    public String getValeur() { return valeur; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chaine chaine = (Chaine) o;
        return Objects.equals(valeur, chaine.valeur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valeur);
    }

    @Override
    public String toString() {
        return "Chaine[" +
                "valeur='" + valeur + '\'' +
                ']';
    }

    @Override
    public int compareTo(Chaine autre) {
        return this.valeur.compareTo(autre.getValeur());
    }
}
