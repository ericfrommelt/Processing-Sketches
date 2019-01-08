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

public class block_with_random_dots extends PApplet {

public void setup() {
  size(1000, 730);
  background(255);
  noLoop();
}

public void draw() {
  for(int i=10; i<width; i+=90) {
    for (int j=10; j<height; j+=90) {
    block(i, j, 80, 80);
    }
  }
}

public void block(float x, float y, float w, float h) {
  noStroke();
  fill(0);
  rect(x, y, w, h);

  float rand = random(4);
  int randint = PApplet.parseInt(rand);
  int dotSize = 5;
  println(randint);

  fill(255);

  if (randint == 0) {
    ellipse(x+30, y+30, dotSize, dotSize);
  } else if (randint == 1) {
    fill(250, 0, 0);
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
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "block_with_random_dots" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
