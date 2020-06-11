import java.util.ArrayList;

public class Driver {
    private String name;
  private   String carmodel;

  private  int phoneNumbre;

    private  boolean istrip;

    public boolean isIstrip() {
        return istrip;
    }

    public Driver(String name, String carmodel, int phoneNumbre, boolean istrip) {
        this.name = name;
        this.carmodel = carmodel;
        this.phoneNumbre = phoneNumbre;
        this.istrip = istrip;
    }

    public void setIstrip(boolean istrip) {
        this.istrip = istrip;

    }


}
