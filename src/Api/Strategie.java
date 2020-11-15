package Api;

import java.io.IOException;

public interface Strategie {
   boolean isPayed(int amount);
   void collectPayement() throws IOException;
}
