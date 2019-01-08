void setup(){
 size(940, 940);
 background(0, 0, 0);
}

void draw() {
  stroke(46);
  for(int i=0; i<width; i+=10) {
    for(int j=0; j<height; j+=10) {
      line(i, 0, i, height);
      line(0, j, width, j);
     }
   }
 }