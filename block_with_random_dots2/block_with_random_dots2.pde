void setup() {
  size(1000, 730);
  pixelDensity(2);
  background(255);
  // noLoop();
  frameRate(2);
}

void draw() {
  for(int i=10; i<width; i+=90) {
    for (int j=10; j<height; j+=90) {
      block(i, j, 80, 80);
      // rotate(PI/2);
      dots(i, j);
    }
  }
}

void block(float x, float y, float w, float h) {
  color gray = color(112, 112, 112);
  color brown = color(117, 63, 0);
  color green = color(52, 105, 55);
  color blue = color(0, 49, 82);
  color tan = color(255, 195, 78);
  int[] colors = {gray, brown, green, blue, tan};
  float colorNumber = random(colors.length);
  int randomColor = int(colorNumber);
  
  noStroke();
  fill(colors[randomColor]);
  rect(x, y, w, h);
}

void dots(float x, float y) {
  // Draw the dots in the block
  int dotSize = 6;
  float rand = random(4);
  int randint = int(rand);

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