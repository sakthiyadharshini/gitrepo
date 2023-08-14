package automobilefactory;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Bikefactory implements automobilefeatures {
    int price=50000;
    @Override
    public void breaks()
    {
        System.out.println("Bike break is applied");
    }
    @Override
    public void engine()
    {
        System.out.println("Bike engine");
    }
    @Override
    public void battery()
    {
        System.out.println("Bike battery");
    }
    public void price()
    {
        System.out.println("the price of scooty is:Rs."+price);
    }
    public void festivaldiscount()
    {
        double dis=price-(price*10.0)/100.0;
        System.out.println("price after 10% discount is :Rs."+dis);
    }
    public void salesduringtimeperiod()
    {
        LocalDate currentDate1 = LocalDate.now();
        LocalDate customDate1 = currentDate1.plus(6, ChronoUnit.MONTHS);
        System.out.println("The sales is from: "+currentDate1+" to" +customDate1);
    }

}
