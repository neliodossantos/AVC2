import org.junit.Test;
import static org.junit.Assert.*;

public class TesteNoitesArabes {

    @Test
    public void testeLampadaMagica() {
        LampadaMagica lampada = new LampadaMagica(4);
        assertTrue(lampada.esfregar(2)); // Espera-se um génio amigável
        assertTrue(lampada.esfregar(3)); // Espera-se um génio mal-humorado
        assertTrue(lampada.esfregar(4)); // Espera-se um génio amigável
        assertTrue(lampada.esfregar(5)); // Espera-se um génio mal-humorado
        assertFalse(lampada.esfregar(1)); // Espera-se um demónio reciclável
    }

    @Test
    public void testeGenioAmigavel() {
        GenioAmigavel genio = new GenioAmigavel(2);
        assertTrue(genio.concederDesejo());
        assertTrue(genio.concederDesejo());
        assertFalse(genio.concederDesejo());
    }

    @Test
    public void testeGenioMalHumorado() {
        GenioMalHumorado genio = new GenioMalHumorado();
        assertTrue(genio.concederDesejo());
        assertFalse(genio.concederDesejo());
    }

    @Test
    public void testeDemonioReciclavel() {
        DemonioReciclavel demonio = new DemonioReciclavel();
        assertTrue(demonio.concederDesejo());
        assertFalse(demonio.foiReciclado());
        assertTrue(demonio.reciclar());
        assertTrue(demonio.foiReciclado());
        assertFalse(demonio.concederDesejo());
    }
}
