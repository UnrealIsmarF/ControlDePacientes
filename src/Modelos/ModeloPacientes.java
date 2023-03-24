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

    }
    
    public Queue ListarPacientes()
    {
        return this.ListaPacientes;
    }
    
    
    public void EliminarPacientes1()
    {
        this.ListaPacientes.poll();
    }
    public void EliminarPacientes2()
            {
            this.ListaPacientes.poll();
            }
}
