import transport.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MainTransport {

    public static void main(String[] args) {
        //Водители
        Driver<PassengerCar> ivanov=new Driver<>("Иванов","A678",10);
        Driver<Truck> petrov=new Driver<>("Петров","B345",10);
        Driver<Bus> sidorov=new Driver<>("Сидоров","C567",10);
        Driver smirnov=new Driver("Смирнов","ABCC111",15);//smirnov может водить любые машины

        //список водителей легковых машин
        //ArrayList<Driver<PassengerCar>> driversForPassengerCars=new ArrayList<>();
        Set<Driver<PassengerCar>> driversForPassengerCars=new HashSet<>();
        driversForPassengerCars.add(ivanov);
        driversForPassengerCars.add(smirnov);//smirnov может водить любые машины
        driversForPassengerCars.add(ivanov);//добавляем повторно водителя
        System.out.println("Водители легковых машин "+Arrays.toString(driversForPassengerCars.toArray()));

        //список водителей грузовых машин
        //ArrayList<Driver<Truck>> driversForTrucks=new ArrayList<>();
        Set<Driver<Truck>> driversForTrucks=new HashSet<>();
        driversForTrucks.add(petrov);
        driversForTrucks.add(smirnov);//smirnov может водить любые машины
        driversForTrucks.add(petrov);//добавляем повторно водителя
        System.out.println("Водители грузовых машин "+Arrays.toString(driversForTrucks.toArray()));

        //список водителей автобусов
        //ArrayList<Driver<Bus>> driversForBuses=new ArrayList<>();
        Set<Driver<Bus>> driversForBuses=new HashSet<>();
        driversForBuses.add(sidorov);
        driversForBuses.add(smirnov);
        driversForBuses.add(smirnov);//добавляем повторно водителя
        System.out.println("Водители автобусов "+Arrays.toString(driversForBuses.toArray()));

        System.out.println();

        //спонсоры
        Sponsor sponsor1=new Sponsor("Денежкин Петр");
        Sponsor sponsor2=new Sponsor("ООО Отмывайка");
        Sponsor sponsor3=new Sponsor("ОАО Завод по очистке воздуха");
        Sponsor sponsor4=new Sponsor("Козлов Сидор");

        //ArrayList<Sponsor> sponsors1=new ArrayList<>();
        Set<Sponsor> sponsors1=new HashSet<>();
        sponsors1.add(sponsor1);
        sponsors1.add(sponsor2);
        sponsors1.add(sponsor1);//тест повтора
        sponsors1.add(sponsor3);
        System.out.println("Коллекция спонсоров 1 "+Arrays.toString(sponsors1.toArray()));

        //ArrayList<Sponsor> sponsors2=new ArrayList<>();
        Set<Sponsor> sponsors2=new HashSet<>();
        sponsors2.add(sponsor2);
        sponsors2.add(sponsor3);
        sponsors2.add(sponsor4);
        sponsors2.add(sponsor3);//тест повтора
        System.out.println("Коллекция спонсоров 2 "+Arrays.toString(sponsors2.toArray()));

        //ArrayList<Sponsor> sponsors3=new ArrayList<>();
        Set<Sponsor> sponsors3=new HashSet<>();
        sponsors3.add(sponsor4);
        sponsors3.add(sponsor1);
        sponsors3.add(sponsor3);
        sponsors3.add(sponsor4);//тест повтора
        System.out.println("Коллекция спонсоров 3 "+Arrays.toString(sponsors3.toArray()));

        //ArrayList<Sponsor> sponsors4=new ArrayList<>();
        Set<Sponsor> sponsors4=new HashSet<>();
        sponsors4.add(sponsor1);
        sponsors4.add(sponsor2);
        sponsors4.add(sponsor2);//тест повтора
        sponsors4.add(sponsor4);
        System.out.println("Коллекция спонсоров 4 "+Arrays.toString(sponsors4.toArray()));

        System.out.println();

        //механики
        Mechanic<PassengerCar> mechanic1=new Mechanic<>("Наливайкин","Василий","ООО Шиномотаж");
        Mechanic<Truck> mechanic2=new Mechanic<>("Колесов","Петр","ООО Шиномотаж");
        Mechanic<Bus> mechanic3=new Mechanic<>("Домкратов","Лев","ИП Дократов");
        Mechanic mechanicUniversal=new Mechanic("Отверткин","Павел","ООО Открути");

        //ArrayList<Mechanic<PassengerCar>> mechanicsPassenger=new ArrayList<>();
        Set<Mechanic<PassengerCar>> mechanicsPassenger=new HashSet<>();
        mechanicsPassenger.add(mechanic1);
        mechanicsPassenger.add(mechanicUniversal);
        mechanicsPassenger.add(mechanicUniversal);//тест повтора
        System.out.println("Механики легковых машин "+Arrays.toString(mechanicsPassenger.toArray()));

        //ArrayList<Mechanic<Truck>> mechanicsTrucks=new ArrayList<>();
        Set<Mechanic<Truck>> mechanicsTrucks=new HashSet<>();
        mechanicsTrucks.add(mechanic2);
        mechanicsTrucks.add(mechanicUniversal);
        mechanicsTrucks.add(mechanic2);//тест повтора
        System.out.println("Механики грузовых машин "+Arrays.toString(mechanicsTrucks.toArray()));

        //ArrayList<Mechanic<Bus>> mechanicsBuses=new ArrayList<>();
        Set<Mechanic<Bus>> mechanicsBuses=new HashSet<>();
        mechanicsBuses.add(mechanic3);
        mechanicsBuses.add(mechanicUniversal);
        mechanicsBuses.add(mechanic3);//тест повтора
        System.out.println("Механики автобусов "+Arrays.toString(mechanicsBuses.toArray()));

        System.out.println();

        //легковые машины
        PassengerCar lada=new PassengerCar("Lada","Grande",1.7f,PassengerCar.Body.SEDAN,
                ivanov,sponsors1,mechanicsPassenger);
        PassengerCar audi=new PassengerCar("Audi","A8 50 L TDI quattro",3f,PassengerCar.Body.PICKUP,
                smirnov,sponsors2,mechanicsPassenger);
        PassengerCar bmw=new PassengerCar("BMW","Z8",3f,PassengerCar.Body.HATCHBACK,
                ivanov,sponsors3,mechanicsPassenger);
        PassengerCar kia=new PassengerCar("Kia","Sportage 4 поколение",2.4f,null,
                smirnov,sponsors4,mechanicsPassenger);

        //грузовые машины
        Truck kamaz=new Truck("КамАЗ","4308",5.9f,3f,
                petrov,sponsors4,mechanicsTrucks);
        Truck man=new Truck("MAN","Tgm",7f,6f,
                smirnov,sponsors3,mechanicsTrucks);
        Truck volvo=new Truck("Volvo","FM",6.5f,7f,
                petrov,sponsors1,mechanicsTrucks);
        Truck scania=new Truck("Scania","R500",8.5f,14f,
                smirnov,sponsors2,mechanicsTrucks);

        //автобусы
        Bus paz=new Bus("ПАЗ","3205",5f,18,
                sidorov,sponsors3,mechanicsBuses);
        Bus liaz6228=new Bus("ЛиАЗ","6228 Вояж L",6f,70,
                smirnov,sponsors4,mechanicsBuses);
        Bus liaz5292=new Bus("ЛиАЗ","5292",6.5f,110,
                smirnov,sponsors1,mechanicsBuses);
        Bus nefaz=new Bus("НефАЗ","52998",5.5f,55,
                sidorov,sponsors2,mechanicsBuses);

        //Список всех автомобилей
        //ArrayList<Car> cars=new ArrayList<>();
        Set<Car> cars=new HashSet<>();

        cars.add(lada);
        cars.add(audi);
        cars.add(bmw);
        cars.add(kia);

        cars.add(kamaz);
        cars.add(man);
        cars.add(volvo);
        cars.add(scania);

        cars.add(lada);//тест повтора

        cars.add(paz);
        cars.add(liaz5292);
        cars.add(liaz6228);
        cars.add(nefaz);

        System.out.println("Список автомобилей "+Arrays.toString(cars.toArray()));

        System.out.println();

        ServiceStation serviceStation=new ServiceStation();
        serviceStation.addToQueue(lada);
        serviceStation.addToQueue(man);
        serviceStation.addToQueue(paz);
        serviceStation.addToQueue(bmw);

        serviceStation.carInspection();
        serviceStation.carInspection();
        serviceStation.carInspection();
        serviceStation.carInspection();

    }
}

