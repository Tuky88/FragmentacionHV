
package entity;


public class consultarProductoEntity 
{
    private int idProducto;
    private String Nombre;
    private int NumeroDeUnidades;
    private double PrecioUnitario;
    private String FechaDeIngreso;
    private int idProveedor;
    
    public consultarProductoEntity()  //constructor
    {
        this(0, "", 0, 0.0, "", 0);
    }

    public consultarProductoEntity(int idProducto, String Nombre, int NumeroDeUnidades, double PrecioUnitario, String FechaDeIngreso, int idProveedor)   //constructor
    {
        this.idProducto = idProducto;
        this.Nombre = Nombre;
        this.NumeroDeUnidades = NumeroDeUnidades;
        this.PrecioUnitario = PrecioUnitario;
        this.FechaDeIngreso = FechaDeIngreso;
        this.idProveedor = idProveedor;
    }
    
    public consultarProductoEntity(consultarProductoEntity cPE)
    {
        this.idProducto = cPE.idProducto;
        this.Nombre = cPE.Nombre;
        this.NumeroDeUnidades = cPE.NumeroDeUnidades;
        this.PrecioUnitario = cPE.PrecioUnitario;
        this.FechaDeIngreso = cPE.FechaDeIngreso;
        this.idProveedor = cPE.idProveedor;
    }

    public int getIdProducto() 
    {
        return idProducto;
    }

    public void setIdProducto(int idProducto) 
    {
        this.idProducto = idProducto;
    }

    public String getNombre() 
    {
        return Nombre;
    }

    public void setNombre(String Nombre) 
    {
        this.Nombre = Nombre;
    }

    public int getNumeroDeUnidades() 
    {
        return NumeroDeUnidades;
    }

    public void setNumeroDeUnidades(int NumeroDeUnidades) 
    {
        this.NumeroDeUnidades = NumeroDeUnidades;
    }

    public double getPrecioUnitario() 
    {
        return PrecioUnitario;
    }

    public void setPrecioUnitario(double PrecioUnitario) 
    {
        this.PrecioUnitario = PrecioUnitario;
    }

    public String getFechaDeIngreso() 
    {
        return FechaDeIngreso;
    }

    public void setFechaDeIngreso(String FechaDeIngreso) 
    {
        this.FechaDeIngreso = FechaDeIngreso;
    }

    public int getIdProveedor() 
    {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) 
    {
        this.idProveedor = idProveedor;
    }

    @Override
    public String toString() {
        return "consultarProductoEntity{" + "idProducto: " + idProducto + "\n" + 
                " Nombre=" + Nombre + "\n" + 
                " NumeroDeUnidades=" + NumeroDeUnidades + "\n" +
                " PrecioUnitario=" + PrecioUnitario + "\n" +
                " FechaDeIngreso=" + FechaDeIngreso + "\n" +
                " idProveedor=" + idProveedor ;
    }
}
