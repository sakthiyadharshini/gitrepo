import automobilefactory.Airbus;
import automobilefactory.Bmw;
import automobilefactory.Carfactory;
import automobilefactory.Scooty;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        System.out.println("Please enter your choice which you want to visit like car,bus,bike:");
        Scanner sc=new Scanner(System.in);
        String ch =sc.nextLine();


        switch (ch) {

            case"car": {

                Bmw b1 = new Bmw();
                b1.car_type();
                b1.engine();
                b1.battery();
                b1.price();
                b1.festivaldiscount();
                b1.salesduringtimeperiod();
                break;
            }
            case"bus": {
                Airbus a1 = new Airbus();
                a1.airbus_type();
                a1.battery();
                a1.engine();
                a1.price();
                a1.festivaldiscount();
                a1.salesduringtimeperiod();
                break;
            }
            case"bike":
            {

                Scooty s1 = new Scooty();
                s1.bike_type();
                s1.battery();
                s1.breaks();
                s1.price();
                s1.festivaldiscount();
                s1.salesduringtimeperiod();
                break;
            }
        }
    }
}