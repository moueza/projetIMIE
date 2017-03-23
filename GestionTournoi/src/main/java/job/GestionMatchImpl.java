package job;

public class GestionMatchImpl implements GestionMatch{

	private static GestionMatch INSTANCE = null;
	
	public static GestionMatch getInstance()
	{			
		if (INSTANCE == null)
		{ 	INSTANCE = new GestionMatchImpl();	
		}
		return INSTANCE;
	}
}
