import java.util.Scanner;

public class main {
    private  static boolean isAlive=true;
  public static   Scanner sc = new Scanner(System.in);

    trip trips = new trip();


    public static void main(String[] args) {

        System.out.println("welcom to snap");
        while ((isAlive)) {
            //get input
            String input = sc.nextLine();
            //proceess
            rout(input);
            //show result

        }
    }

public  static  void rout(String input) {
        switch (input){
            case "/addtrip":
                addTrip(trip trip);
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
        

    }


}
