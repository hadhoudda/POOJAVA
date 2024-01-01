package fr.houda.record;

public record RecordPoint(double x, double y) {
 /*
  * dans ce class de type record pas de constructrur d'intialisation 
  * mais on peut l'ajouter mais il faut aussi d'ajouter le constructeur de parametere
  * comme ça
  * public Point() {
  *     this( 0, 0 );
  * }
  *  
  * public Point( double x, double y ) {
  *   this.x = x;
  *   this.y = y;
  * }
  * 
  */
}
