public class RoomDimension {
   private double L;
   private double W; 
   
   public RoomDimension(double L, double W) {
      this.L = L;
      this.W = W;
   }
   
   public double getArea() {
      return L * W;
   }
   
   public String toString() {
      return "Dimensions of room: (length = " + L + ", width = " + W + ")";
   }
   
}