
public class Main {

	public static void main(String[] args) 
	{
		Perro p = new Perro("Pluto",ETipoBusqueda.Perdido,8,'M',true,"Color marron con manchas blancas en los pies. Responde a Plutito.");
		p.esRaza(ERazaPerro.Golden);
		
		System.out.println(Perro.ObtenerPerro(p));
	}

}