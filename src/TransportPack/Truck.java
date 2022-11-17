package TransportPack;

public class Truck extends Transport implements Competing{
    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }
    @Override
    public void startDriving() {
        System.out.printf("Грузовик " + this.getBrand() + this.getModel() + " начал движение");
    }
    @Override
    public void endDriving() {
        System.out.printf("Грузовик " + this.getBrand() + this.getModel() + " закончил движение");
    }


    public void info() {
        System.out.println("Грузовик  " + this.getBrand() + " " + this.getModel() + " " + this.getEngineVolume());
    }

    @Override
    public void pitStop() {

    }

    @Override
    public int bestLapTime() {
        return 0;
    }

    @Override
    public int maxSpeed() {
        return 0;
    }
}
