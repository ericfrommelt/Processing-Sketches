// Initial Sketch

size(600, 600);
smooth();
background(0, 0, 0);
stroke(255);
line(0,0,600,600);
line(600, 0, 0, 600);
fill(0, 0, 0, 0);
ellipse(600/2, 600/2, 200, 200);
fill(255, 255, 255);
rect(20, 400, 10, 100);
rect(480, 100, 10, 260);

int step = 30;

for (int i=1; i<5; i++) {
 println(i);
 rect(100, step + step, 20, 10);
 step += 20;
}

rect(100, 540, 60, 60);
rect(300, 0, 240, 20);
ellipse(400, 130, 10, 10);
ellipse(174, 340, 10, 10);
ellipse(290, 490, 10, 10);
rect(570, 420, 10, 45);

fill(255, 255, 255, 255);
strokeWeight(20);
ellipse(width/2, height/2, 80, 80);

int step2 = 310;
strokeWeight(1);

for (int j=1; j<30; j++) {
   line(430, step2, 440, step2);
   step2 += 10;
}

int step3 = 120;
for (int j=1; j<10; j++) {
   line(500, step3, 510, step3);
   step3 += 10;
}

int step4 = 220;
for (int j=1; j<9; j++) {
   line(80, step4, 90, step4);
   step4 += 10;
}

ellipse(400, 500 ,90, 90);
line(200, 90, 290, 90);
