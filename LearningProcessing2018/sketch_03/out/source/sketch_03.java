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

public class sketch_03 extends PApplet {

float r = 0;
float g = 0;
float b = 0;

public void setup() {
  
}

public void draw() {
  background(r, g, b);
  if (mouseX > width/2) {
    r = r+1;
  } else if (mouseX < width/2) {
    r = r-1;
  }
  
  if (mouseY > height/2) {
    g = g+1;
  } else if (mouseY < height/2) {
    g = g-1;
  }
  
  if (mousePressed) {
    g = g+1;
  } else {
    g = g-1;
  }
  
  r = constrain(r, 0, 255);
  g = constrain(g, 0, 255);
  b = constrain(b, 0, 255);
  
}
  public void settings() {  size(600, 600); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_03" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
