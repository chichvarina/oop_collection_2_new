package transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {

    private Queue<Car> queue;

    public ServiceStation() {
        queue = new LinkedList<>();
    }

    public void addToQueue(Car car){
        if(car instanceof Bus){
            System.out.println("Автобус "+ car.getModel()+" "+car.getBrand()+" в техосмотре не нуждается");
        }else {
            queue.offer(car);
            System.out.println("Автомобиль "+ car.getModel()+" "+car.getBrand()+" поставлен в очередь на техосмотр");
        }
    }

    public void carInspection(){
        Car car = queue.poll();
        if (car!=null) {
            System.out.println("Проведен техосмотр автомобиля " + car.getBrand() + " " + car.getModel());
        }
    }

}
