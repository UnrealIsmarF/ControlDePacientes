
import Controladores.ControllerPacientes;
import Modelos.ModeloPacientes;
import Modelos.ModeloPacientesSegundo;
import Vistas.Medico1;
import Vistas.Medico2;
import Vistas.frmVistaPrincipal;

public class main {

    public static void main(String[] args) {
        frmVistaPrincipal VistaPacientes = new frmVistaPrincipal(null, true);
        Medico1 VistaMedico1 = new Medico1(null, true);
        Medico2 VistaMedico2 = new Medico2(null, true);
        
        ModeloPacientes ModeloVistas = new ModeloPacientes();
        ModeloPacientesSegundo ModeloSegundoVistas = new ModeloPacientesSegundo();
        
        ControllerPacientes ControladorLista = new ControllerPacientes(VistaPacientes, VistaMedico1, VistaMedico2,
        ModeloVistas, ModeloSegundoVistas);
    }
    
}
