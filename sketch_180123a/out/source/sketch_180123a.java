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

public class sketch_180123a extends PApplet {

public void setup() {
  
  
  background(41, 41, 41);
  noLoop();
}

public void draw() {
 block(width/2, height/2, 100, 100);
}

public void block(float blockX, float blockY, float blockW, float blockH) {
  int teal = color(43, 191, 189);
  int teal2 = color(63, 184, 175);
  int teal3 = color(127, 199, 175);
  int tan = color(218, 216, 167);
  int orange1 = color(242, 179, 61);
  int orange2 = color(242, 155, 42);
  int pink1 = color(255, 158, 157);
  int pink2 = color(255, 61, 127);
  int red = color(242, 46, 46);

  int[] colors = {teal, teal2, teal3, tan, orange1, orange2, pink1, pink2, red};
  float colorNumber = random(colors.length);
  int randomColor = PApplet.parseInt(colorNumber);

  noStroke();
  fill(colors[randomColor]);
  rect(blockX, blockY, blockW, blockH);
}
  public void settings() {  size(1000, 1000);  pixelDensity(2); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_180123a" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
