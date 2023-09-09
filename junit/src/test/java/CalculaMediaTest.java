import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.hdlg9la.CalculaMedia;

public class CalculaMediaTest {
         

         @Test
         void calculaMediaDeDois(){

                  CalculaMedia c = new CalculaMedia();

                  c.calculaMediaDeDois(5, 13);

                  Assertions.assertEquals(15,  c.calculaMediaDeDois(15, 16));

         }
}
