package transport;

import java.util.Set;

//Грузовой автомобиль
public class Truck extends Car implements Competable{

    public enum CarringCapacity{//грузоподъемность
        N1,//с полной массой до 3,5 тонн
        N2,//с полной массой свыше 3,5 до 12 тонн
        N3;//с полной массой свыше 12 тонн

        private float mass;
    }

    private CarringCapacity carringCapacity;

    private Set<Mechanic<Truck>> mechanics;

    public Truck(String brand,String model,float engineVolume,float mass,
                 Driver<Truck> driver,Set<Sponsor> sponsors,Set<Mechanic<Truck>> mechanics) {

        super(brand, model, engineVolume, driver, sponsors);

        if(mass<=3.5f){
            this.carringCapacity = CarringCapacity.N1;
        }else if(mass <=12f){
            this.carringCapacity = CarringCapacity.N2;
        }else {
            this.carringCapacity = CarringCapacity.N3;
        }
        carringCapacity.mass=mass;

        this.mechanics=mechanics;
    }

    public void getCarringCapacity(){
        if(carringCapacity == CarringCapacity.N1){
            System.out.println("Грузоподъемность с полной массой до 3,5 тонн");
        }else if(carringCapacity == CarringCapacity.N2){
            System.out.println("Грузоподъемность с полной массой свыше 3,5 до 12 тонн");
        }else {
            System.out.println("Грузоподъемность с полной массой свыше 12 тонн");
        }
        System.out.println();
    }


    //Метод начать движение
    @Override
    public void start(){
        System.out.println("Грузовой автомобиль "+getBrand()+" "+getModel()+" начал движение");
    }

    //Метод закончить движение
    @Override
    public void stop(){
        System.out.println("Грузовой автомобиль "+getBrand()+" "+getModel()+" закончил движение");
    }

    @Override
    public String toString(){
        return "\nГрузовой автомобиль: "+super.toString();
    }

    @Override
    public void pitStop() {
        System.out.println("Грузовой автомобиль: "+super.getBrand()+", "+super.getModel()+" находится на Пит-Стопе");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время грузового автомобиля: "+super.getBrand()+", "+super.getModel()+" - 700 сек");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость грузового автомобиля: "+super.getBrand()+", "+super.getModel()+" - 90 км/час");
    }

    @Override
    public boolean passDiagnostics(){
        double random=Math.random();
        return random>0.5;
    }

    public Set<Mechanic<Truck>> getMechanics() {
        return mechanics;
    }
}
