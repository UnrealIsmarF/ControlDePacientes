package Modelos;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

public class ModeloPacientes {

    Queue<Pacientes> ListaPacientes = new LinkedList();
    
    public void MedicoPacientesPrimero(String Apellido, String Nombre)
    {
        Pacientes newPaciente = new Pacientes(Apellido, Nombre);
        this.ListaPacientes.add(newPaciente);
        JOptionPane.showMessageDialog(null, "Paciente Agregado a la lista 1");
    }
    
    public Queue ListarPacientes()
    {
        return this.ListaPacientes;
    }
    
}
