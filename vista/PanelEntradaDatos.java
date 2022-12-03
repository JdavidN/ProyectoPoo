package vista;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.ColorUIResource;

import static java.awt.Font.BOLD;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;



public class PanelEntradaDatos extends JPanel
{
    
    //Atributos
    private ImageIcon iImagen;
    private JLabel lbImagen;
    private ImageIcon iImagen2;
    private JLabel lbImagen2;
    private JLabel lbNombre;
    private JLabel lbUsuario;
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

        iImagen = new ImageIcon(getClass().getResource("imagenes/Titulo.PNG"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(100,20,400,50);
        add(lbImagen);



    
        // 185, 180, 179
        //Creación y adición de etiquetas
        lbNombre = new JLabel(" Nombre ");
        lbNombre.setFont(new Font("Algerian", BOLD, 22));
        lbNombre.setForeground(Color.BLACK);
        lbNombre.setBounds(0,120,250,30);
        add(lbNombre);

        lbUsuario = new JLabel(" Usuario ");
        lbUsuario.setFont(new Font("Algerian", BOLD, 22));
        lbUsuario.setForeground(Color.BLACK);
        lbUsuario.setBounds(0,140,250,30);
        add(lbUsuario);

        
        
        lbEdad = new JLabel("Edad ");
        lbEdad.setFont(new Font("Algerian", BOLD, 22));
        lbEdad.setForeground(Color.BLACK);
        lbEdad.setBounds(20,190,250,30);
        lbEdad.setBackground(new ColorUIResource(160, 163, 162));
        
        add(lbEdad);
        

        
        //Creación y adición de campos de texto
        tfNombre = new JTextField();
        tfNombre.setBounds(110, 121, 120, 30);
        add(tfNombre);
        
        tfEdad = new JTextField();
        tfEdad.setBounds(110, 190
        , 120, 30);
        add(tfEdad);

        

        iImagen2 = new ImageIcon(getClass().getResource("imagenes/ninos.jpg"));
        lbImagen2 = new JLabel(iImagen2);
        lbImagen2.setBounds(20,0,540,276);
        lbImagen2.setIcon(new ImageIcon(iImagen2.getImage().getScaledInstance(540, 280, Image.SCALE_SMOOTH)));
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