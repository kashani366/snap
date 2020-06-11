import java.util.ArrayList;

public class trip {
    ArrayList<Driver> Drivers=new ArrayList<Driver>();

    private String orgin;

    private String distination;

    Driver driver;

    public trip(String orgin, String distination, Driver driver) {
        this.orgin = orgin;
        this.distination = distination;
        this.driver = driver;
        public void addDriver(Driver driver)
        {
            Drivers.add(driver);


        }
    }

    public trip() {

    }
}
