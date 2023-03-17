package Controladores;

import Modelos.ModelPacientes;
import Modelos.Pacientes;
import Vistas.Medico1;
import Vistas.Medico2;
import Vistas.frmVistaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Queue;


public class ControllerPacientes implements ActionListener {
 
frmVistaPrincipal VistaPacientes;
Medico1 VistaMedico1;
Medico2 VistaMedico2;
ModelPacientes ModeloPacientes;

    public ControllerPacientes(frmVistaPrincipal VistaPrincipal, ModelPacientes ModeloPacientes) {
        this.VistaPacientes = VistaPrincipal;
        this.ModeloPacientes = ModeloPacientes;
        
        //poner escucha botones
        this.VistaPacientes.btnAgregarMedico1.addActionListener(this);
        this.VistaPacientes.btnAgregarMedico2.addActionListener(this);
        this.VistaPacientes.btnListaMedico1.addActionListener(this);
        this.VistaPacientes.btnListaMedico2.addActionListener(this);
        
        //Levantar vista principal
      
        
        this.VistaPacientes.setLocationRelativeTo(null);
        this.VistaPacientes.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.VistaPacientes.btnAgregarMedico1)
     {
        this.ModeloPacientes.MedicoPaciente1(this.VistaPacientes.txtApellidos.getText() ,
            this.VistaPacientes.txtNombres.getText());
         
         //Mostrar Los datos en el text Area
         Queue <Pacientes> ListaLocal = this.ModeloPacientes.MedicoPaciente1(ape, nom);
         
         String Cadena = "";
         
        for(Pacientes MiListaPacientes: ListaLocal)
        {
            Cadena = Cadena + MiListaPacientes.getApellidos()+ " " + MiListaPacientes.getNombres()+ "\n";
            this.VistaPacientes. .setText(Cadena);
            this.VistaLista.txtListaClientes.setText(Cadena);
        }
    }

}
