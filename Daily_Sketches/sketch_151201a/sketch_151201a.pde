void setup() {
  size(600, 600);
  noLoop();
  background(0, 0, 0);
}

void draw() {

  smooth();
  overlay();
  barSequence(100, 10, 60, 5, 8, 20);

  // lineSequence(int x1, int y1, int x2, int y2, int stepNum, int stepSpace)
  lineSequence(430, 310, 440, 310, 10, 20);
  lineSequence(520, 120, 530, 120, 10, 10);
  lineSequence(80, 220, 90, 220, 40, 20);


  // shapes
  fill(255, 255, 255);
  rect(20, 400, 10, 100);
  rect(480, 100, 10, 260);
  rect(100, 540, 60, 60);
  rect(300, 0, 240, 20);
  ellipse(400, 130, 10, 10);
  ellipse(174, 340, 10, 10);
  ellipse(290, 490, 10, 10);
  rect(570, 420, 10, 45);
  ellipse(400, 500 ,90, 90);
  line(200, 90, 290, 90);
}

// Functions
void overlay() {
  stroke(255);
  line(0,0,width,height);
  line(600, 0, 0, 600);
  fill(0, 0, 0, 0);
  ellipse(width/2, height/2, 200, 200);
  fill(255);
  strokeWeight(20);
  ellipse(width/2, height/2, 80, 80);
}


/* Create a sequence of rectangles that skips a step based on a random number */
void barSequence(int x, int y, int w, int h, int stepNum, int stepSpace) {
  strokeWeight(0);
  for (int i=1; i<stepNum; i++) {

  int rand = int(random(3));
   rect(x, y + y, w, h);

   if (rand == 1) {
     y += stepSpace + stepSpace;
   } else {
     y += stepSpace;
   }
   println(rand);
  }
}

// Creqte a sequence of lines that skips a step based on a random number
void lineSequence(int x1, int y1, int x2, int y2, int stepNum, int stepSpace) {
  strokeWeight(1);
  for (int i=1; i<stepNum; i++) {
    int rand = int(random(3));
    stroke(int(random(255)));
    line(x1, y1, x2, y2);

    if(rand == 2) {
      y1+=stepSpace + stepSpace;
      y2+=stepSpace + stepSpace;
    } else {
      y1+=stepSpace;
      y2+=stepSpace;
    }
  }
}