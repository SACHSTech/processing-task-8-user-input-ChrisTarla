import processing.core.PApplet;

public class Sketch extends PApplet {
  // Variables 
  boolean blnMouseDrag = false;
  boolean blnSnowman = false;
  boolean blnSnowflake = false;
  boolean blnSnow = false; 
  boolean blnEraser = false;
  boolean blnEraseAll = false;

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
    // Drawing Tool Guide 
    text("S = Snow", 5, 15);
    text("F = Snowflake", 5, 30);
    text("M = Snowman", 5, 45);
    text("E = Eraser", 5, 60);
    text("SHIFT = Erase All", 5, 75);

    // Draw based on chosen key/drawing tool 
    if (blnSnowman == true && mousePressed == true && blnMouseDrag == false && keyPressed == false){
      fill(230, 235, 255);
      stroke(205, 210, 230);
      ellipse(mouseX, mouseY + 30, 50, 50);
      ellipse(mouseX, mouseY, 35, 35);
      ellipse(mouseX, mouseY - 25, 25, 25);
      fill(0);
      stroke(0);
      rect(mouseX - 8, mouseY - 50, 15, 15);
      rect(mouseX - 12.5f, mouseY - 40, 25, 5);
    } else if (blnSnowflake == true && mousePressed == true && keyPressed == false){
      fill(255);
      stroke(255);
      ellipse(mouseX, mouseY, 5, 5);
    } else if (blnSnow == true && mousePressed == true && keyPressed == false){
      fill(245, 245, 250);
      stroke(235, 235, 240);
      ellipse(mouseX, mouseY, 50, 50);
    } else if (blnEraser == true && mousePressed == true && keyPressed == false){
      fill(160, 200, 250);
      stroke(160, 200, 250);
      ellipse(mouseX, mouseY, 50, 50);
    } else if (blnEraseAll == true){
      fill(160, 200, 250);
      rect(0, 0, 800, 800);
    }
  } 

  /** 
   * Switch between different drawing settings by reading key input 
   */
  public void keyPressed(){
    if (key == 'M' || key == 'm'){
      blnSnowman = true;
      blnSnowflake = false;
      blnSnow = false;
      blnEraser = false;
    } else if (key == 'F' || key == 'f'){
      blnSnowman = false;
      blnSnowflake = true;
      blnSnow = false;
      blnEraser = false;
    } else if (key == 'S' || key == 's'){
      blnSnowman = false;
      blnSnowflake = false;
      blnSnow = true;
      blnEraser = false;
    } else if (key == 'E' || key == 'e'){
      blnSnowman = false;
      blnSnowflake = false;
      blnSnow = false;
      blnEraser = true;
    } else if (key == CODED){
      if (keyCode == SHIFT){
        blnSnowman = false;
        blnSnowflake = false;
        blnSnow = false;
        blnEraser = false;
        blnEraseAll = true;
      }
    }
  }

  /** 
   * Stop the Erase All drawing tool when a key is released 
   */
  public void keyReleased(){
    blnEraseAll = false;
  }

  /** 
   * Make the Mouse Drag variable true 
   */
  public void mouseDragged(){
    blnMouseDrag = true;
  }

  /** 
   * Make the Mouse Drag variable false 
   */
  public void mouseReleased(){
    blnMouseDrag = false;
  }
}
