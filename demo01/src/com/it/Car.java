package com.it;

public class Car {
    private Integer wheel;
    private Integer lights;
    private String color;

    public Car() {
    }

    public Car(Integer wheel, Integer lights, String color) {
        this.wheel = wheel;
        this.lights = lights;
        this.color = color;
    }

    public Integer getWheel() {
        return wheel;
    }

    public Integer getLights() {
        return lights;
    }

    public String getColor() {
        return color;
    }

    public void setWheel(Integer wheel) {
        this.wheel = wheel;
    }

    public void setLights(Integer lights) {
        this.lights = lights;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void drive() {
        System.out.println("there is " + wheel +" wheels and " + lights +" lights in a car");
    }

}

class Bus extends Car {
    private Integer seats;

    public Bus() {
        super();
    }

    public Bus(Integer wheel, Integer lights, String color, Integer seats) {
        super(wheel, lights, color);
        this.seats = seats;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    @Override
    public void drive() {
        System.out.println("there is " + super.getWheel() +" wheels and " + super.getLights() +" lights in a bus");
    }
}

class TestCar{
    public static void main(String[] args) {

        Car car = new Bus();
        car.setWheel(4);
        car.setLights(8);
        car.setColor("green");
        car.drive();
    }
}
