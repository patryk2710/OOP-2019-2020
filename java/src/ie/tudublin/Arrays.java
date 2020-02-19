package ie.tudublin;

import processing.core.PApplet;

public class Arrays extends PApplet
{	
	//float[] rainFall = new float[12];
	float[] rainFall = {45, 37, 55, 27, 38, 50, 79, 48, 104, 31, 100, 58};
	String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec" };




	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
	{
		for(int i = 0; i < rainFall.length; i++) {
			println(months[i] + "\t" + rainFall[i]);
		}	

		// for(float f:rainFall) {
		// 	println(f);
		// }

		// for(String s:months) {
		// 	println(s);
		// }
		
		float maximum = rainFall[0];
		float minimum = rainFall[0];
		int maxindex = 0;
		int minindex = 0;

		for(int i = 0; i < rainFall.length; i++) {
			if(rainFall[i] < minimum) {
				minimum = rainFall[i];
				minindex = i;
			}
			if(rainFall[i] > maximum) {
				maximum = rainFall[i];
				maxindex = i;
			}
		}
		println("Max rainfall is " + months[maxindex]);
		println("Min rainfall is " + months[minindex]);
	}

	

	float offset = 0;

	void drawBarChart() {
		
	}
	
	public void keyPressed()
	{
		if (key == ' ')
		{
			
		}
	}	


	public void draw()
	{	
		background(0);		
		colorMode(HSB);
		noStroke();
		float w = width / (float)rainFall.length;	
		int y = 0;
		int colour = 0;
		for(int i = 0; i < rainFall.length; i++) {
			fill(colour,255,255);
			float x = i * w; 
			rect(x, 500, 40, -rainFall[i]);
			x += 40;
			colour += 16;
		}
	}
}
