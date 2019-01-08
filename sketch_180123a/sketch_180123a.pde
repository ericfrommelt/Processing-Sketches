void setup() {
  size(1000, 1000);
  pixelDensity(2);
  background(41, 41, 41);
  noLoop();
}

void draw() {
 block(width/2, height/2, 100, 100);
}

void block(float blockX, float blockY, float blockW, float blockH) {
  color teal = color(43, 191, 189);
  color teal2 = color(63, 184, 175);
  color teal3 = color(127, 199, 175);
  color tan = color(218, 216, 167);
  color orange1 = color(242, 179, 61);
  color orange2 = color(242, 155, 42);
  color pink1 = color(255, 158, 157);
  color pink2 = color(255, 61, 127);
  color red = color(242, 46, 46);

  int[] colors = {teal, teal2, teal3, tan, orange1, orange2, pink1, pink2, red};
  float colorNumber = random(colors.length);
  int randomColor = int(colorNumber);

  noStroke();
  fill(colors[randomColor]);
  rect(blockX, blockY, blockW, blockH);
}