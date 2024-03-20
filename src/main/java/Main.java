import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Practical task 1.8, student Igor Smirnov,RIBO-01-22, variant 1");
        boolean flag = true;
        int choice;
        Scanner scan = new Scanner(System.in);
        Garage garage = new Garage();
        String text = "";
        while (flag){
            System.out.print("Выберите что вы хотите сделать\n"+
                    "1- Добавить машину\n" +
                    "2- Удалить машину по государственному номеру\n" +
                    "3- Удалить все машины\n" +
                    "0- Выйти из программы\n" +
                    "Ввод: ");
            choice = scan.nextInt();
            scan.nextLine();
            String name,gosNumber="";
            int year;
            boolean avableGosNumber = false;
            switch (choice) {
                case (1):
                    System.out.print("Введите название машины: ");
                    name = scan.nextLine();
                    System.out.print("Введите год выпуска: ");
                    year = scan.nextInt();
                    while (!avableGosNumber) {
                        System.out.print("Введите гос номер машины: ");
                        gosNumber = scan.next();
                        boolean haves = garage.haveCar(gosNumber);
                        if (!haves) {
                            avableGosNumber = Car.gosNumAvable(gosNumber);
                        }else{
                            System.out.println("Машмна с даным гос номером уже существует");
                        }
                    }
                    garage.addCar(name, gosNumber, year);
                    System.out.println("Машина добавлена");
                    text = garage.toString();
                    if (!text.isEmpty()) {
                        System.out.println("Список машин");
                        System.out.println(garage.toString());
                    }else {
                        System.out.println("На данный момент нет никаких машин в списке");
                    }
                    break;
                case (2):
                    System.out.print("Введите гос номер машины которую хотите удалить: ");
                    gosNumber = scan.next();
                    garage.deleteCar(gosNumber);
                    text = garage.toString();
                    if (!text.isEmpty()) {
                        System.out.println("Список машин");
                        System.out.println(garage.toString());
                    }else {
                        System.out.println("На данный момент нет никаких машин в списке");
                    }
                    break;
                case (3):
                    garage.clearAllAuto();
                    System.out.println("Все машины удалены");
                    text = garage.toString();
                    if (!text.isEmpty()) {
                        System.out.println("Список машин");
                        System.out.println(garage.toString());
                    }else {
                        System.out.println("На данный момент нет никаких машин в списке");
                    }
                    break;
                case (0):
                    System.out.println("До свидания");
                    flag = !flag;
            }
        }
    }
}
