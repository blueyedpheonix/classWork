package runners;

import static runners.carType.*;

public class Car {
    private carType type;

    public Car(carType type) {
        this.type = type;
    }
    public int carValue(){
        switch (type) {

            case TAYOTA:
                return 2000;
            case SUBARO:
                return 30000;
            case TESLA:
                return 1000000;
                default:
                    return 0;
        }
    }
}
