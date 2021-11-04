public class Main
{
     // Méthode principale.
     public static void main(String[] args)
     {
        String couleurs[] = { "Rouge", "Vert", "Bleu", "Blanc", "Noir" };
		//Création de 20 Cercles
		for (int i = 0; i < 20; ++i) {
			Cercle cercle = ( Cercle ) FormeFactory.getCercle(couleurs[(int)(Math.random() * couleurs.length)]);
			cercle.setX((int)(Math.random() * 100));
			cercle.setY((int)(Math.random() * 100));
			cercle.setRayon((int)((Math.random() * 99)+1));
			cercle.dessiner();
		}
     }
}
