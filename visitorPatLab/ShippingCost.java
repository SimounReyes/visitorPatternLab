package visitorPatternLab.visitorPatternLab;
import java.util.HashMap;
import java.util.Map;

public class ShippingCost implements Shipping{
    private static Map<String, Double> shippingFee = new HashMap<>();
    static{
        shippingFee.put("Small", 0.0);
        shippingFee.put("Medium", 0.8);
        shippingFee.put("Large", 1.5);
    }
    @Override
    public double showShippingCost(double distance, String furnitureSize) {        
        return shippingFee.get(furnitureSize) * (distance * 12.0);
    }
    
}
