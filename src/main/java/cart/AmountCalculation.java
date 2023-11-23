package cart;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AmountCalculation {
    public int calculate(List<Product> cardData){
        Map<String,Integer> products = new HashMap<>();
        int totel = 0;
        for(Product data:cardData){
            if(products.containsKey(data.product)){
               products.put(data.product,(Integer) products.get(data.product+data.price));
            }else{
                products.put(data.product,data.price);
            }
        }
        for (Map.Entry<String,Integer> entry : products.entrySet()){
            totel+=entry.getValue();
        }
        return totel;

    }
}
