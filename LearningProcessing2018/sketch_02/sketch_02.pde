int circleX = 0;
int circleY = 100;
int circleSize = 20;
int r = int(random(1, 255));

void setup() {
  size(600, 600);
  pixelDensity(2);
  frameRate(30);
}

void draw() {
  background(255);
  noStroke();
  fill(r);
  translate(mouseX, mouseY);
  ellipse(width/2, height/2, circleSize, circleSize);

  println(r);
}