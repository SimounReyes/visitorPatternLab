package visitorPatternLab.visitorPatternLab;



public class Furnitures implements FurnituresTypeSize{
    
    private String furnitureType;
    private String furnitureSize;
    private double distance;

    public Furnitures(String furnitureType, String furnitureSize, double distance){
        this.furnitureType = furnitureType;
        this.furnitureSize = furnitureSize;
        this.distance = distance;
    }

    public String getFurnitureType(){
        return furnitureType;
    }
    public String getFurnitureSize(){
        return furnitureSize;
    }
    public Integer getDistance(){
        return distance;
    }


    @Override
    public double accept(ProductDetails product, String furnitureSize){
        //this.furnitureSize = furnitureSize;
        return product.showPrice(furnitureType, furnitureSize);
    }


    @Override
    public double accept(Shipping shipping, String furnitureSize){
        //this.furnitureSize = furnitureSize;
        return shipping.showShippingCost(distance, furnitureSize);
    }

}
