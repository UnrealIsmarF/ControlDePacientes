package Modelos;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

public class ModeloPacientesSegundo {

    Queue<Pacientes> ListaPacientes = new LinkedList();
    
        public void MedicoPacinteSegundo(String Apellido, String Nombre)
        {
            Pacientes nuevoPaciente = new Pacientes(Apellido, Nombre);
            this.ListaPacientes.add(nuevoPaciente);
            JOptionPane.showMessageDialog(null,"Paciente Agregado a la Lista 2");
        }
        
        public Queue ListaPacientes()
        {
            return this.ListaPacientes;
        }
    
}
