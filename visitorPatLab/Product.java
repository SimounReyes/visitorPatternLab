package visitorPatternLab.visitorPatternLab;

import java.util.HashMap;
import java.util.Map;

public class Product implements ProductDetails{
    private static Map<String, Double> productPrice = new HashMap<>();

    static {
        productPrice.put("TableMedium", 5000.0);
        productPrice.put("TableSmall", 3000.0);
        productPrice.put("TableLarge", 10000.0);
        productPrice.put("ChairMedium", 750.0);
        productPrice.put("ChairSmall", 250.0);
        productPrice.put("ChairLarge", 1500.0);
        productPrice.put("SofaMedium", 5000.0);
        productPrice.put("SofaLarge", 10000.0);
    }
    @Override
    public double showPrice(String furnitureType, String furnitureSize){
        String typeSize = furnitureType + "" + furnitureSize;
        return productPrice.getOrDefault(typeSize, 0.0);
        
    }

    
}
