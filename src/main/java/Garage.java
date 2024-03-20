import java.util.HashMap;

public class Garage {
    private HashMap<String,Car> automobiles = new HashMap<>();
    public void addCar(String name,String gosNumber,int year){
        automobiles.put(gosNumber,new Car(name, gosNumber, year));
    }

    public boolean haveCar(String gosNumber){
        return automobiles.containsKey(gosNumber);
    }
    public void clearAllAuto(){
        automobiles.clear();
    }
    @Override
    public String toString() {
        String resulText = "";
        for (Car car : automobiles.values()) {
            resulText += car.getName() + ", " + car.getYear() + ", " + car.getGosNumber()+"\n";
        }
        return resulText;
    }

    public void deleteCar(String gosNumber){
        boolean have = haveCar(gosNumber);
        if (have){
            automobiles.remove(gosNumber);
            System.out.println("Машина удалена");
        }else{
            System.out.println("Машины с данном гос номером не существует");
        }
    }
}