package cart;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    AmountCalculation amountCalculation = new AmountCalculation();
    List<Product> cardData=new ArrayList<>();
   public void addCart(Product model){
       cardData.add(model);
   }
   public int getTotal(){
      return amountCalculation.calculate(cardData);
   }
}
