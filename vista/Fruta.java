package vista;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import static java.awt.Font.BOLD;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.ColorUIResource;




import java.awt.Color;


import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;



public class Fruta extends JDialog
{
 //----------------------
    //Atributos
    //----------------------


    private ImageIcon iImagen;
    private JLabel lbImagen;
    private JComboBox cbBanano;
    private JComboBox cbManzana;
    private JComboBox cbFresa;
    private JComboBox cbNaranja;
    private JComboBox cbpatilla;
    private String[] frutas = {"","Fresa", "Naranja", "Fresa", "Patilla", "Banano"};
    private ImageIcon iImagenFrutas;
    private JLabel lbImagenFrutas;
    private JLabel lbFrutas;
    private ImageIcon iImagenBanano;
    private JLabel lbImagenBanano;
    private ImageIcon iImagenManzana;
    private JLabel lbImagenManzana;
    private ImageIcon iImagenFresa;
    private JLabel lbImagenFresa;
    private ImageIcon iImagenNaranja;
    private JLabel lbImagenNaranja;
    private ImageIcon iImagenpatilla;
    private JLabel lbImagenpatilla;
    private JButton btAceptar;
    
    //-------------------------
    //Métodos
    //-------------------------
        
    //Metodo constructor
    public Fruta()
    {
        //Definición del contenedor de la ventana
        setLayout(null);
            
      
        iImagen = new ImageIcon(getClass().getResource("imagenes/Titulo.PNG"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(100,20,400,50);
        add(lbImagen);

        iImagenFrutas = new ImageIcon(getClass().getResource("imagenes/Frutascanasta.jpeg"));
        lbImagenFrutas = new JLabel(iImagenFrutas);
        lbImagenFrutas.setBounds(10,80,270,200);
        lbImagenFrutas.setIcon(new ImageIcon(iImagenFrutas.getImage().getScaledInstance(270, 200, Image.SCALE_SMOOTH)));
        add(lbImagenFrutas);

        lbFrutas = new JLabel("Frutas");
        lbFrutas.setFont(new Font("Algerian", BOLD, 50));
        lbFrutas.setForeground(Color.WHITE);
        lbFrutas.setBounds(330,150,250,50);
        lbFrutas.setBackground(new ColorUIResource(160, 163, 162));  
        add(lbFrutas);

        iImagenFrutas = new ImageIcon(getClass().getResource("imagenes/Text.png"));
        lbImagenFrutas = new JLabel(iImagenFrutas);
        lbImagenFrutas.setBounds(290,145,270,60);
        add(lbImagenFrutas);

        //ComboBox y imangen
        iImagenBanano = new ImageIcon(getClass().getResource("imagenes/banano.png"));
        lbImagenBanano = new JLabel(iImagenBanano);
        lbImagenBanano.setBounds(20,310,150,150);
        lbImagenBanano.setIcon(new ImageIcon(iImagenBanano.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
        add(lbImagenBanano);
        cbBanano = new JComboBox();
        for(int i=0; i<frutas.length;i++)
        {
            cbBanano.addItem(frutas[i]);
        }
        cbBanano.setBounds(45,470,120,35);
        this.add(cbBanano);

        //ComboBox y imangen 2
        iImagenManzana = new ImageIcon(getClass().getResource("imagenes/Manzana.png"));
        lbImagenManzana = new JLabel(iImagenManzana);
        lbImagenManzana.setBounds(205,310,150,150);
        lbImagenManzana.setIcon(new ImageIcon(iImagenManzana.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
        add(lbImagenManzana);

        cbManzana = new JComboBox();
        for(int i=0; i<frutas.length;i++)
        {
            cbManzana.addItem(frutas[i]);
        }
        cbManzana.setBounds(230,470,120,35);
        this.add(cbManzana);


        //ComboBox y imangen 3
        iImagenFresa = new ImageIcon(getClass().getResource("imagenes/Fresa.png"));
        lbImagenFresa = new JLabel(iImagenFresa);
        lbImagenFresa.setBounds(390,310,150,150);
        lbImagenFresa.setIcon(new ImageIcon(iImagenFresa.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
        add(lbImagenFresa);

        cbFresa = new JComboBox();
        for(int i=0; i<frutas.length;i++)
        {
            cbFresa.addItem(frutas[i]);
        }
        cbFresa.setBounds(415,470,120,35);
        this.add(cbFresa);

        //ComboBox y imangen 4
        iImagenNaranja = new ImageIcon(getClass().getResource("imagenes/naranja.png"));
        lbImagenNaranja = new JLabel(iImagenNaranja);
        lbImagenNaranja.setBounds(85,545,150,150);
        lbImagenNaranja.setIcon(new ImageIcon(iImagenNaranja.getImage().getScaledInstance(160, 160, Image.SCALE_SMOOTH)));
        add(lbImagenNaranja);

        cbNaranja = new JComboBox();
        for(int i=0; i<frutas.length;i++)
        {
            cbNaranja.addItem(frutas[i]);
        }
        cbNaranja.setBounds(110,705,120,35);
        this.add(cbNaranja);

        //ComboBox y imangen 5
        iImagenpatilla = new ImageIcon(getClass().getResource("imagenes/patilla.png"));
        lbImagenpatilla = new JLabel(iImagenpatilla);
        lbImagenpatilla.setBounds(325,545,150,150);
        lbImagenpatilla.setIcon(new ImageIcon(iImagenpatilla.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
        add(lbImagenpatilla);

        cbpatilla = new JComboBox();
        for(int i=0; i<frutas.length;i++)
        {
            cbpatilla.addItem(frutas[i]);
        }
        cbpatilla.setBounds(350,705,120,35);
        this.add(cbpatilla);

    
            
        // Creación de botón aceptar
        btAceptar = new JButton("Aceptar");
        btAceptar.setFont(new Font("Arial", Font.BOLD, 15));
        btAceptar.setBounds(240,790,100,30);
        btAceptar.setActionCommand("aceptar");
        add(btAceptar);


        iImagen = new ImageIcon(getClass().getResource("imagenes/cosecha.jpg"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(5,10,580,860);
        lbImagen.setIcon(new ImageIcon(iImagen.getImage().getScaledInstance(580, 830, Image.SCALE_SMOOTH)));
        add(lbImagen);
        

        //Caracteristicas de la ventana
        setTitle("Frutas");
        setSize(610,880);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

 
        
    public void agregarOyentesBotones(ActionListener pAL)
    {
        btAceptar.addActionListener(pAL);
    }
        
    public void cerrarDialogo()
    {
        this.dispose();
    }    
}