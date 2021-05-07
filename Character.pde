
class Character {
  int x, y;
  int size;
  int dgr;  
  int heightS;
  int widthS;
  int vx, vy;
  color c;
  Character(int x, int y, int size, int dgr, int heightS, int widthS, int vx, int vy, color c) {
    this.x =x;
    this.y = y;
    this.vx = vx;
    this.vy = vy;
    this.size = size;
    this.dgr = dgr;
    this.heightS = heightS;
    this.widthS = widthS;
    this.c = c;
  }
  void born() {
    if (dgr == 0) {
      noFill();
      stroke(c);
      circle(x, y, size);
    } else if (dgr == 1) {
      noFill();
      stroke(c);
      rect(x, y, size, size);
    }
    //println(x+" "+y);
  }
  void move() {

    if (dgr == 0) {
      //x+=2*vx;
      //y+=2*vy;
      //if(x == 400 || x == 0){
      //   vx = -vx;
      //}
      //if(y == 400 || y == 0){
      //   vy =-vy;
      //}
      int r = floor(random(8));
      switch(r) {
      case 0:
        x += 1;
        break;
      case 1:
        x -= 1;
        break;
      case 2:
        y += 1;
        break;
      case 3:
        y -= 1;
        break;
      case 4:
        x += 2;
        break;
      case 5:
        x -= 2;
        break;
      case 6:
        y += 2;
        break;
      case 7:
        y -= 2;
        break;
      }

      if (x >= widthS) {
        x-=1;
      }
      if (x <= 0) {
        x+=1;
      }
      if (y >= heightS) {
        y-=1;
      }
      if (y <= 0) {
        y+=1;
      }
    }
    if (dgr == 1) {
      //x+=vx;
      //y+=vy;
      //if(x == 400 || x == 0){
      //   vx = -vx;
      //}
      //if(y == 400 || y == 0){
      //   vy =-vy;
      //}
      int r = floor(random(4));
      switch(r) {
      case 0:
        x += 1;
        break;
      case 1:
        x -= 1;
        break;
      case 2:
        y += 1;
        break;
      case 3:
        y -= 1;
        break;
      }
      if (x >= widthS) {
        x-=1;
      }
      if (x <= 0) {
        x+=1;
      }
      if (y >= heightS) {
        y-=1;
      }
      if (y <= 0) {
        y+=1;
      }
    }
  }
}
