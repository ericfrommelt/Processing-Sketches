void setup() {
  noLoop();
  size(600, 600);
  pixelDensity(2);
}

void draw() {
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

void drawSquiggle(int x1, int y1, int x2, int y2) {
  // Generate a random number that sets the number of random numbers that will be generated
  int setnum = int(random(1,20));
  println("setnum: " + setnum);
  // Generate random numbers based on the set number
  noFill();
  beginShape();
    for (int i=0; i<10; i++) {
      int numA = int(random(x1, y1));
      int numB = int(random(x2, y2));
      vertex(numA, numB);
      // println("numA: " + numA);
      // println("numB: " + numB);
    }
  endShape();
}