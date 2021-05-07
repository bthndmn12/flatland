package processing.test.flatland;

import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class flatland extends PApplet {


ArrayList<Character> chs;

public void setup() {
  //size(400, 400);
  
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

public void draw() {
 println(frameRate);
  for (Character c : chs) {
    c.born();
    c.move();
  }
}

class Character {
  int x, y;
  int size;
  int dgr;  
  int heightS;
  int widthS;
  int vx, vy;
  int c;
  Character(int x, int y, int size, int dgr, int heightS, int widthS, int vx, int vy, int c) {
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
  public void born() {
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
  public void move() {

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
  public void settings() {  fullScreen(); }
}
