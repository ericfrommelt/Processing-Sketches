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

public class sketch_02 extends PApplet {

int circleX = 0;
int circleY = 100;
int circleSize = 20;
int r = PApplet.parseInt(random(1, 255));

public void setup() {
  
  
  frameRate(30);
}

public void draw() {
  background(255);
  noStroke();
  fill(r);
  translate(mouseX, mouseY);
  ellipse(width/2, height/2, circleSize, circleSize);

  println(r);
}
  public void settings() {  size(600, 600);  pixelDensity(2); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_02" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
