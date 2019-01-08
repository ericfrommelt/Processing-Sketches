import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class block_with_random_dots2 extends PApplet {

public void setup() {
  
  
  background(255);
  // noLoop();
  frameRate(2);
}

public void draw() {
  for(int i=10; i<width; i+=90) {
    for (int j=10; j<height; j+=90) {
      block(i, j, 80, 80);
      // rotate(PI/2);
      dots(i, j);
    }
  }
}

public void block(float x, float y, float w, float h) {
  int gray = color(112, 112, 112);
  int brown = color(117, 63, 0);
  int green = color(52, 105, 55);
  int blue = color(0, 49, 82);
  int tan = color(255, 195, 78);
  int[] colors = {gray, brown, green, blue, tan};
  float colorNumber = random(colors.length);
  int randomColor = PApplet.parseInt(colorNumber);
  
  noStroke();
  fill(colors[randomColor]);
  rect(x, y, w, h);
}

public void dots(float x, float y) {
  // Draw the dots in the block
  int dotSize = 6;
  float rand = random(4);
  int randint = PApplet.parseInt(rand);

  fill(255);

  if (randint == 0) {
    ellipse(x+30, y+30, dotSize, dotSize);
  } else if (randint == 1) {
    ellipse(x+30, y+30, dotSize, dotSize);
    ellipse(x+50, y+30, dotSize, dotSize);
  } else if (randint == 2) {
    ellipse(x+30, y+30, dotSize, dotSize);
    ellipse(x+50, y+30, dotSize, dotSize);
    ellipse(x+30, y+50, dotSize, dotSize);
  } else if (randint == 3) {
    ellipse(x+30, y+30, dotSize, dotSize);
    ellipse(x+50, y+30, dotSize, dotSize);
    ellipse(x+30, y+50, dotSize, dotSize);
    ellipse(x+50, y+50, dotSize, dotSize);
  }
}
  public void settings() {  size(1000, 730);  pixelDensity(2); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "block_with_random_dots2" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
