class Cercle implements Forme {
	   private String couleur;
	   private int x;
	   private int y;
	   private int rayon;

	   //Constructeur du cercle
	   public Cercle(String couleur){
	      this.couleur = couleur;		
	   }
	   
	   // X et Y sont les coordonnées du centre du cercle
	   
	   //Setter de X
	   public void setX(int x) {
	      this.x = x;
	   }

	   //Setter de Y
	   public void setY(int y) {
	      this.y = y;
	   }

	   //Setter du rayon
	   public void setRayon(int rayon) {
	      this.rayon = rayon;
	   }
	   
	   //Methode de l'affichage du cercle
	   public void dessiner() {
	      System.out.println("Cercle: Dessiner() [Couleur : " + this.couleur + ", x : " + this.x + ", y :" + this.y + ", Rayon :" + this.rayon);
	      
	   }

	}