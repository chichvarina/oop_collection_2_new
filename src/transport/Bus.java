package transport;

import java.util.Set;

//Автобус
public class Bus extends Car implements Competable{

    public enum BusCapacity{
        VERY_LITTLE_CAPACITY,//особо малая (до 10 мест)
        LITTLE_CAPACITY,//малая (до 25)
        MEDIUM_CAPACITY,//средняя (40-50)
        BIG_CAPACITY, //большая (60-80)
        VERY_BIG_CAPACITY;//особо большая (100-120 мест)

        private int seatsNumber;

        public int getSeatsNumber() {
            return seatsNumber;
        }

        public void setSeatsNumber(int seatsNumber) {
            this.seatsNumber = seatsNumber;
        }
    }

    private BusCapacity busCapacity;

    public Bus(String brand, String model, float engineVolume, int seatsNumber,
               Driver<Bus> driver, Set<Sponsor> sponsors, Set<Mechanic> mechanics) {
        super(brand, model, engineVolume, driver, sponsors, mechanics);

        if(seatsNumber<=10){
            this.busCapacity = BusCapacity.VERY_LITTLE_CAPACITY;

        }else if(seatsNumber<=25){
            this.busCapacity = BusCapacity.LITTLE_CAPACITY;

        }else if(seatsNumber>=40 && seatsNumber<=50){
            this.busCapacity = BusCapacity.MEDIUM_CAPACITY;

        }else if(seatsNumber>=60 && seatsNumber<=80){
            this.busCapacity = BusCapacity.BIG_CAPACITY;

        }else if(seatsNumber>=100 && seatsNumber<=120){
            this.busCapacity = BusCapacity.VERY_BIG_CAPACITY;
        }
        if(this.busCapacity !=null) {
            this.busCapacity.setSeatsNumber(seatsNumber);
        }

    }

    public void getBusCapasity() {
        if(busCapacity==null){
            System.out.println("Данных для определения типа авто недостаточно");
        }else{
            switch (busCapacity){
                case VERY_LITTLE_CAPACITY:{
                    System.out.println("Тип авто: особо малая (до 10 мест)");
                    break;
                }
                case LITTLE_CAPACITY:{
                    System.out.println("Тип авто: малая (до 25 мест)");
                    break;
                }
                case MEDIUM_CAPACITY:{
                    System.out.println("Тип авто: средняя (40-50 мест)");
                    break;
                }
                case BIG_CAPACITY:{
                    System.out.println("Тип авто: большая (60-80 мест)");
                    break;
                }
                case VERY_BIG_CAPACITY:{
                    System.out.println("Тип авто: особо большая (100-120 мест)");
                    break;
                }
            }
        }
        System.out.println();
    }

    //Метод начать движение
    @Override
    public void start(){
        System.out.println("Автобус: "+getBrand()+" "+getModel()+" начал движение");
    }

    //Метод закончить движение
    @Override
    public void stop(){
        System.out.println("Автобус: "+getBrand()+" "+getModel()+" закончил движение");
    }

    @Override
    public String toString(){
        if(busCapacity==null){
            return "\nАвтобус: "+super.toString()+", количество мест: Не определено";
        }else{
            return "\nАвтобус: "+super.toString()+", количество мест: "+ busCapacity.getSeatsNumber();
        }

    }

    @Override
    public void pitStop() {
        System.out.println("Автобус: "+super.getBrand()+", "+super.getModel()+" находится на Пит-Стопе");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время автобуса: "+super.getBrand()+", "+super.getModel()+" - 600 сек");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость автобуса: "+super.getBrand()+", "+super.getModel()+" - 100 км/час");
    }

    public boolean passDiagnostics(){
        System.out.println(this+" в диагностике не нуждается");
        return true;
    }

}
