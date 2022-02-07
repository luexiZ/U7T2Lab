
import java.util.ArrayList;
/**
 * This class represents a UsedCarLot
 *
 * @author Luexi Zhao
 */
public class UsedCarLot
{
    /** The inventory of the CarLot*/
    private ArrayList<Car> inventory;

    /**
     * It instantiates a UsedCarLot
     *
     */
    public UsedCarLot()
    {
        inventory = new ArrayList<Car>();
    }

    /**
     * Returns all the current Cars in inventory
     * @return The cars in the inventory
     */
    public ArrayList<Car> getInventory()
    {
        return inventory;
    }

    /**
     * Adds a new Car object inside the inventory
     *
     * @param newCar The new Car object
     */
    public void addCar (Car newCar)
    {
        inventory.add(newCar);
    }

    /**
     * It switches the position of the index A and index B
     *
     * @param a index of the first Car
     * @param b index of the second Car
     * @return (boolean) if swap is successful
     */
    public boolean swap (int a, int b)
    {
        if(a < inventory.size() && b < inventory.size() && a >= 0 && b >= 0)
        {
            Car temp = inventory.set(a, inventory.get(b));
            inventory.set(b, temp);
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Adds a Car to the inventory list at the index specified by indexToAdd; increases the size of inventory by 1
     * <p>
     * PRECONDITION: 0 &lt;= indexToAdd &lt; inventory.size()
     *
     * @param indexToAdd The position the car is added to
     * @param carToAdd The car object
     */
    public void addCar(int indexToAdd, Car carToAdd)
    {
        inventory.add(indexToAdd, carToAdd);
    }

    /**
     * Sells the Car located at indexOfCarToSell which removes it from the inventory list; reduces the size of inventory by 1
     *<p>
     * PRECONDITION: indexOfCarToSell &lt; inventory.size()
     *
     * @param indexOfCarToSell the index of the Car that is to be sold
     * @return The Car that is being "sold"
     */
    public Car sellCarShift(int indexOfCarToSell)
    {

        Car sold = inventory.remove(indexOfCarToSell);
        return sold;
    }

    /**
     * Sells the Car located at indexOfCarToSell; REPLACE the Car at indexOfCarToSell with NULL without reducing the size of inventory by 1
     * <p>
     *  PRECONDITION: indexOfCarToSell &lt; inventory.size()
     *
     * @param indexOfCarToSell the index of the Car that is to be sold
     * @return The Car that is being "sold" (replaced with null)
     */
    public Car sellCarNoShift(int indexOfCarToSell)
    {
        Car sold = inventory.get(indexOfCarToSell);
        inventory.set(indexOfCarToSell, null);
        return sold;
    }

    /**
     *  Moves Car located at index indexOfCarToMove to index destinationIndex
     *  <p>
     *  PRECONDITIONS: indexOfCarToMove &lt; inventory.size(); destinationIndex &lt; inventory.size()
     *
     * @param indexOfCarToMove the index of the Car to move
     * @param destinationIndex Position the car moves to
     */
    public void moveCar(int indexOfCarToMove, int destinationIndex)
    {
        Car goodCar = inventory.remove(indexOfCarToMove);
        inventory.add(destinationIndex,  goodCar);
    }







}
