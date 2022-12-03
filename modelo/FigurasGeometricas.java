package modelo;
public class FigurasGeometricas

{
    private String circulo;
    private String cuadrado;
    private String triangulo;
    private String rectangulo;
    private String rombo;

    public  FigurasGeometricas(String pcirculo, String pcuadrado, String ptriangulo, String prectangulo,String prombo)
    {
        this.rombo= prombo;
        this.triangulo=ptriangulo;
        this.cuadrado=pcuadrado;
        this.rectangulo=prectangulo;
        this.circulo=pcirculo;
    }

    public String getCirculo()
    {
        return circulo;
    }

    public String getCuadrado() 
    {
        return cuadrado;
    }

    public String getRectangulo() 
    {
        return rectangulo;
    }

    public String getRombo() 
    {
        return rombo;
    }
    public String getTriangulo() 
    {
        return triangulo;
    }

    public void setCirculo(String circulo)
    {
        this.circulo = circulo;
    }

    public void setCuadrado(String cuadrado) 
    {
        this.cuadrado = cuadrado;
    }

    public void setRectangulo(String rectangulo) 
    {
        this.rectangulo = rectangulo;
    }

    public void setRombo(String rombo) 
    {
        this.rombo = rombo;
    }
    public void setTriangulo(String triangulo) 
    {
        this.triangulo = triangulo;
    }
}
