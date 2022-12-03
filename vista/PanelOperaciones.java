package vista;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import static java.awt.Font.BOLD;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class PanelOperaciones extends JPanel
{
    //----------------------
    //Atributos
    //----------------------
    public ImageIcon img;
    public JLabel labImagen2;
    public JButton btAnimales;
    public JButton btElectrodomesticos;
    public JButton btFrutas;
    public JButton btParejas;
    public JButton btFiguraGeometrica;
    public JButton btSalir;
    public JButton btRegistro;
    
    //----------------------
    //Metodos
    //----------------------
    
    //Constructor
    public PanelOperaciones()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);



        //Creación y adicion de los botones

        btRegistro = new JButton("Registro");
        btRegistro.setFont(new Font("Algerian", BOLD, 12));
        btRegistro.setBounds(20, 20, 140, 30);
        this.add(btRegistro);
        btRegistro.setActionCommand("Registrar");

        btAnimales = new JButton("Animales");
        btAnimales.setFont(new Font("Algerian", BOLD, 12));
        btAnimales.setBounds(30, 80, 140, 30);
        add(btAnimales);
        btAnimales.setActionCommand("Animal");

        btElectrodomesticos = new JButton("Electrodomesticos");
        btElectrodomesticos.setFont(new Font("Algerian", BOLD, 12));
        btElectrodomesticos.setBounds(80, 170, 180, 30);
        add(btElectrodomesticos);
        btElectrodomesticos.setActionCommand("Electrodomestico");


        //Crear y agrear boton Borrar
        btFrutas = new JButton("Frutas");
        btFrutas.setFont(new Font("Algerian", BOLD, 12));
        btFrutas.setBounds(210, 80, 140, 30);
        this.add(btFrutas);
        btFrutas.setActionCommand("Fruta");

        //Crear y agrear boton Borrar
        btFiguraGeometrica = new JButton("Figura Geometrica");
        btFiguraGeometrica.setFont(new Font("Algerian", BOLD, 12));
        btFiguraGeometrica.setBounds(300, 170, 180, 30);
        this.add(btFiguraGeometrica);
        btFiguraGeometrica.setActionCommand("Figura");


         //Crear y agrear boton Borrar
         btParejas = new JButton("Parejas");
         btParejas.setFont(new Font("Algerian", BOLD, 12));
         btParejas.setBounds(390, 80, 140, 30);
         this.add(btParejas);
         btParejas.setActionCommand("Pareja");

        //Crear y agrear boton Salir
        btSalir = new JButton("Salir");
        btSalir.setFont(new Font("Algerian", BOLD, 12));
        btSalir.setBounds(210, 280, 140, 30);
        this.add(btSalir);
        btSalir.setActionCommand("salir");
        
        //Borde y titulo del panel
       

        img = new ImageIcon(getClass().getResource("imagenes/mod.jpg"));
        labImagen2 = new JLabel(img);
        labImagen2.setBounds(0,0,600,600);
        labImagen2.setIcon(new ImageIcon(img.getImage().getScaledInstance(600, 600, Image.SCALE_SMOOTH)));
        add(labImagen2);
    }

    public void agregarOyentesBotones(ActionListener pAL)
    {
        btAnimales.addActionListener(pAL);
        btElectrodomesticos.addActionListener(pAL);
        btFrutas.addActionListener(pAL);
        btParejas.addActionListener(pAL);
        btFiguraGeometrica.addActionListener(pAL);
        btSalir.addActionListener(pAL);
    }
    
    public void activarBotones()
    {
        btAnimales.setEnabled(true);
        btElectrodomesticos.setEnabled(true);
        btFrutas.setEnabled(true);
        btParejas.setEnabled(true);
        btFiguraGeometrica.setEnabled(true);
        btSalir.setEnabled(true);
    }
    
}