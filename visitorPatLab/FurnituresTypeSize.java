package visitorPatternLab.visitorPatternLab;



public interface FurnituresTypeSize {
    public double accept(ProductDetails productDetails, String furnitureSize);
    public double accept(Shipping shipping, String furnitureSize);
}