import java.util.Scanner;

public class main {
    private  static boolean isAlive=true;
  public static   Scanner sc = new Scanner(System.in);
    private static trip trip;
    trip trips = new trip();


    public static void main(String[] args) {

        System.out.println("welcom to snap");
        System.out.println("please select a number");
        System.out.println("/1:Have a trip");
        System.out.println("/2:scoring");
        System.out.println("/3:contat us");
        while ((isAlive)) {
            //get input
            String input = sc.nextLine();
            //proceess
            rout(input, trip);
            //show result

        }
    }

public  static  void rout(String input,trip trip) {
        switch (input){
            case "/addtrip":
                addTrip();
                break;
            case "/editTrip":
                editTrip();
                break;;
            default:
                wrongInput();
                break;;
}


        }

    private static void wrongInput() {
        System.out.println("wrong input");
    }

    private static void editTrip() {
    }

    private static void addTrip(trip trip) {
        System.out.println("enter orgin");
       String orgin=sc.nextLine();
        System.out.println("enter distinstio");
        String distination=sc.nextLine();
        String name;
        String carmodel;
        String phoneNumbre;
        Driver d=new Driver(name,carmodel,phoneNumbre);

    }


}
}
