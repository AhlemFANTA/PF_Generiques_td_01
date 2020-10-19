package td1.arbres.paire;

public interface IPaire <A, B>{
    A x();
    B y();
    <C>  IPaire <C, B> changeFst(C value);
    <C>  IPaire <A, C> changeSnd(C value);

}
