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

public class Processing extends PApplet {

/*
    Created by David Li, Oct 1
    Project for drawing house thing
*/

public void setup() {
    
}


// void setup() {
//    size(1500, 1000, P3D); // set size of canvas 
// }

// public float color_r = 0;
// public float color_g = 0;
// public float color_b = 0;


// void mouseWheel(MouseEvent event) {
//     float wheelPos = event.getCount();
//     num = wheelPos;
// }
// float num = 0;
// void draw() {
//     if(mousePressed) {
//         // color_r = random(0, 255)-num;
//         // color_g = random(0, 255)-num;
//         // color_sb = random(0, 255)-num;
//         color_r = num;
//         color_g = num;
//         color_b = num;
//         fill(color_r, color_g, color_b);
//         translate(random(0, 1500), random(0, 1000), random(0, 500));
//         rotateY(random(0,360));
//         // rect(mouseX, mouseY, random(10, 50), random(10, 50));
//         box(random(0, 300), random(0, 300), random(0, 300));
//     }
// }
  public void settings() {  size(1920, 1080); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Processing" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
