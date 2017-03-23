package job;

public class GestionEpreuveImpl implements GestionEpreuve{
		
		private static GestionEpreuve INSTANCE = null;
		
		public static GestionEpreuve getInstance()
		{			
			if (INSTANCE == null)
			{ 	INSTANCE = new GestionEpreuveImpl();	
			}
			return INSTANCE;
		}

}
