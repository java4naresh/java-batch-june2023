public class User{
public static void main(String [] args){
      Guest guest=new Guest();
      guest.read();
      
      Devloper devloper=new Devloper();
      devloper.write();

      Admin admin=new Admin();
      admin.manage();
}
}