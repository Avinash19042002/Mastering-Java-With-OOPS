import com.example.car.*;
public class MainApp {
    public static void main(String[] args) {
        //creating a local instance
        Car mycar = new Car("Tesla","2024");
        Engine engine= new Engine(200);

        //Using these onjects to call the Car and Engine Methods
        mycar.displayInfo();
        engine.start();
    }
}
