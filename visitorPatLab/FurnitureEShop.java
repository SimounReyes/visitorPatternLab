package visitorPatternLab.visitorPatternLab;

public class FurnitureEShop {
    public static void main(String[] args) {
        Furnitures mrWyatt = new Furnitures("Chair", "Small", 20);
        Furnitures msYuro = new Furnitures("Sofa", "Large", 10);
        Furnitures msTots = new Furnitures("Table", "Medium", 15);
        Furnitures mrButch = new Furnitures("Chair", "Large", 5);
        Furnitures mrSushi = new Furnitures("Sofa", "Medium", 10);
        Furnitures msJu = new Furnitures("Table", "Large", 15);

        ProductDetails productDetails = new Product();
        Shipping shipping = new ShippingCost();

        System.out.println("Customer: Mr. Wyatt\nThe price of the " + mrWyatt.getFurnitureType() + " that has the size of " + mrWyatt.getFurnitureSize() + " is Php" + mrWyatt.accept(productDetails, mrWyatt.getFurnitureSize()));
        System.out.println("The shipping fee for your purchased is Php" + mrWyatt.accept(shipping, mrWyatt.getFurnitureSize()));

        System.out.println("\nCustomer: Ms. Yuro\nThe price of the " + msYuro.getFurnitureType() + " that has the size of " + msYuro.getFurnitureSize() + " is Php" + msYuro.accept(productDetails, msYuro.getFurnitureSize()));
        System.out.println("The shipping fee for your purchased is Php" + msYuro.accept(shipping, msYuro.getFurnitureSize()));

        System.out.println("\nCustomer: Ms. Tots\nThe price of the " + msTots.getFurnitureType() + " that has the size of " + msTots.getFurnitureSize() + " is Php" + msTots.accept(productDetails, msTots.getFurnitureSize()));
        System.out.println("The shipping fee for your purchased is Php" + msTots.accept(shipping, msTots.getFurnitureSize()));

        System.out.println("\nCustomer: Mr. Butch\nThe price of the " + mrButch.getFurnitureType() + " that has the size of " + mrButch.getFurnitureSize() + " is Php" + mrButch.accept(productDetails, mrButch.getFurnitureSize()));
        System.out.println("The shipping fee for your purchased is Php" + mrButch.accept(shipping, mrButch.getFurnitureSize()));

        System.out.println("\nCustomer: Mr. Sushi\nThe price of the " + mrSushi.getFurnitureType() + " that has the size of " + mrSushi.getFurnitureSize() + " is Php" + mrSushi.accept(productDetails, mrSushi.getFurnitureSize()));
        System.out.println("The shipping fee for your purchased is Php" + mrSushi.accept(shipping, mrSushi.getFurnitureSize()));

        System.out.println("\nCustomer: Ms. Ju\nThe price of the " + msJu.getFurnitureType() + " that has the size of " + msJu.getFurnitureSize() + " is Php" + msJu.accept(productDetails, msJu.getFurnitureSize()));
        System.out.println("The shipping fee for your purchased is Php" + msJu.accept(shipping, msJu.getFurnitureSize()));
    }
    
}
