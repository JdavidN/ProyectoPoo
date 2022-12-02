package vista;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.ColorUIResource;

import static java.awt.Font.BOLD;
import java.awt.Font;


import java.awt.Color;



public class PanelEntradaDatos extends JPanel
{
    
    //Atributos
    private ImageIcon iImagen;
    private JLabel lbImagen;
    private ImageIcon iImagen2;
    private JLabel lbImagen2;
    private JLabel lbNombre;
    private JLabel lbEdad;
  
    private JTextField tfNombre;
    private JTextField tfEdad;

    
    //------------------------
    //Metodos
    //------------------------
    
    //Constructor
    public PanelEntradaDatos()
    {
        //Definicion del contendor del panel
        setLayout(null);
        //setBackground(new Color(185, 180, 179));
        
        //Creación y adicion de la imagen

      

        iImagen = new ImageIcon(getClass().getResource(""));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(310,75,250,276);
        add(lbImagen);

        iImagen = new ImageIcon(getClass().getResource("Titulo.PNG"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(100,20,400,50);
        add(lbImagen);



    
        // 185, 180, 179
        //Creación y adición de etiquetas
        lbNombre = new JLabel("Nombre Usuario: ");
        lbNombre.setFont(new Font("", BOLD, 22));
        lbNombre.setForeground(Color.BLACK);
        lbNombre.setBounds(0,160,250,30);
        add(lbNombre);
        
        
        lbEdad = new JLabel("Edad Usuario: ");
        lbEdad.setFont(new Font("Arial", BOLD, 22));
        lbEdad.setForeground(Color.BLACK);
        lbEdad.setBounds(0,220,250,30);
        lbEdad.setBackground(new ColorUIResource(160, 163, 162));
        
        add(lbEdad);
        

        
        //Creación y adición de campos de texto
        tfNombre = new JTextField();
        tfNombre.setBounds(190, 160, 120, 30);
        add(tfNombre);
        
        tfEdad = new JTextField();
        tfEdad.setBounds(170, 220, 120, 30);
        add(tfEdad);

        

        iImagen2 = new ImageIcon(getClass().getResource("ninos.jpg"));
        lbImagen2 = new JLabel(iImagen2);
        lbImagen2.setBounds(20,20,540,276);
        add(lbImagen2);
  
    }
    
    //Metodos de acceso a la información de las cajas de texto
    public String getNomLib()
    {
        return (String) tfNombre.getText();
    }

    public String getNomAutor()
    {
        return (String) tfEdad.getText();
    }





    //Metodo para borrar cajas de texto
    public void borrar()
    {
        tfNombre.setText("");
        tfEdad.setText("");

    }

}