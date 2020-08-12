
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

	public static String ObtenerPerro(Perro p)
	{
		StringBuilder sb=new StringBuilder();
		
		sb.append("Perro "+ p.tipoBusqueda.toString() +"\n");
		sb.append("Nombre: " + p.nombre + " \n");
		sb.append("Edad: " + p.edad + " \n");
		
		if(p.sexo=='H')
		sb.append("Sexo: Hembra\n");
		else if(p.sexo=='M')
		sb.append("Sexo: Macho\n");	
		
		if(p.deRaza)
			sb.append("Raza: " + p.razaPerro.toString() + "\n");
		else
			sb.append("No es de raza\n");
		
		sb.append("Caracteristicas del perro: " + p.descripcion);
		
		return sb.toString();
	}
	
	

	

}
