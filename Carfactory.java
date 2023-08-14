package automobilefactory;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Carfactory implements automobilefeatures {
    int price=10000;
    @Override
    public void breaks()
    {
        System.out.println("car break is applied");
    }
    @Override
    public void engine()
    {
        System.out.println("car engine");
    }
    @Override
    public void battery()
    {
        System.out.println("car battery");
    }
    public void price()
    {
             System.out.println("The price of bmw is :$"+price);
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
