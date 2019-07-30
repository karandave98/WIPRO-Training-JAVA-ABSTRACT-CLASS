
public class TestInstrument {

	public static void main(String[] args) {
		Instrument inst[] = new Instrument[10];
		for(int i =1;i<10;i++ ) {
			if(i==1 || i==5 || i==9) {
				inst[i] = new Piano();
			}
			else if(i==3 || i==7 || i==6){
				inst[i]=new Flute();
			} 
			else if(i==2 || i==4 ||i == 8){
				inst[i]=new Guitar();
			}
			else {		
			}
			inst[i].play();
			if(inst[i] instanceof Piano) {
				System.out.println("InstanceOf Piano"); 
			}
			else if(inst[i] instanceof Flute) {
				System.out.println("InstanceOf Flute");
			}
			else {
				System.out.println("InstanceOf Guitar"); 
			}
			System.out.println(); 
			
		}
	}

}
