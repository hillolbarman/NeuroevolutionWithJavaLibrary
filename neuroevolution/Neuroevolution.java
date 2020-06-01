package neuroevolution;

import java.io.File;
import java.util.ArrayList;


public abstract class Neuroevolution {
	Generation currentGeneration;
	ArrayList<Generation> gens=new ArrayList<Generation>();
	int noOfGen=0;
	int maxScore=0;
	int lastMax=0;
//	Bird maxBird;
	File file;
	Genome ge;
	public void assignBrains(Generation gen) {
//		birds=new ArrayList<Bird>();
//		  for(int i=0;i<Options.population;i++) {
//			  Bird b=new Bird();
//			  b.index=i;
//			  b.brain=gen.genomes.get(i).network;
//			  birds.add(b);
//		  }
	}

	public void nextGeneration() {
//		noOfGen++;
//		if(currentGeneration==null) {
//			currentGeneration=new Generation();
//			currentGeneration.createGeneration();	
//			assignBrains(currentGeneration);
//		} else {
//			currentGeneration=currentGeneration.generateNextGeneration();
//			assignBrains(currentGeneration);
//		}
//		if(maxBird!=null) {
//			maxBird.brain.writeToFile(file);
//		}
	}

	public void updateScore() {
//		for(int i=0;i<birds.size();i++) {
//			Bird b=birds.get(i);
//			currentGeneration.genomes.get(b.index).score=(double)b.max;
//		}
	}

	public void keyPressed() {
//		if(key==32) {
//			noLoop();
//			updateScore();
//			nextGeneration();
//			System.exit(0);
//		}
	}
	
	//In Object
	void think() {
//	void think(ArrayList<Pipe> pipes) {
//		  
//		  if(pipes.size()>0) {
//		  Pipe closest=null;
//		  double closestD=Double.MAX_VALUE;
//		  for(int i=0;i<pipes.size();i++) {
//			  double d=pipes.get(i).x-this.pos.x+pipes.get(i).w;
//			  if(d<closestD && d>0) {
//				  closest=pipes.get(i);
//				  closestD=d;
//			  }
//		  }
//		  
//		  double inputs[]=new double[6];
//		  inputs[0]=this.pos.y/height;
//		  inputs[1]=closest.top/height;
//		  inputs[2]=closest.bottom/height;
//		  inputs[3]=closest.x/width;
//		  inputs[4]=(height-this.pos.y)/height;
//		  inputs[5]=((closest.bottom-closest.top)/2)/height;
//		  double[] output=this.brain.compute(inputs);
//		  if(output[0]>0.5) {
//			  this.applyForce(new PVector(0, -5));
//		  }
//		  }
	  }
	
	//In Draw
//	if(b.score>maxScore) {
//		  maxScore=b.score;
//		  maxBird=b;
//		  b.col=true;
//	  }
//}
//text(birds.size(), 10, 25);
//text(noOfGen, 10, 75);
//text(maxScore, 10, 100);
//
//
//updateScore();
//for(Bird b:toRemove)	birds.remove(b);
//if(birds.size()==0 || maxScore>lastMax*2 || (birds.size()==1) && birds.get(0).score>=lastMax) {
//	  lastMax=maxScore;
//	  pipes.removeAll(pipes);
//	  nextGeneration();

}
