
public abstract class Mascota 
{
	protected String nombre;
	protected int edad;
	protected char sexo;
	protected ETipoBusqueda tipoBusqueda;
	protected String descripcion;
	

	
	public Mascota(String nombre,int edad,ETipoBusqueda tipoBusqueda,char sexo,String descripcion)
	{
		this.nombre=nombre;
		this.edad=edad;
		this.tipoBusqueda=tipoBusqueda;
		this.sexo=sexo;
		this.descripcion=descripcion;
	}
	
	
	
	
	
	
	

}
