package transport;

import java.util.Objects;

public class Mechanic<T extends Car> {
    private final String family;
    private final String name;

    private final String company;

    public Mechanic(String family, String name, String company) {
        this.family = family;
        this.name = name;
        this.company=company;
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public void maintenanceCar(T car){
        System.out.println("Механик "+this.family+" "+this.name
                + " провел техобслуживание автомобиля " +car.getBrand()+" "+car.getModel());
    }

    public void repairCar(T car){
        System.out.println("Механик "+this.family+" "+this.name
                + " выполнил ремонт автомобиля " +car.getBrand()+" "+car.getModel());
    }

    @Override
    public String toString() {
        return family + " " + name;
    }


    @Override
    public int hashCode() {
        return Objects.hash(family,name,company);
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }else if(obj==null){
            return false;
        }else if(this.getClass()!=obj.getClass()){
            return false;
        }
        Mechanic<T> any = (Mechanic<T>) obj;
        return this.family.equals(any.family) && this.name.equals(any.name) && this.company.equals(any.company);
    }
}
