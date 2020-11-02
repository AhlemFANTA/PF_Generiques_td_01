package td1.exo3.arbresGeneriques;

import td1.exo3.arbresGeneriques.ressource.Chaine;
import td1.exo3.arbresGeneriques.ressource.Entier;

public class Main {

 public static void main(String[] args) {

  Entier entier1 = new Entier(1);
  Entier entier2 = new Entier(2);
  Entier entier3 = new Entier(3);
  System.out.println(entier1.sommer(entier2.sommer(entier3)));

  Chaine chaine1 = new Chaine("a");
  Chaine chaine2 = new Chaine("b");
  Chaine chaine3 = new Chaine("c");
  System.out.println(chaine1.sommer(chaine2.sommer(chaine3)));
 }
}
