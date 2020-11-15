package Ampl;

import Api.Strategie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PayByPayPal implements Strategie {

    private static final Map<String, String> DATA_BASE = new HashMap<>();
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private String email;
    private String password;
    private boolean signedIn = true;





    @Override
    public void collectPayement() {
        try {
            System.out.println("votre email svp");
            email= READER.readLine();
            System.out.println("votre mot de passe svp");
            password=READER.readLine();
            DATA_BASE.put(email,password);

        }catch (IOException ex){
            ex.printStackTrace();
        }



    }
    @Override
    public boolean isPayed(int amount) {
        if (signedIn) {
            System.out.println("Paying " + amount + " using PayPal.");
            return true;
        } else {
            return false;
        }

    }

    public static Map<String, String> getDataBase() {
        return DATA_BASE;
    }

    public void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }
}
