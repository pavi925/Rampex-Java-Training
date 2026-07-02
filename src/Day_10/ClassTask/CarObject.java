package Day_10.ClassTask;
public class CarObject {
    public static void main(String[] args){
        Car c1 = new Car();
        Car c2 = new Car();
        c2.brand = "Audi";
        c1.colour = "Lavender";
        c2.colour = "Black";
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();

    }
}

class Car{
    String brand = "BMW";
    String model = "M5";
    String colour;
    int speed = 0;
    int maxspeed = 40;
    public void accelerate() {
        if (speed >= maxspeed) {
            System.out.println(brand + "is already at maximum speed.");
        } else {
            speed = speed + 5;
            System.out.println(brand + " is travelling at " + speed + " kms");
        }
    }
    public void brake(){
        if(speed ==0){
            System.out.println("Vehicle is in rest.");
        }else{
            speed = speed - 5;
            System.out.println(brand + " is travelling at " + speed  + " kms");
        }
    }
}

