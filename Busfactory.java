package automobilefactory;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Busfactory implements automobilefeatures{
    int price=20000;
    @Override
    public void breaks()
    {
        System.out.println("Bus break is applied");
    }
    @Override
    public void engine()
    {
        System.out.println("Bus engine");
    }
    @Override
    public void battery()
    {
        System.out.println("Bus battery");
    }
    public void price()
    {
        System.out.println("the price Airbus is : $"+price);
    }
    public void festivaldiscount()
    {
        double dis=price-(price*10.0)/100.0;
        System.out.println("price after 10% discount is :$"+dis);
    }
    public void salesduringtimeperiod()
    {
        LocalDate currentDate1 = LocalDate.now();
        LocalDate customDate1 = currentDate1.plus(6, ChronoUnit.MONTHS);
        System.out.println("The sales is from: "+currentDate1+" to" +customDate1);
    }
}
