public class RoomCarpet {
   private RoomDimension roomD;
   private double carpetCost;
   
   public RoomCarpet(RoomDimension roomD, double carpetCost) {
      this.roomD = roomD;
      this.carpetCost = carpetCost;
   }
   
   public double getTotalCost() {
      return carpetCost * roomD.getArea();
   }
   
   public String toString() {
      return "" + roomD + ", Carpet cost per square feet = $" + carpetCost + ", " + "Total cost = $" + getTotalCost() + "";
   }
   
}