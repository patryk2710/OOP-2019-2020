package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet
{	
	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
	{
		colorMode(HSB);
	}

	
	public void keyPressed()
	{

	}	


	// public void draw()
	// {	
	// 	background(255);
		
	// 	stroke(0);
	// 	strokeWeight(2);

	// //Lines going into center
	// 	for(int i = 0; i < 500; i += 20) {
	// 		line(i, 0, 250, 250);
	// 	}
	// 	for(int i = 0; i < 501; i += 20) {
	// 		line(250, 250, 500, i);
	// 	}
	// 	for(int i = 0; i < 500; i += 20) {
	// 		line(i, 500, 250, 250);
	// 	}
	// 	for(int i = 0; i < 500; i += 20) {
	// 		line(250, 250, 0, i);
	// 	}
	// }

	// //10 circles in straight line
	// public void draw() {
	// 	background(165);
	// 	stroke(0);
	// 	fill(255);
	// 	for(int i = 25; i < 501; i += 50) {
	// 		ellipse(i, 250, 50, 50);
	// 	}
	// }

	//Rainbow rectangles with circles
	public void draw() {
		noStroke();
		int x = 0;
		for(int i = 0; i < 501; i += 50) {
			fill(x, 255, 255);
			rect(i, 0, 50, 400);
			x = x + 18;
		}
		x = 0;
		for(int i = 25; i < 501; i += 50) {
			fill(x, 255, 255);
			ellipse(i, 450, 50, 50);
			x = x + 18;
		}
	}

	// //Black square grid
	// public void draw() {
	// 	background(0);
	// 	stroke(0,255,0);
	// 	for(int i = 50; i < 450; i += 50) {
	// 		for(int j = 50; j < 450; j += 50) {
	// 			fill(0);
	// 			rect(j,i, 50, 50);
	// 		}
	// 	}
	// }

	//Rectangles changing size
	// public void draw() {
	// 	background(165);
	// 	stroke(0);
	// 	int w = 110;
	// 	int i = 30;
	// 	int j = 10;
	// 	while(w >= 30) {
	// 		rect( i, j, w, 30);
	// 		w = w - 20;
	// 		i = i + 10;
	// 		j = j + 30;
	// 	}
	// }

	// // Rainbow Circles
	// public void draw() {
	// 	noStroke();
	// 	int c = 0;
	// 	int change;
	// 	for(int i = 25; i < 501; i += 50) {
	// 		change = c;
	// 		for(int j = 25; j < 501; j += 50) {
	// 			fill(c, 255, 255);
	// 			ellipse(j,i,50,50);
	// 			c = c + 9;
	// 		}
	// 		c = change + 9;
	// 	}
	// }

	// //chequered blue squares
	// public void draw() {
	// 	int count = 1;
	// 	noStroke();

	// 	for(int i = 0;i < 501; i += 25) {
	// 		for(int j = 0; j < 501; j += 25) {
	// 			if(count % 2 == 0) {
	// 				fill(0,0,255);
	// 			} else {
	// 				fill(0,128,255);
	// 			}
	// 			rect(j,i,25,25);
	// 			count += 1;
	// 		}
	// 	}
	// }
}
