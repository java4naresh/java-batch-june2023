public class UdipiHotel implements HotelInterface {

    int idlyPrice;
    
    int puriPrice;

    int dosaPrice;

    int chapathiPrice;

    String location;

   public UdipiHotel(int idlyPrice, int puriPrice, int dosaPrice, int chapathiPrice, int String location){
    
    this.idlyPrice = idlyPrice;
    this.puriPrice = puriPrice;
    this.dosaPrice = dosaPrice;
    this.chapathiPrice = chapathiPrice;
    this.location = location;
   } 

   public int idlyPrice(){
         return 30;
   }
   
    public int puriPrice(){
         return 40;
   }
   

    public int dosaPrice(){
         return 60;
   }
   

    public int chapathiPrice(){
         return 45;
   }

    public int udipiSpecialItemPrice(){
         return 100;
   }
}
   
   
   
   