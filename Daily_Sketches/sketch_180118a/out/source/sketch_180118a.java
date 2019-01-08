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

public class sketch_180118a extends PApplet {

public void setup() {
  noLoop();
  
  
}

public void draw() {
// drawSquiggle(0, 100, 0, 100);
// drawSquiggle(100, 200, 0, 100);
// drawSquiggle(200, 300, 0, 100);
// drawSquiggle(300, 400, 0, 100);
// drawSquiggle(400, 500, 0, 100);
// drawSquiggle(500, 600, 0, 100);

// drawSquiggle(0, 100, 100, 200);
// drawSquiggle(100, 200, 100, 200);
// drawSquiggle(200, 300, 100, 200);
// drawSquiggle(300, 400, 100, 200);
// drawSquiggle(400, 500, 100, 200);
// drawSquiggle(500, 600, 100, 200);

for(int i=0; i<width; i+=100) {
  for(int j=0; j<height; j+=100) {
    drawSquiggle(i, i+100, 0, 100);
  }
  println(i);
}




}

public void drawSquiggle(int x1, int y1, int x2, int y2) {
  // Generate a random number that sets the number of random numbers that will be generated
  int setnum = PApplet.parseInt(random(1,20));
  println("setnum: " + setnum);
  // Generate random numbers based on the set number
  noFill();
  beginShape();
    for (int i=0; i<10; i++) {
      int numA = PApplet.parseInt(random(x1, y1));
      int numB = PApplet.parseInt(random(x2, y2));
      vertex(numA, numB);
      // println("numA: " + numA);
      // println("numB: " + numB);
    }
  endShape();
}
  public void settings() {  size(600, 600);  pixelDensity(2); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_180118a" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
