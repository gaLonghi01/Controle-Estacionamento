package classes;
import exceptions.DadosVeiculosIncompletosException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VeiculoTest {
    
    @Test
    public void VeiculoValido() throws DadosVeiculosIncompletosException {
        Veiculo veiculo = new Veiculo();
        veiculo.setMarca("Honda");
        veiculo.setModelo("Civic");
        veiculo.setNumeroPlaca("abc1234");

        assertEquals("Honda", veiculo.getMarca());
        assertEquals("Civic", veiculo.getModelo());
        assertEquals("abc1234", veiculo.getNumeroPlaca());
    }

    @Test
    public void naoChegaMarca() {
        Veiculo veiculo = new Veiculo();
        assertThrows(DadosVeiculosIncompletosException.class, () -> {
            veiculo.setMarca("");
        });
    }
}
