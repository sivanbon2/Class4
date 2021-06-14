package Factory;

import Cars.BMW;
import Cars.Drivable;
import Cars.Fiat;
import Cars.Porsche;
import jdk.jshell.spi.ExecutionControl;

public class CarFactory {

    public static Drivable getCar(String carType) throws ExecutionControl.NotImplementedException {
        switch (carType){
            case "BMW":
                return new BMW();
            case "Fiat":
                return new Fiat();
            case "Porsche":
                return new Porsche();
            default:
                throw new ExecutionControl.NotImplementedException
                        ("No such car type: " + carType);
        }

    }
}
