
public abstract class Animal
	{
		// always use protected in a inheritance instance, other use private 
		protected String name;
		protected String food;
		
		public abstract void bearYoung();
		public abstract void makeNoise();
		public void eat()
			{
				System.out.println("The " + name + " is looking forward to eating " + food + ".");
			}
	}
