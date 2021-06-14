import Cars.Drivable;
import Factory.CarFactory;
import jdk.jshell.spi.ExecutionControl;

//EX-4
public class FactoryTest {
    public static void main(String[] args) throws ExecutionControl.NotImplementedException {
        CarFactory carFactory = new CarFactory();
        Drivable myBMW = carFactory.getCar("BMW");
        myBMW.drive();


    }
}
