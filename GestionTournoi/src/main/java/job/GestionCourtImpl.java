package job;

public class GestionCourtImpl implements GestionCourt{
	
	private static GestionCourt INSTANCE = null;
	
	public static GestionCourt getInstance()
	{			
		if (INSTANCE == null)
		{ 	INSTANCE = new GestionCourtImpl();	
		}
		return INSTANCE;
	}

}
