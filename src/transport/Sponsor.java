package transport;

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
}
