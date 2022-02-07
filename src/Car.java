public class Car {
    private String model;
    private int miles;

    public Car (String name, int miles){
        model = name;
        this.miles = miles;
    }


    public String toString() {
        return  model + " " + miles + "mi";
    }
}
