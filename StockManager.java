import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author (your name) 
 * @version 7.0
 */
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stockList;

    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stockList = new ArrayList<>();
    }

    /**
     * Add a product to the list.
     * @param item The item to be added.
     */
    public void addProduct(Product item)
    {
        if (findProduct(item.getID()) == null) {
        stockList.add(item);
    }  
    }
    
    /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void delivery(int id, int amount)
    {
        Product item = findProduct(id);
        if (item != null){
            item.increaseQuantity(amount);
        }
    }
    
    /**
     * Try to find a product in the stock with the given id.
     * @return The identified product, or null if there is none
     *         with a matching ID.
     */
    public Product findProduct(int id)
    {
        for (Product item : stockList){
            if (item.getID()==id){
                return item;
            }
        }
        return null;
    }
    
    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public int numberInStock(int id)
    {
        Product item = findProduct(id);
        if (item != null) {
            return item.getQuantity();
        }
        return 0;
    }

    /**
     * Print details of all the products.
     */
    public void printProductDetails()
    {
        for  (Product item : stockList){
            System.out.println(item.toString());
        }
        }
        
public void printLowStock(int level)
{
    for (Product item : stockList) {
        if (item.getQuantity() < level) {
            System.out.println(item.toString());
        }
    }
}
public Product findProduct(String name)
{
    for (Product item : stockList) {
        if (item.getName().equals(name)) {
            return item;
        }
    }
    return null;
}
    }
    

