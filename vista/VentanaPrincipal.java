package vista;

import javax.swing.JFrame;



public class VentanaPrincipal extends JFrame
{
    //----------------------
    //Atributos
    //----------------------
  
    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public Animal miAnimal;
    public Figura miFigura;
    public Fruta miFruta;
    public Pareja miPareja;
    public Electrodomestico miElectrodomestico;
 


    //-------------------------
    //Métodos
    //-------------------------
    
    //Metodo constructor
    public VentanaPrincipal()
    {
        //Definición del contenedor de la ventana
        setLayout(null);   
        
       

        //Creación y adición del PanelEntradaDatos
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(5,0,590,280);
        add(miPanelEntradaDatos);
       
        
        //Creación y adición del PanelOperaciones
        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10,290,560,440);
        add(miPanelOperaciones);
        

        //Caracteristicas de la ventana
        setTitle("MIND FIGURE");
        setSize(600,750);
        //setLocation(10,10);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        
    
    }

    public void crearVentanaAnimal()
    {
        miAnimal = new Animal();
    }

    public void crearVentanaFigura()
    {
        miFigura = new Figura();
    }

    public void crearVentanaFruta()
    {
        miFruta = new Fruta();
    }

    public void crearVentanaElectrodomestico()
    {
        miElectrodomestico = new Electrodomestico();
    }

    public void crearVentanaPareja()
    {
        miPareja = new Pareja();
    }

}

