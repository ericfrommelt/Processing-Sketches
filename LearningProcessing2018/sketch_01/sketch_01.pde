void setup() {
  size(600, 600);
  background(255);
  pixelDensity(2);
}

void draw() {
  noStroke();
  fill(240);
  rect(width-10, 0, 10, height);
  rect(0, 300, 10, 300);
  fill(0);
  ellipse(365, 345, 300, 300);
  fill(255);
  ellipse(365, 345, 100, 100);
  fill(0);
  rect(100, 100, 50, 50);
  rect(100, height-10, 50, 50);
  rect(0, 500, 172, 8);
  stroke(0);
  strokeWeight(1);
  line(20, 200, 60, 200);
  line(20, 220, 60, 220);
  line(20, 300, 60, 300);
  strokeWeight(2);
  line(400, 30, 565, 30);

  strokeWeight(abs(pmouseX - mouseX));
  line(pmouseX, pmouseY, mouseX, mouseY);

}

void mousePressed() {
  rectMode(CENTER);
  rect(mouseX, mouseY, 20, 20);
}

void keyPressed() {
  background(255);
}