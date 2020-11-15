package App;

import Ampl.Context;
import Ampl.PayByCarte;
import Ampl.PayByPayPal;

import java.io.IOException;

public class App {
    public static void main(String[] args) {

        Context context=new Context();
        context.setStrategie(new PayByCarte());
        try {
            context.collectPayement();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(context.getStrategie());
        context.isPayed(500);


        Context context1 =new Context();
        System.out.println("ffghjjbcgfgh");
        context1.setStrategie(new PayByPayPal());
        System.out.println(context1.getStrategie());
        try {
            context1.collectPayement();
        } catch (IOException e) {
            e.printStackTrace();
        }
        context1.isPayed(656);


    }
}
