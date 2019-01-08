color c1, c2;
int spaceUnit;


void setup() {
  size(1000, 1000);
  background(233);
  c1 = color(219, 43, 48);
  c2 = color(106,204,229);
  noLoop();
}

void draw() {
  gradientBlock(80, 80, 160, 160, c1, c2);
  drawGrid(80, 2);
}

void drawGrid(int spaceUnit, int dotSize) {
  fill(11);
  noStroke();
  for(int i=spaceUnit; i<width; i+=spaceUnit) {
    for(int j=spaceUnit; j<height; j+=spaceUnit) {
      ellipse(i, j, dotSize, dotSize);
    }
  }
}

void gradientBlock(int x, int y, float w, float h, color c1, color c2) {
  noFill();
  for (int i = y; i <= y+h; i++) {
    float inter = map(i, y, y+h, 0, 1);
    color c = lerpColor(c1, c2, inter);
    stroke(c);
    line(x, i, x + w, i);
  }
}