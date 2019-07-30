
public class TestCompartment {

	public static void main(String[] args) {
		Compartment comp[] = new Compartment[10];
		double randomDouble = Math.random();
		randomDouble = randomDouble * 4 + 1;
		int randomInt = (int) randomDouble;
		if(randomInt == 1) {
			comp[randomInt] = new FirstClass();	
		}
		else if(randomInt == 2) {
			comp[randomInt] = new General();
		}
		else if(randomInt == 3) {
			comp[randomInt] = new Ladies();
		}
		else {
			comp[randomInt] = new Luggage();
		}
		System.out.print("Notice is :-" + comp[randomInt].notice());
	}

}
