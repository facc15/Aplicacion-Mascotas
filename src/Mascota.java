
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
	
	public String ObtenerDatos()
	{
		StringBuilder sb=new StringBuilder();
		
		sb.append(this.tipoBusqueda.toString());
		sb.append("\nNombre: " + this.nombre);
		sb.append("\nEdad: " + this.edad);
		if(this.sexo=='M' || this.sexo=='m')
			sb.append("\nSexo: Macho");
		else
			sb.append("\nSexo: Hembra");
		
		sb.append("\nCaracteristicas: " + this.descripcion);
		
		return sb.toString();
	}
	
	
	
	
	
	
	

}
