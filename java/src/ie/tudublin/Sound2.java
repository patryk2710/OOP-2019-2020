package ie.tudublin;

import processing.core.PApplet;
import ddf.minim.*;
import ddf.minim.analysis.FFT;

public class Sound2 extends PApplet
{	
	Minim minim;
	AudioSample as;

	int frameSize = 1024;

	int sampleRate = 44100;

	FFT fft;

	float frameToSecond = sampleRate / (float) frameSize;

	public void settings()
	{
		size(1024, 500);
	}


	public void setup() 
	{
		minim = new Minim(this);
		as = minim.loadSample("scale.wav", frameSize);
		
		fft = new FFT(frameSize, sampleRate); 

		colorMode(HSB);
	}

<<<<<<< HEAD
	public int countZeroCrossings() {
		int count = 0;
		for (int i = 1; i < as.bufferSize(); i++) 
		{		  
			if (as.left.get(i - 1) > 0 && as.left.get(i) <= 0) 
			{
			  count++;
			}		  
		}
		return count;
	}
=======
	int countZeroCrossings()
	{
		int count = 0;

		for(int i = 1 ; i < as.bufferSize() ; i ++)
		{
			if (as.left.get(i-1) > 0 && as.left.get(i) <= 0)
			{
				count ++;
			}
		}
		return count;
	}

	float lerpedw = 0;
	float average = 0;
>>>>>>> 6af089ddab0d2d9e3233de67fdf24864f9f11eff

	float lerpedw = 0;
	float average = 0;
	public void keyPressed()
	{
		if (key == ' ')
		{
			as.stop();
			as.trigger();
		}

	}

	float offs = 0;
	
	public void circleVisual {
		float circx = width / 2;
		float circy = height / 2;
		int radius = 500;

		for(int i = 0 ; i < as.bufferSize() ; i ++) {
			float theta = map(i, 0, as.bufferSize(), 0, TWO_PI);
			float x = circx + sin(theta) * circx * abs(as.left.get(i));
			float x = circx + sin(theta) * circx * abs(as.left.get(i));
			stroke(
				map(i + offs, 0, as.bufferSize()), 0, 255) % 255
				, 255
				, 255
			);
			line(circx,circy, x, y);
		}
		offs += average * 10f;
	}
	public void draw()
	{	
		background(0);		
		stroke(255);
		float cy = height / 2;
		float sum = 0;
		for(int i = 0 ; i < as.bufferSize() ; i ++)
		{
			stroke(
				map(i, 0, as.bufferSize(), 0, 255)
				, 255
				, 255
			);
			line(i, cy, i, cy + as.left.get(i) * cy);
			sum += abs(as.left.get(i));
		}
		average = sum / as.bufferSize();

		float w  = average * 1000;
		lerpedw = lerp(lerpedw, w, 0.1f);
		noStroke();
		fill(
			map(average, 0, 1, 0, 255)
			, 255
			, 255
		);
<<<<<<< HEAD
		// ellipse(400 , cy,w, w);
		// ellipse(600 , cy,lerpedw, lerpedw);	
=======
		//ellipse(400 , cy,w, w);
		//ellipse(600 , cy,lerpedw, lerpedw);	
>>>>>>> 6af089ddab0d2d9e3233de67fdf24864f9f11eff
		
		int count = countZeroCrossings();

		float freq = count * frameToSecond;
		textSize(22);
		text("Zero crossings frequency: " + freq, 100, 50);

		fft.window(FFT.HAMMING);
		fft.forward(as.left);

		stroke(255);
		int highestBin = 0;
		for(int i = 0 ; i < fft.specSize() ; i ++)
		{
			line(i, 0, i, fft.getBand(i) * 100);
		}

		float freq1 = fft.indexToFreq(highestBin);

		text("FFT Freq: " + freq1, 100, 100);

<<<<<<< HEAD
		circleVisual();
		
=======
>>>>>>> 6af089ddab0d2d9e3233de67fdf24864f9f11eff
	}
}
