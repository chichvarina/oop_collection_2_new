package transport;

import java.util.Objects;

public class Sponsor {
    private final String name;

    public Sponsor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void toSpons(Car car, int price){
        System.out.println("Спонсор" + this.name
                +" спонсировал заезд автомобиля "+car.getBrand()+" "+car.getModel());
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
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
        Sponsor any = (Sponsor) obj;
        return this.name.equals(any.name);
    }
}
