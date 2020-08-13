
public class Main {

	public static void main(String[] args) 
	{
		Perro p = new Perro("Pluto",ETipoBusqueda.Perdido,8,'M',false,"Color marron con manchas blancas en los pies. Responde a Plutito.");
		p.NoEsRaza(EColorPerro.Marron);
		
		Gato g= new Gato("Thais",4,'H',ETipoBusqueda.Encontrado,false,"Es gordita, cariñosa. Tiene la nariz negra");
		
		g.NoEsRaza(EColorGato.Carey);
		
		Mascota []array =new Mascota[2];
		
		array[0]=g;
		array[1]=p;
		
		for(Mascota m: array)
		{
			System.out.println(m.ObtenerDatos());
		}
		
		
	}

}