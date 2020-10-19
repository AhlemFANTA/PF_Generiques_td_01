package td1.arbres.paire;

public class Paire <A, B> {
    private A fst;
    private B snd;

    public Paire(final A _x, final B _y) {
        this.fst = _x;
        this.snd = _y;
    }

    public A getFst() {
        return fst;
    }

    public B getSnd() {
        return snd;
    }

    //pour avoir le premier élément de la paire
    public int fst() {
        return 1;
    }

    //snd pour avoir le second élément de la paire
    public int snd() {
        return 1;
    }

    /*changeFst pour retourner une nouvelle paire où le premier élément a été
    //changé par la valeur passée en paramètre (potentiellement d’un autre type
    que celui précédent)*/
    public <C> Paire <C,B>changeFst(C val) {
        return new Paire<>(val, snd);
    }

    /*changeSnd pour retourner une nouvelle paire où le second élément a été
    //changé par la valeur passée en paramètre (potentiellement d’un autre type
    //que celui précédent)*/
    public <C> Paire <A,C> changeSnd( C val) {
        return new Paire<>(fst, val);
    }

    public String toString () {
        return String.format("(%s,%s) :: paire (%s,%s) ", fst, snd, fst.getClass().getSimpleName(), snd.getClass().getSimpleName());
    }
}