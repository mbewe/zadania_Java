package devices;

public class Car extends Device{

    final String model;
    int mileage;
    String color;
    String type;
    Double value;

    public Car(String producer, String model) {
        this.producer = producer;
        this.model = model;
    }
// Zadanie 6. Punkt(1)
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car auto = (Car) o;
        return this.model == auto.model &&
                this.producer == auto.producer;
    }

}