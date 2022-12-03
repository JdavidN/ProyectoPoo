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



public class Electrodomestico extends JDialog
{
 //----------------------
    //Atributos
    //----------------------


    private ImageIcon iImagen;
    private JLabel lbImagen;
    private JComboBox cbTelevisor;
    private JComboBox cbNevera;
    private JComboBox cbLavadora;
    private JComboBox cbMicroondas;
    private JComboBox cbAspiradora;
    private String[] electrodomestico = {"","Lavadora", "Nevera", "Aspiradora", "Microondas", "Televisor"};
    private ImageIcon iImagenElectrodomesticos;
    private JLabel lbImagenElectrodomesticos;
    private JLabel lbElectrodomesticos;
    private ImageIcon iImagenTelevisor;
    private JLabel lbImagenTelevisor;
    private ImageIcon iImagenNevera;
    private JLabel lbImagenNevera;
    private ImageIcon iImagenLavadora;
    private JLabel lbImagenLavadora;
    private ImageIcon iImagenMicroondas;
    private JLabel lbImagenMicroondas;
    private ImageIcon iImagenAspiradora;
    private JLabel lbImagenAspiradora;
    private JButton btAceptar;
    
    //-------------------------
    //Métodos
    //-------------------------
        
    //Metodo constructor
    public Electrodomestico()
    {
        //Definición del contenedor de la ventana
        setLayout(null);
            
      
        iImagen = new ImageIcon(getClass().getResource("imagenes/Titulo.PNG"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(100,20,400,50);
        add(lbImagen);

        iImagenElectrodomesticos = new ImageIcon(getClass().getResource("imagenes/Electrodomesticos.jpg"));
        lbImagenElectrodomesticos = new JLabel(iImagenElectrodomesticos);
        lbImagenElectrodomesticos.setBounds(10,80,270,200);
        lbImagenElectrodomesticos.setIcon(new ImageIcon(iImagenElectrodomesticos.getImage().getScaledInstance(270, 200, Image.SCALE_SMOOTH)));
        add(lbImagenElectrodomesticos);

        lbElectrodomesticos = new JLabel("Electrodomesticos");
        lbElectrodomesticos.setFont(new Font("Algerian", BOLD, 20));
        lbElectrodomesticos.setForeground(Color.WHITE);
        lbElectrodomesticos.setBounds(310,150,280,50);
        lbElectrodomesticos.setBackground(new ColorUIResource(160, 163, 162));  
        add(lbElectrodomesticos);

        iImagenElectrodomesticos = new ImageIcon(getClass().getResource("imagenes/Text.png"));
        lbImagenElectrodomesticos = new JLabel(iImagenElectrodomesticos);
        lbImagenElectrodomesticos.setBounds(290,145,270,60);
        add(lbImagenElectrodomesticos);

        //ComboBox y imangen
        iImagenTelevisor = new ImageIcon(getClass().getResource("imagenes/Televisor.png"));
        lbImagenTelevisor = new JLabel(iImagenTelevisor);
        lbImagenTelevisor.setBounds(20,310,150,150);
        lbImagenTelevisor.setIcon(new ImageIcon(iImagenTelevisor.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
        add(lbImagenTelevisor);
        cbTelevisor = new JComboBox();
        for(int i=0; i<electrodomestico.length;i++)
        {
            cbTelevisor.addItem(electrodomestico[i]);
        }
        cbTelevisor.setBounds(45,470,120,35);
        this.add(cbTelevisor);

        //ComboBox y imangen 2
        iImagenNevera = new ImageIcon(getClass().getResource("imagenes/Nevera.png"));
        lbImagenNevera = new JLabel(iImagenNevera);
        lbImagenNevera.setBounds(205,310,150,150);
        lbImagenNevera.setIcon(new ImageIcon(iImagenNevera.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
        add(lbImagenNevera);

        cbNevera = new JComboBox();
        for(int i=0; i<electrodomestico.length;i++)
        {
            cbNevera.addItem(electrodomestico[i]);
        }
        cbNevera.setBounds(230,470,120,35);
        this.add(cbNevera);


        //ComboBox y imangen 3
        iImagenLavadora = new ImageIcon(getClass().getResource("imagenes/Lavadora.png"));
        lbImagenLavadora = new JLabel(iImagenLavadora);
        lbImagenLavadora.setBounds(390,310,150,150);
        lbImagenLavadora.setIcon(new ImageIcon(iImagenLavadora.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
        add(lbImagenLavadora);

        cbLavadora = new JComboBox();
        for(int i=0; i<electrodomestico.length;i++)
        {
            cbLavadora.addItem(electrodomestico[i]);
        }
        cbLavadora.setBounds(415,470,120,35);
        this.add(cbLavadora);

        //ComboBox y imangen 4
        iImagenMicroondas = new ImageIcon(getClass().getResource("imagenes/microondas.png"));
        lbImagenMicroondas = new JLabel(iImagenMicroondas);
        lbImagenMicroondas.setBounds(85,545,150,150);
        lbImagenMicroondas.setIcon(new ImageIcon(iImagenMicroondas.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
        add(lbImagenMicroondas);

        cbMicroondas = new JComboBox();
        for(int i=0; i<electrodomestico.length;i++)
        {
            cbMicroondas.addItem(electrodomestico[i]);
        }
        cbMicroondas.setBounds(110,705,120,35);
        this.add(cbMicroondas);

        //ComboBox y imangen 5
        iImagenAspiradora = new ImageIcon(getClass().getResource("imagenes/Aspiradora.png"));
        lbImagenAspiradora = new JLabel(iImagenAspiradora);
        lbImagenAspiradora.setBounds(325,545,150,150);
        lbImagenAspiradora.setIcon(new ImageIcon(iImagenAspiradora.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
        add(lbImagenAspiradora);

        cbAspiradora = new JComboBox();
        for(int i=0; i<electrodomestico.length;i++)
        {
            cbAspiradora.addItem(electrodomestico[i]);
        }
        cbAspiradora.setBounds(350,705,120,35);
        this.add(cbAspiradora);

    
            
        // Creación de botón aceptar
        btAceptar = new JButton("Aceptar");
        btAceptar.setFont(new Font("Arial", Font.BOLD, 15));
        btAceptar.setBounds(240,790,100,30);
        btAceptar.setActionCommand("aceptar");
        add(btAceptar);


        iImagen = new ImageIcon(getClass().getResource("imagenes/Engranajes.jpg"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(5,10,580,450);
        lbImagen.setIcon(new ImageIcon(iImagen.getImage().getScaledInstance(580, 450, Image.SCALE_SMOOTH)));
        add(lbImagen);
        iImagen = new ImageIcon(getClass().getResource("imagenes/Engranajes.jpg"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(5,380,580,450);
        lbImagen.setIcon(new ImageIcon(iImagen.getImage().getScaledInstance(580, 450, Image.SCALE_SMOOTH)));
        add(lbImagen);

        //Caracteristicas de la ventana
        setTitle("Electrodomesticos");
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