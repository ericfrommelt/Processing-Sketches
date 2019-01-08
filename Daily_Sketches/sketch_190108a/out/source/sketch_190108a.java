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

public class sketch_190108a extends PApplet {

int c1, c2, c3;
int spaceUnit;
int [] units = {80, 160, 240, 320, 400, 480, 560, 640, 720, 800, 880, 960};


public void setup() {
  
  background(233);
  c1 = color(219, 43, 48);
  c2 = color(106, 204, 229);
  c3 = color(0, 0, 0);
  noLoop();
}

public void draw() {
  gradientBlock(80, 80, 160, 160, c1, c2);
  gradientBlock(240, 240, 80, 80, c1, c2);
  gradientBlock(320, 0, 320, 320, c1, c2);
  gradientBlock(720, 640, 240, 240, c1, c2);
  drawGrid(80, 2);
  drawRandomGrid(2, 24, 48, c3);

}

public void drawRandomGrid(int sizeA, int sizeB, int numOfPoints, int pointColor) {
  int setnum = units.length - 1;
  fill(pointColor);
  for (int i=0; i<numOfPoints; i++) {
    int num = units[PApplet.parseInt(random(setnum))];
    int num2 = units[PApplet.parseInt(random(setnum))];
    int num3 = PApplet.parseInt(random(sizeA, sizeB));
    rect(num, num2, num3, num3);
  }
}

public void drawGrid(int spaceUnit, int dotSize) {
  fill(11);
  noStroke();
  for(int i=spaceUnit; i<width; i+=spaceUnit) {
    for(int j=spaceUnit; j<height; j+=spaceUnit) {
      ellipse(i, j, dotSize, dotSize);
    }
  }
}

public void gradientBlock(int x, int y, float w, float h, int c1, int c2) {
  noFill();
  for (int i = y; i <= y+h; i++) {
    float inter = map(i, y, y+h, 0, 1);
    int c = lerpColor(c1, c2, inter);
    stroke(c);
    line(x, i, x + w, i);
  }
}
  public void settings() {  size(1000, 1000); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_190108a" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
