import java.util.ArrayList;

/**
 * Furniture is a parent class that contains
 * variables common to all different categories
 * of furniture.
 */
public class Furniture {
    protected ArrayList<String> IDs;
    protected int totalPrice;
    protected int completeSet;

    /**
     * Constructor
     *
     * @param _ID
     * @param _price
     * @param set
     */
    public Furniture(String _ID, int _price, int set) {
        this.IDs = new ArrayList<>();
        this.IDs.add(_ID);
        this.totalPrice = _price;
        this.completeSet = set;
    }

    /**
     * Constructor
     *
     * @param _IDs
     * @param _price
     * @param set
     */
    public Furniture(ArrayList<String> _IDs, int _price, int set) {
        this.IDs = _IDs;
        this.totalPrice = _price;
        this.completeSet = set;
    }

    /**
     * Getter for IDS
     *
     * @return
     */
    public ArrayList<String> getIDs() {
        return this.IDs;
    }

    /**
     * Getter for price
     *
     * @return
     */
    public int getPrice() {
        return this.totalPrice;
    }
}