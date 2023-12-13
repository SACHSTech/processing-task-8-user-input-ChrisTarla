import processing.core.PApplet;

// Variables 


public class Sketch extends PApplet {

  //Called once at the beginning of execution, put your size all in this method
  public void settings() {
	// put your size call here
    size(800, 800);
  }

  //Called once at the beginning of execution. Add initial set up values here i.e background, stroke, fill etc. 
  public void setup() {
    background(160, 200, 250);
  }

  // Called repeatedly, anything drawn to the screen goes here
  public void draw() {
      // Snowman 
      if (mousePressed == true){
        fill(230, 235, 255);
        stroke(205, 210, 230);
        ellipse(mouseX, mouseY + 30, 50, 50);
        ellipse(mouseX, mouseY, 35, 35);
        ellipse(mouseX, mouseY - 25, 25, 25);
        fill(0);
        stroke(0);
        rect(mouseX - 8, mouseY - 50, 15, 15);
        rect(mouseX - 12.5f, mouseY - 40, 25, 5);
      } 

      // Snowflake 
      if (mousePressed == true){
        fill(255);
        stroke(255);
        ellipse(mouseX, mouseY, 5, 5);
      }

      // Snow 
      if (mousePressed == true){
        fill(245, 245, 250);
        stroke(235, 235, 240);
        ellipse(mouseX, mouseY, 50, 50);
      }
  }
}
