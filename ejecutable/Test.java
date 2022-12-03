package ejecutable;

import controlador.Controlador;
import vista.VentanaPrincipal;
import modelo.Usuario;

public class Test
{
    public static void main (String[] args)
    {
        VentanaPrincipal venPrin = new VentanaPrincipal();

        Usuario model = new Usuario("", 0);
        Controlador miControlador = new Controlador(venPrin, model);

     
        
      
        
    }
}
