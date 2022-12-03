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



public class Animal extends JDialog
{
 //----------------------
    //Atributos
    //----------------------


    private ImageIcon iImagen;
    private JLabel lbImagen;
    private JComboBox cbElefante;
    private JComboBox cbTigre;
    private JComboBox cbKoala;
    private JComboBox cbAguila;
    private JComboBox cbLoro;
    private String[] animales = {"","Aguila", "Elefante", "Koala", "Tigre", "Loro"};
    private ImageIcon iImagenAnimales;
    private JLabel lbImagenAnimales;
    private JLabel lbanimal;
    private ImageIcon iImagenElefante;
    private JLabel lbImagenElefante;
    private ImageIcon iImagenTigre;
    private JLabel lbImagenTigre;
    private ImageIcon iImagenKoala;
    private JLabel lbImagenKoala;
    private ImageIcon iImagenAguila;
    private JLabel lbImagenAguila;
    private ImageIcon iImagenLoro;
    private JLabel lbImagenLoro;
    private JButton btAceptar;
    
    //-------------------------
    //Métodos
    //-------------------------
        
    //Metodo constructor
    public Animal()
    {
        //Definición del contenedor de la ventana
        setLayout(null);
            
      
        iImagen = new ImageIcon(getClass().getResource("imagenes/Titulo.PNG"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(100,20,400,50);
        add(lbImagen);


        iImagenAnimales = new ImageIcon(getClass().getResource("imagenes/leon.jpg"));
        lbImagenAnimales = new JLabel(iImagenAnimales);
        lbImagenAnimales.setBounds(10,80,270,200);
        lbImagenAnimales.setIcon(new ImageIcon(iImagenAnimales.getImage().getScaledInstance(270, 200, Image.SCALE_SMOOTH)));
        add(lbImagenAnimales);

        lbanimal = new JLabel("Animales");
        lbanimal.setFont(new Font("Algerian", BOLD, 48));
        lbanimal.setForeground(Color.WHITE);
        lbanimal.setBounds(310,150,260,50);
        lbanimal.setBackground(new ColorUIResource(160, 163, 162));  
        add(lbanimal);

        iImagenAnimales = new ImageIcon(getClass().getResource("imagenes/Text.png"));
        lbImagenAnimales = new JLabel(iImagenAnimales);
        lbImagenAnimales.setBounds(290,145,280,60);
        add(lbImagenAnimales);

        //ComboBox y imangen
        iImagenElefante = new ImageIcon(getClass().getResource("imagenes/Elefante.jpg"));
        lbImagenElefante = new JLabel(iImagenElefante);
        lbImagenElefante.setBounds(20,310,150,150);
        lbImagenElefante.setIcon(new ImageIcon(iImagenElefante.getImage().getScaledInstance(170, 170, Image.SCALE_SMOOTH)));
        add(lbImagenElefante);
        cbElefante = new JComboBox();
        for(int i=0; i<animales.length;i++)
        {
            cbElefante.addItem(animales[i]);
        }
        cbElefante.setBounds(45,470,120,35);
        this.add(cbElefante);

        //ComboBox y imangen 2
        iImagenTigre = new ImageIcon(getClass().getResource("imagenes/Tigre.jpg"));
        lbImagenTigre = new JLabel(iImagenTigre);
        lbImagenTigre.setBounds(205,310,150,150);
        lbImagenTigre.setIcon(new ImageIcon(iImagenTigre.getImage().getScaledInstance(170, 170, Image.SCALE_SMOOTH)));
        add(lbImagenTigre);

        cbTigre = new JComboBox();
        for(int i=0; i<animales.length;i++)
        {
            cbTigre.addItem(animales[i]);
        }
        cbTigre.setBounds(230,470,120,35);
        this.add(cbTigre);


        //ComboBox y imangen 3
        iImagenKoala = new ImageIcon(getClass().getResource("imagenes/Koala.jpeg"));
        lbImagenKoala = new JLabel(iImagenKoala);
        lbImagenKoala.setBounds(390,310,150,150);
        lbImagenKoala.setIcon(new ImageIcon(iImagenKoala.getImage().getScaledInstance(170, 170, Image.SCALE_SMOOTH)));
        add(lbImagenKoala);

        cbKoala = new JComboBox();
        for(int i=0; i<animales.length;i++)
        {
            cbKoala.addItem(animales[i]);
        }
        cbKoala.setBounds(415,470,120,35);
        this.add(cbKoala);

        //ComboBox y imangen 4
        iImagenAguila = new ImageIcon(getClass().getResource("imagenes/Aguila.jpg"));
        lbImagenAguila = new JLabel(iImagenAguila);
        lbImagenAguila.setBounds(85,545,150,150);
        lbImagenAguila.setIcon(new ImageIcon(iImagenAguila.getImage().getScaledInstance(170, 170, Image.SCALE_SMOOTH)));
        add(lbImagenAguila);

        cbAguila = new JComboBox();
        for(int i=0; i<animales.length;i++)
        {
            cbAguila.addItem(animales[i]);
        }
        cbAguila.setBounds(110,705,120,35);
        this.add(cbAguila);

        //ComboBox y imangen 5
        iImagenLoro = new ImageIcon(getClass().getResource("imagenes/Loro.jpg"));
        lbImagenLoro = new JLabel(iImagenLoro);
        lbImagenLoro.setBounds(325,545,150,150);
        lbImagenLoro.setIcon(new ImageIcon(iImagenLoro.getImage().getScaledInstance(170, 170, Image.SCALE_SMOOTH)));
        add(lbImagenLoro);

        cbLoro = new JComboBox();
        for(int i=0; i<animales.length;i++)
        {
            cbLoro.addItem(animales[i]);
        }
        cbLoro.setBounds(350,705,120,35);
        this.add(cbLoro);

    
            
        // Creación de botón aceptar
        btAceptar = new JButton("Aceptar");
        btAceptar.setFont(new Font("Arial", Font.BOLD, 15));
        btAceptar.setBounds(240,790,100,30);
        btAceptar.setActionCommand("aceptar");
        add(btAceptar);


        iImagen = new ImageIcon(getClass().getResource("imagenes/Fondoani.jpg"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(0,0,610,900);
        lbImagen.setIcon(new ImageIcon(iImagen.getImage().getScaledInstance(610, 900, Image.SCALE_SMOOTH)));
        add(lbImagen);
       

        //Caracteristicas de la ventana
        setTitle("Animales");
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