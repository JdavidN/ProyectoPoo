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
    private JComboBox cbCirculo;
    private JComboBox cbCuadrado;
    private JComboBox cbRectangulo;
    private JComboBox cbTriangulo;
    private JComboBox cbRombo;
    private String[] figuras = {"","Circulo", "Cuadrado", "Triangulo", "Rectangulo", "Rombo"};
    private ImageIcon iImagenFiguras;
    private JLabel lbImagenFiguras;
    private JLabel lbFigura;
    private ImageIcon iImagenCirculo;
    private JLabel lbImagenCirculo;
    private ImageIcon iImagenCuadrado;
    private JLabel lbImagenCuadrado;
    private ImageIcon iImagenRectangulo;
    private JLabel lbImagenRectangulo;
    private ImageIcon iImagenTriangulo;
    private JLabel lbImagenTriangulo;
    private ImageIcon iImagenRombo;
    private JLabel lbImagenRombo;
    private JButton btAceptar;
    
    //-------------------------
    //Métodos
    //-------------------------
        
    //Metodo constructor
    public Electrodomestico()
    {
        //Definición del contenedor de la ventana
        setLayout(null);
            
      
        iImagen = new ImageIcon(getClass().getResource("Titulo.PNG"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(100,20,400,50);
        add(lbImagen);

        iImagenFiguras = new ImageIcon(getClass().getResource("objects-icon.png"));
        lbImagenFiguras = new JLabel(iImagenFiguras);
        lbImagenFiguras.setBounds(10,80,256,256);
        add(lbImagenFiguras);

        lbFigura = new JLabel("Figuras");
        lbFigura.setFont(new Font("Algerian", BOLD, 50));
        lbFigura.setForeground(Color.WHITE);
        lbFigura.setBounds(310,150,260,50);
        lbFigura.setBackground(new ColorUIResource(160, 163, 162));  
        add(lbFigura);

        iImagenFiguras = new ImageIcon(getClass().getResource("Text.png"));
        lbImagenFiguras = new JLabel(iImagenFiguras);
        lbImagenFiguras.setBounds(290,145,270,60);
        add(lbImagenFiguras);

        //ComboBox y imangen
        iImagenCirculo = new ImageIcon(getClass().getResource("objects-icon.png"));
        lbImagenCirculo = new JLabel(iImagenCirculo);
        lbImagenCirculo.setBounds(20,310,150,150);
        lbImagenCirculo.setIcon(new ImageIcon(iImagenCirculo.getImage().getScaledInstance(170, 170, Image.SCALE_SMOOTH)));
        add(lbImagenCirculo);
        cbCirculo = new JComboBox();
        for(int i=0; i<figuras.length;i++)
        {
            cbCirculo.addItem(figuras[i]);
        }
        cbCirculo.setBounds(45,470,120,35);
        this.add(cbCirculo);

        //ComboBox y imangen 2
        iImagenCuadrado = new ImageIcon(getClass().getResource("objects-icon.png"));
        lbImagenCuadrado = new JLabel(iImagenCuadrado);
        lbImagenCuadrado.setBounds(205,310,150,150);
        lbImagenCuadrado.setIcon(new ImageIcon(iImagenCuadrado.getImage().getScaledInstance(170, 170, Image.SCALE_SMOOTH)));
        add(lbImagenCuadrado);

        cbCuadrado = new JComboBox();
        for(int i=0; i<figuras.length;i++)
        {
            cbCuadrado.addItem(figuras[i]);
        }
        cbCuadrado.setBounds(230,470,120,35);
        this.add(cbCuadrado);


        //ComboBox y imangen 3
        iImagenRectangulo = new ImageIcon(getClass().getResource("objects-icon.png"));
        lbImagenRectangulo = new JLabel(iImagenRectangulo);
        lbImagenRectangulo.setBounds(390,310,150,150);
        lbImagenRectangulo.setIcon(new ImageIcon(iImagenRectangulo.getImage().getScaledInstance(170, 170, Image.SCALE_SMOOTH)));
        add(lbImagenRectangulo);

        cbRectangulo = new JComboBox();
        for(int i=0; i<figuras.length;i++)
        {
            cbRectangulo.addItem(figuras[i]);
        }
        cbRectangulo.setBounds(415,470,120,35);
        this.add(cbRectangulo);

        //ComboBox y imangen 4
        iImagenTriangulo = new ImageIcon(getClass().getResource("objects-icon.png"));
        lbImagenTriangulo = new JLabel(iImagenTriangulo);
        lbImagenTriangulo.setBounds(85,545,150,150);
        lbImagenTriangulo.setIcon(new ImageIcon(iImagenTriangulo.getImage().getScaledInstance(170, 170, Image.SCALE_SMOOTH)));
        add(lbImagenTriangulo);

        cbTriangulo = new JComboBox();
        for(int i=0; i<figuras.length;i++)
        {
            cbTriangulo.addItem(figuras[i]);
        }
        cbTriangulo.setBounds(110,705,120,35);
        this.add(cbTriangulo);

        //ComboBox y imangen 5
        iImagenRombo = new ImageIcon(getClass().getResource("objects-icon.png"));
        lbImagenRombo = new JLabel(iImagenRombo);
        lbImagenRombo.setBounds(325,545,150,150);
        lbImagenRombo.setIcon(new ImageIcon(iImagenRombo.getImage().getScaledInstance(170, 170, Image.SCALE_SMOOTH)));
        add(lbImagenRombo);

        cbRombo = new JComboBox();
        for(int i=0; i<figuras.length;i++)
        {
            cbRombo.addItem(figuras[i]);
        }
        cbRombo.setBounds(350,705,120,35);
        this.add(cbRombo);

    
            
        // Creación de botón aceptar
        btAceptar = new JButton("Aceptar");
        btAceptar.setFont(new Font("Arial", Font.BOLD, 15));
        btAceptar.setBounds(240,790,100,30);
        btAceptar.setActionCommand("aceptar");
        add(btAceptar);


        iImagen = new ImageIcon(getClass().getResource("Figura.jpg"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(5,10,580,450);
        add(lbImagen);
        iImagen = new ImageIcon(getClass().getResource("Figura.jpg"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(5,380,580,450);
        add(lbImagen);

        //Caracteristicas de la ventana
        setTitle("Figuras Geometricas");
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