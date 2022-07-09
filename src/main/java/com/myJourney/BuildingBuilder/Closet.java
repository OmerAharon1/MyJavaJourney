package com.myJourney.BuildingBuilder;

import java.util.Random;

public class Closet extends Furniture{

private int depth;

Random r1 = new Random();

public Closet() {
	setDepth(depth);
}

public int getDepth() {
	return depth;
}

public void setDepth(int depth) {
	depth=r1.nextInt(15)+10;
		try {
			validatedAmount(depth, 10);
	} catch (Exception e) {
		e.printStackTrace();
	}
	this.depth = depth;
}
@Override
public String toString() {
	return "Closet [depth=" + depth + "]";
}

}
