public class Car {
    private String name;
    private String gosNumber;
    private int year;

    public Car(String name, String gosNumber, int year) {
        this.name = name;
        this.gosNumber = gosNumber;
        this.year = year;
    }
    public static boolean gosNumAvable(String gosNumber){
        boolean result = gosNumber.matches("\\S\\d\\d\\d\\S\\S");
        if (!result){
            System.out.println("Гос номер не соответсвует формату");
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public String getGosNumber() {
        return gosNumber;
    }

    public int getYear() {
        return year;
    }
}
