package modelo;

public class Usuario 
{
    
    private String nomUsuario;
    private int edadUsuario;

    public Usuario(String pNomUsuario, int pEdadUsuario)
    {
        this.nomUsuario= pNomUsuario;
        this.edadUsuario = pEdadUsuario;
    }

    public int getEdadUsuario() 
    {
        return edadUsuario;
    }

    public String getNomUsuario() 
    {
        return nomUsuario;
    }

    public void setEdadUsuario(int edadUsuario) 
    {
        this.edadUsuario = edadUsuario;
    }

    public void setNomUsuario(String nomUsuario) 
    {
        this.nomUsuario = nomUsuario;
    }

    public String toString()
    {
        return "Hola " + nomUsuario + "bienvenido a MIND-FIGURE";
    }
}
