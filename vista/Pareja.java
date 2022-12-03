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



public class Pareja extends JDialog
{
 //----------------------
    //Atributos
    //----------------------


    private ImageIcon iImagen;
    private JLabel lbImagen;
    private JComboBox cbTenedor;
    private JComboBox cbRueda;
    private JComboBox cbEstrella;
    private JComboBox cbLlave;
    private JComboBox cbTeclado;
    private String[] parejas = {"","Circulo", "Candado", "Cuchara", "Mouse", "luna"};
    private ImageIcon iImagenParejas;
    private JLabel lbImagenParejas;
    private JLabel lbParejas;
    private ImageIcon iImagenTenedor;
    private JLabel lbImagenTenedor;
    private ImageIcon iImagenRueda;
    private JLabel lbImagenRueda;
    private ImageIcon iImagenEstrella;
    private JLabel lbImagenEstrella;
    private ImageIcon iImagenLlave;
    private JLabel lbImagenLlave;
    private ImageIcon iImagenTeclado;
    private JLabel lbImagenTeclado;
    private JLabel lbInfo;
    private JButton btAceptar;
    
    //-------------------------
    //Métodos
    //-------------------------
        
    //Metodo constructor
    public Pareja()
    {
        //Definición del contenedor de la ventana
        setLayout(null);
            
        
        iImagen = new ImageIcon(getClass().getResource("imagenes/Titulo.PNG"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(100,20,400,50);
        add(lbImagen);

        iImagenParejas = new ImageIcon(getClass().getResource("imagenes/armar.jpg"));
        lbImagenParejas = new JLabel(iImagenParejas);
        lbImagenParejas.setBounds(10,80,270,200);
        lbImagenParejas.setIcon(new ImageIcon(iImagenParejas.getImage().getScaledInstance(270, 200, Image.SCALE_SMOOTH)));
        add(lbImagenParejas);

        lbParejas = new JLabel("Parejas");
        lbParejas.setFont(new Font("Algerian", BOLD, 50));
        lbParejas.setForeground(Color.WHITE);
        lbParejas.setBounds(315,115,250,50);
        lbParejas.setBackground(new ColorUIResource(160, 163, 162));  
        add(lbParejas);

        lbInfo = new JLabel("Relaciona la imagen con ");
        lbInfo.setFont(new Font("Algerian", BOLD, 15));
        lbInfo.setForeground(Color.WHITE);
        lbInfo.setBounds(310,175,270,50);
        lbInfo.setBackground(new ColorUIResource(160, 163, 162));  
        add(lbInfo);
        lbInfo = new JLabel(" los objetos en la lista");
        lbInfo.setFont(new Font("Algerian", BOLD, 15));
        lbInfo.setForeground(Color.WHITE);
        lbInfo.setBounds(312,200,250,50);
        lbInfo.setBackground(new ColorUIResource(160, 163, 162));  
        add(lbInfo);

        iImagenParejas = new ImageIcon(getClass().getResource("imagenes/Text.png"));
        lbImagenParejas = new JLabel(iImagenParejas);
        lbImagenParejas.setBounds(295,110,270,60);
        add(lbImagenParejas);

        iImagenParejas = new ImageIcon(getClass().getResource("imagenes/Text.png"));
        lbImagenParejas = new JLabel(iImagenParejas);
        lbImagenParejas.setBounds(285,180,270,60);
        add(lbImagenParejas);

        //ComboBox y imangen
        iImagenTenedor = new ImageIcon(getClass().getResource("imagenes/tenedor.png"));
        lbImagenTenedor = new JLabel(iImagenTenedor);
        lbImagenTenedor.setBounds(20,310,150,150);
        lbImagenTenedor.setIcon(new ImageIcon(iImagenTenedor.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
        add(lbImagenTenedor);
        cbTenedor = new JComboBox();
        for(int i=0; i<parejas.length;i++)
        {
            cbTenedor.addItem(parejas[i]);
        }
        cbTenedor.setBounds(45,470,120,35);
        this.add(cbTenedor);

        //ComboBox y imangen 2
        iImagenRueda = new ImageIcon(getClass().getResource("imagenes/rueda.png"));
        lbImagenRueda = new JLabel(iImagenRueda);
        lbImagenRueda.setBounds(205,310,150,150);
        lbImagenRueda.setIcon(new ImageIcon(iImagenRueda.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
        add(lbImagenRueda);

        cbRueda = new JComboBox();
        for(int i=0; i<parejas.length;i++)
        {
            cbRueda.addItem(parejas[i]);
        }
        cbRueda.setBounds(230,470,120,35);
        cbRueda.setFont(new Font("Algerian", BOLD, 20));
        this.add(cbRueda);


        //ComboBox y imangen 3
        iImagenEstrella = new ImageIcon(getClass().getResource("imagenes/universo.jpg"));
        lbImagenEstrella = new JLabel(iImagenEstrella);
        lbImagenEstrella.setBounds(390,310,150,150);
        lbImagenEstrella.setIcon(new ImageIcon(iImagenEstrella.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
        add(lbImagenEstrella);

        cbEstrella = new JComboBox();
        for(int i=0; i<parejas.length;i++)
        {
            cbEstrella.addItem(parejas[i]);
        }
        cbEstrella.setBounds(415,470,120,35);
        this.add(cbEstrella);

        //ComboBox y imangen 4
        iImagenLlave = new ImageIcon(getClass().getResource("imagenes/llave.png"));
        lbImagenLlave = new JLabel(iImagenLlave);
        lbImagenLlave.setBounds(85,545,150,150);
        lbImagenLlave.setIcon(new ImageIcon(iImagenLlave.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
        add(lbImagenLlave);

        cbLlave = new JComboBox();
        for(int i=0; i<parejas.length;i++)
        {
            cbLlave.addItem(parejas[i]);
        }
        cbLlave.setBounds(110,705,120,35);
        this.add(cbLlave);

        //ComboBox y imangen 5
        iImagenTeclado = new ImageIcon(getClass().getResource("imagenes/Teclado.png"));
        lbImagenTeclado = new JLabel(iImagenTeclado);
        lbImagenTeclado.setBounds(325,545,150,150);
        lbImagenTeclado.setIcon(new ImageIcon(iImagenTeclado.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
        add(lbImagenTeclado);

        cbTeclado = new JComboBox();
        for(int i=0; i<parejas.length;i++)
        {
            cbTeclado.addItem(parejas[i]);
        }
        cbTeclado.setBounds(350,705,120,35);
        this.add(cbTeclado);

    
            
        // Creación de botón aceptar
        btAceptar = new JButton("Aceptar");
        btAceptar.setFont(new Font("Arial", Font.BOLD, 15));
        btAceptar.setBounds(240,790,100,30);
        btAceptar.setActionCommand("aceptar");
        add(btAceptar);


        iImagen = new ImageIcon(getClass().getResource("imagenes/Figura.jpg"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(5,10,580,450);
        add(lbImagen);
        iImagen = new ImageIcon(getClass().getResource("imagenes/Figura.jpg"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(5,380,580,450);
        add(lbImagen);

        //Caracteristicas de la ventana
        setTitle("Parejas");
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