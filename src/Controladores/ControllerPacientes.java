package Controladores;

import Modelos.ModeloPacientes;
import Modelos.ModeloPacientesSegundo;
import Modelos.Pacientes;
import Vistas.Medico1;
import Vistas.Medico2;
import Vistas.frmVistaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Queue;
import javax.swing.JOptionPane;


public class ControllerPacientes implements ActionListener {
 
frmVistaPrincipal VistaPacientes;
Medico1 VistaMedico1;
Medico2 VistaMedico2;
ModeloPacientes ModeloPacientes;
ModeloPacientesSegundo ModeloPacientesSegundo;

    public ControllerPacientes(frmVistaPrincipal VistaPacientes, Medico1 VistaMedico1, Medico2 VistaMedico2, ModeloPacientes ModeloPacientes, ModeloPacientesSegundo ModeloPacientesSegundo) {
        this.VistaPacientes = VistaPacientes;
        this.VistaMedico1 = VistaMedico1;
        this.VistaMedico2 = VistaMedico2;
        this.ModeloPacientes = ModeloPacientes;
        this.ModeloPacientesSegundo = ModeloPacientesSegundo;
    
        //poner escucha botones
        this.VistaPacientes.btnAgregarMedico1.addActionListener(this);
        this.VistaPacientes.btnAgregarMedico2.addActionListener(this);
        this.VistaPacientes.btnListaMedico1.addActionListener(this);
        this.VistaPacientes.btnListaMedico2.addActionListener(this);
        this.VistaMedico1.btnAtenderPaciente.addActionListener(this);
        this.VistaMedico2.btnAtenderPaciente.addActionListener(this);
        
        //Levantar vista principal
        this.VistaPacientes.setLocationRelativeTo(null);
        this.VistaPacientes.setVisible(true);
    }
        

    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource() == this.VistaPacientes.btnAgregarMedico1)
    {
        this.ModeloPacientes.MedicoPacientesPrimero(this.VistaPacientes.txtApellidos.getText() ,
            this.VistaPacientes.txtNombres.getText());
         
         //Mostrar Los datos en el text Area
         Queue<Pacientes> listaLocal = this.ModeloPacientes.ListarPacientes();
                 JOptionPane.showMessageDialog(null, "Paciente Agregado a la lista 1");
        String cadena = " ";
        for(Pacientes ModeloPacientes: listaLocal)
        {
            cadena = cadena + ModeloPacientes.getApellido()+ " " + ModeloPacientes.getNombre()+ "\n";
            this.VistaMedico1.txtListaMedico1.setText(cadena);
        }
        this.VistaPacientes.txtApellidos.setText(" ");
        this.VistaPacientes.txtNombres.setText(" ");
    }
        if(e.getSource() == this.VistaMedico1.btnAtenderPaciente)
    {
        this.ModeloPacientes.EliminarPacientes1();
        this.ModeloPacientes.MedicoPacientesPrimero(this.VistaPacientes.txtApellidos.getText() ,
            this.VistaPacientes.txtNombres.getText());
         
         //Mostrar Los datos en el text Area
         Queue<Pacientes> listaLocal = this.ModeloPacientes.ListarPacientes();
         
        String cadena = " ";
        for(Pacientes ModeloPacientes: listaLocal)
        {
            cadena = cadena + ModeloPacientes.getApellido()+ " " + ModeloPacientes.getNombre()+ "\n";
        }
           this.VistaMedico1.txtListaMedico1.setText(cadena);
        
    }
        if(e.getSource() == this.VistaMedico2.btnAtenderPaciente)
    {
        this.ModeloPacientes.EliminarPacientes2();
        this.ModeloPacientesSegundo.MedicoPacinteSegundo(this.VistaPacientes.txtApellidos.getText() ,
            this.VistaPacientes.txtNombres.getText());
         
         //Mostrar Los datos en el text Area
         Queue<Pacientes> listaLocal = this.ModeloPacientes.ListarPacientes();
         
        String cadena = " ";
        for(Pacientes ModeloPacientes: listaLocal)
        {
            cadena = cadena + ModeloPacientes.getApellido()+ " " + ModeloPacientes.getNombre()+ "\n";
        }
           this.VistaMedico2.txtListaMedico2.setText(cadena);
        
    }
    if(e.getSource() == this.VistaPacientes.btnAgregarMedico2)
    {
        this.ModeloPacientesSegundo.MedicoPacinteSegundo(this.VistaPacientes.txtApellidos.getText(),
                this.VistaPacientes.txtNombres.getText());
        
        Queue<Pacientes> ListaLocal = this.ModeloPacientesSegundo.ListaPacientes();
        
        String cadena = " ";
        for(Pacientes ModeloPacientes: ListaLocal)
        {
            cadena = cadena + ModeloPacientes.getApellido()+" "+ ModeloPacientes.getNombre()+"\n";
            this.VistaMedico2.txtListaMedico2.setText(cadena);
        }
        this.VistaPacientes.txtApellidos.setText(" ");
        this.VistaPacientes.txtNombres.setText(" ");
    }
    if(e.getSource() == this.VistaPacientes.btnListaMedico1)
    {
        this.VistaMedico1.setLocationRelativeTo(null);
        this.VistaMedico1.setVisible(true);
    }
    if(e.getSource() == this.VistaPacientes.btnListaMedico2)
    {
        this.VistaMedico2.setLocationRelativeTo(null);
        this.VistaMedico2.setVisible(true);
    }
    
    
    }
    
}
