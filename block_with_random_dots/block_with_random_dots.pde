void setup() {
  size(1000, 730);
  background(255); 
  noLoop();
}

void draw() {
  for(int i=10; i<width; i+=90) {
    for (int j=10; j<height; j+=90) {
    block(i, j, 80, 80);
    }
  }
}

void block(float x, float y, float w, float h) {
  noStroke();
  fill(0);
  rect(x, y, w, h);
  
  float rand = random(4);
  int randint = int(rand);
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
