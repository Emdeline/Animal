
public class AnimalDriver
	{

		public static void main(String[] args)
			{
				// TODO Auto-generated method stub
				Animal [] Zoo = new Animal[1];
					Zoo[0] = new Bat();
					
				for(Animal a : Zoo)
					{
						a.bearYoung();
						a.makeNoise();
						a.eat();
						
						System.out.println();
					}
					
			}

	}
