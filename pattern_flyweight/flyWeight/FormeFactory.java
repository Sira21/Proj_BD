import java.util.HashMap;

class FormeFactory {
   private static final HashMap<String, Forme> mapCercles = new HashMap();

   //Methode permettant la création de nouveaux cercles
   public static Forme getCercle(String couleur) {
	   
	  //On récupère le cercle s'il est présent dans la map
      Cercle cercle = (Cercle)mapCercles.get(couleur);
      
      //Dans le cas contraire on fait une nouvelle instance de Cercle
      if(cercle == null) {
         cercle = new Cercle(couleur);
         mapCercles.put(couleur, cercle);
         System.out.println("Création d'un cercle de couleur : " + couleur);
      }
      return cercle;
   }
}