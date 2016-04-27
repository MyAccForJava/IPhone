package phone.iphone;

import java.util.List;

/**
 *
 * @author Admin
 */
public interface IphoneDAO {
    
         public List<Iphone> getListIphone();
//     public void addIphone(Iphone iphone);
      public Iphone getIphone(int id);
    
}
