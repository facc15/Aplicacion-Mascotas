
public class Perro extends Mascota
{
	private Boolean deRaza;
	private ERazaPerro razaPerro;
	
	public Perro(String nombre, ETipoBusqueda busqueda,int edad, char sexo, boolean raza, String descripcion) {
		super(nombre,edad,busqueda,sexo,descripcion);
		this.deRaza=raza;
	}

	public void esRaza(ERazaPerro r)
	{
		this.razaPerro=r;
	}

	public String ObtenerDatos()
	{
		StringBuilder sb=new StringBuilder();
		
		sb.append("Perro ");
		sb.append(super.ObtenerDatos());
		
		if(this.deRaza)
			sb.append("\nRaza: " + this.razaPerro.toString() + "\n");
		else
			sb.append("\nNo es de raza\n");
		
		
		return sb.toString();
	}
	
	

	

}
