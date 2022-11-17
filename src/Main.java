import Draiver.DriverLicensesC;
import TransportPack.Bus;
import TransportPack.Car;
import TransportPack.Truck;

public class Main {
    public static void main(String[] args) {

        //Вводные данные
        Car lada = new Car("Lada", "Vesta", 2.0);
        Car kia = new Car("KIA", "Cerato", 2.5);
        Car skoda = new Car("Skoda", "Octavia", 3.0);
        Car audi = new Car("Audi", "A3", 3.0);
        Bus man = new Bus("MAN", "Lion’s Coach", 5.0);
        Bus gaz = new Bus("GAZ", "Вектор Next", 3.3);
        Bus maz = new Bus("MAZ", "232", 3.5);
        Bus setra = new Bus("Setra", "Provate", 3.8);
        Truck iveco = new Truck("Iveco", "MP 260E38 6x6", 12.0);
        Truck mon = new Truck("MON", "41.410 8x4", 10.0);
        Truck volvo = new Truck("VOLVO", "FMX-500-10X4", 13.0);
        Truck mercedes = new Truck("Mercedes-Benz", "Atego 815", 4.2);
        //Вводные данные 2
        DriverLicensesC driverC = new DriverLicensesC("Евпатий Коловрат",
                "Лицензия выданная боженькой по управлению грузавиком",13,volvo);

        //Вывод результата
        System.out.println("===============================================================================");
        lada.info();
        man.info();
        iveco.info();
        System.out.println("===============================================================================");
        System.out.println(driverC);


    }

}
