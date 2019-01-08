void setup() {
  noLoop();
}

void draw() {
  // Generate a random number that sets the number of random numbers that will be generated
  int setnum = int(random(1,10));
  // Generate random numbers based on the set number
  for (int i=0; i<setnum; i++) {
    int num = int(random(1,20));
    println(num);
  }
}
