
public class Gato extends Mascota
{
	private Boolean deRaza;
	private ERazaGato razaGato;
	private EColorGato color;
	
	public Gato(String nombre, int edad,char sexo,ETipoBusqueda busqueda,Boolean deRaza,String descripcion)
	{
		super(nombre,edad,busqueda,sexo,descripcion);
		this.deRaza=deRaza;
	}
	
	public void NoEsRaza(EColorGato c)
	{
		this.color=c;
	}
	
	public void esRaza(ERazaGato r)
	{
		this.razaGato=r;
	}
	
	public String ObtenerDatos()
	{
		StringBuilder sb=new StringBuilder();
		
		sb.append("Gato ");
		sb.append(super.ObtenerDatos());
		
		if(this.deRaza)
			sb.append("\nRaza: " + this.razaGato.toString() + "\n");
		else
			sb.append("\nColor: " + this.color.toString() + "\n");	
		
		return sb.toString();
	}

}
