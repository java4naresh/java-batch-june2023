public class HotelCustomer {
  
  public static void main (String[] args){
     HotelInterface raghavendra = new RaghavendraHotel();
     System.out.println(raghavendra.idlyPrice());
     HotelInterface udipi = new UdipiHotel();
     System.out.println(udipi.idlyPrice());

     AnnapurnaHotel ri = new AnnapurnaHotel();
     System.out.println(ri.chickenBiryaniPrice());
}
}
      
     