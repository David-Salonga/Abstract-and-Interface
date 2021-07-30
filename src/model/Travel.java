package model;

public class Travel {
    public int car = 500, bus = 300, train = 400, plane = 1000;
    public int budget = 500;
    public Travel() {
    }

    public Travel(int car, int bus, int train, int plane) {
        this.car = car;
        this.bus = bus;
        this.train = train;
        this.plane = plane;
    }

    public void compute(){
        if (car <= budget){
            System.out.println("Xiaoming can choose to drive a car.");
        } if(bus <= budget){
            System.out.println("Xiaoming can choose to ride a bus.");
        } if(train <= budget){
            System.out.println("Xiaoming can choose to ride a train.");
        } if(plane <= budget){
            System.out.println("Xiaoming can choose to ride a plane.");
        }

    }
}
