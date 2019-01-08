float r = 0;
float g = 0;
float b = 0;

void setup() {
  size(600, 600);
}

void draw() {
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