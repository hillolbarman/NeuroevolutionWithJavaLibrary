

import neuroevolution.*;

public class Execute {
	public static void main(String[] args) {
		Options.update();
		Generation gen=new Generation();
		gen.createGeneration();
		gen=gen.generateNextGeneration();
		
		System.out.println(Options.population);
	}
}
