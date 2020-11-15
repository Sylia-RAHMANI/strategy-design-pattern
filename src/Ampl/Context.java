package Ampl;

import Api.Strategie;

import java.io.IOException;

public class Context implements Strategie{
    private Strategie strategie;

    public void setStrategie(Strategie strategie) {
        this.strategie = strategie;
    }

    public Strategie getStrategie() {
        return strategie;
    }

    @Override
    public boolean isPayed(int amount) {
        return strategie.isPayed(amount);
    }

    @Override
    public void collectPayement() throws IOException {
        strategie.collectPayement();

    }
}
