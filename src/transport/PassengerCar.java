package transport;

import java.util.Set;

//легковой автомобиль
public class PassengerCar extends Car implements Competable {
    public enum Body{
        SEDAN,//Седан
        HATCHBACK,//Хетчбек
        COUPE,//Купе
        UNIVERSAL,//Универсал
        OFFROAD,//Внедорожник
        CROSSOVER,//Кроссовер
        PICKUP,//Пикап
        VAN,//Фургон
        MINIVAN//Минивэн
    }
    private Body body;

    private Set<Mechanic<PassengerCar>> mechanics;

    public PassengerCar(String brand,String model,float engineVolume,Body body,
                        Driver<PassengerCar> driver,Set<Sponsor> sponsors,Set<Mechanic<PassengerCar>> mechanics) {
        super(brand, model, engineVolume, driver, sponsors);
        this.body=body;
        this.mechanics=mechanics;
    }

    public void getBody(){
        if(body==null){
            System.out.println("Тип кузова не определен");
        }else{
            switch (body){
                case SEDAN:{
                    System.out.println("Тип кузова: седан");
                    break;
                }
                case HATCHBACK:{
                    System.out.println("Тип кузова: Хетчбек");
                    break;
                }
                case COUPE:{
                    System.out.println("Тип кузова: купе");
                    break;
                }
                case UNIVERSAL:{
                    System.out.println("Тип кузова: универсал");
                    break;
                }
                case OFFROAD:{
                    System.out.println("Тип кузова: внедорожник");
                    break;
                }
                case CROSSOVER:{
                    System.out.println("Тип кузова: кроссовер");
                    break;
                }
                case PICKUP:{
                    System.out.println("Тип кузова: пикап");
                    break;
                }
                case VAN:{
                    System.out.println("Тип кузова: фургон");
                    break;
                }
                case MINIVAN:{
                    System.out.println("Тип кузова: минивэн");
                    break;
                }
            }
        }
        System.out.println();
    }

    //Метод начать движение
    @Override
    public void start(){
        System.out.println("Легковой автомобиль: "+super.getBrand()+" "+super.getModel()+" начал движение");
    }

    //Метод закончить движение
    @Override
    public void stop(){
        System.out.println("Легковой автомобиль: "+super.getBrand()+" "+super.getModel()+" закончил движение");
    }

    @Override
    public String toString(){
        return "\nЛегковой автомобиль: " + super.toString();
    }

    @Override
    public void pitStop() {
        System.out.println("Легковой автомобиль: "+super.getBrand()+", "+super.getModel()+" находится на Пит-Стопе");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время легкового автомобиля: "+super.getBrand()+", "+super.getModel()+" - 220 сек");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость легкового автомобиля: "+super.getBrand()+", "+super.getModel()+" - 170 км/час");
    }


    @Override
    public boolean passDiagnostics(){
        double random=Math.random();
        return random>0.5;
    }

    public Set<Mechanic<PassengerCar>> getMechanics() {
        return mechanics;
    }
}
