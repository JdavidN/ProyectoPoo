package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Usuario;
import vista.VentanaPrincipal;

public class Controlador implements ActionListener
{
    //Atributos
    //----------------------------
    private VentanaPrincipal venPrin;
    private Usuario model;
  
    
    
    //----------------------------
    //Metodos
    //----------------------------
    
    //Constructor
    public Controlador(VentanaPrincipal venPrin, Usuario model)
    
    {
        this.model = model;
        this.venPrin = venPrin;
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        //Identificar el comendo generado (calcular, borrar, salir)
        String comando = ae.getActionCommand();
        
    

   

        if(comando.equals("Animal"))
        {   
            venPrin.crearVentanaAnimal();
            this.venPrin.miAnimal.agregarOyentesBotones(this);
        }

        if(comando.equals("Pareja"))
        {   
            venPrin.crearVentanaPareja();
            this.venPrin.miPareja.agregarOyentesBotones(this);
        }

        if(comando.equals("Electrodomestico"))
        {   
            venPrin.crearVentanaElectrodomestico();
            this.venPrin.miElectrodomestico.agregarOyentesBotones(this);
        }

        if(comando.equals("Figura"))
        {   
            venPrin.crearVentanaFigura();
            this.venPrin.miFigura.agregarOyentesBotones(this);
        }

        if(comando.equals("Fruta"))
        {   
            venPrin.crearVentanaFruta();
            this.venPrin.miFruta.agregarOyentesBotones(this);
        }

        if(comando.equals("Registrar"))
        {
             
                String nomUsuario = venPrin.miPanelEntradaDatos.getNomUsu();
                int edadUsuario = Integer.parseInt(venPrin.miPanelEntradaDatos.getEdadUsuario());

                model = new Usuario(nomUsuario, edadUsuario);
                JOptionPane.showMessageDialog(null, "Bienbenido " + nomUsuario + " a MIND-FIGURE ", "Felicidades", JOptionPane.ERROR_MESSAGE);
                venPrin.miPanelOperaciones.activarBotones();
                
            
            
        }


    

        if(comando.equals("salir"))
        {
            System.exit(0);
        }
    }
}