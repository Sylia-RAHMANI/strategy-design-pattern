package Ampl;

import Api.Strategie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PayByCarte implements Strategie {

    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private int amount=1050;
    private Cart cart;



    public int getAmount() {
        return amount;
    }

    public Cart getCart() {
        return cart;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean isPayed(int amount) {
        if (cart.getAmount()>= amount){
            System.out.println("à payer :"+amount);
            cart.setAmount(this.getAmount()-amount);
            System.out.println("il vous rest  " +cart.getAmount()+ " sur la carte");
            return true;
        }
        System.out.println("vous n'avez pas suffisamment de crédit");
        return false;
    }

    @Override
    public void collectPayement() {
        try {
            System.out.println(" inserez votre carte svp");
            System.out.println("saisir le code");
            String number=READER.readLine();
            System.out.println("date d'expiraton");
            String date=READER.readLine();
            System.out.println("entrez cvv");
            String cvv =READER.readLine();
            cart=new Cart(number,date,cvv);
        }catch (IOException ex ){
            ex.printStackTrace();
        }



    }
}
