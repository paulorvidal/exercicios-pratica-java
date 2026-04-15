import java.util.List;
import model.Profissional;
import service.ProfissionalService;
public class Main {
    public static void main(String[] args) {
        List<Profissional> professionals = ProfissionalService.cadastrarProfissional();

        
     ProfissionalService.listarProfissionals(professionals);
    }

}
