
ArrayList<Character> chs;

void setup() {
  //size(400, 400);
  fullScreen();
  background(0);
  frameRate(240);
  colorMode(RGB, 255);
  chs = new ArrayList();
  chs.add(new Character( (int)floor(random(width)), (int)floor(random(height)), 10, 0, height, width, 1, 1, color((int)floor(random(255)), (int)floor(random(255)), (int)floor(random(255)))));
  chs.add(new Character((int)floor(random(width)), (int)floor(random(height)), 10, 1, height, width, 1, 1, color((int)floor(random(255)), (int)floor(random(255)), (int)floor(random(255)))));
 for(int i=0; i < 500; i++){
    chs.add(new Character( (int)floor(random(width)), (int)floor(random(height)), 10, (int)random(2), height, width, 1, 1, color((int)floor(random(255)), (int)floor(random(255)), (int)floor(random(255)))));
 }
  
}

void draw() {
 println(frameRate);
  for (Character c : chs) {
    c.born();
    c.move();
  }
}
