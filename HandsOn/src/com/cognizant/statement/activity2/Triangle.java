package com.cognizant.statement.activity2;

public class Triangle {
	int sides;
	public float calculateArea()
	{
		return (float) (0.433 * sides  * sides );	
	}
	public void setSides(int sides) {
		this.sides = sides;
	}
}
