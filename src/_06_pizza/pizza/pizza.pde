
void setup() {
  background(#55380C);
    size(500,500);
    fill(#C4BCB6);
    ellipse(250, 250, 400, 400);
    fill(#F01115);
    ellipse(250, 250, 350, 350);
    fill(#F6FA92);
    ellipse(250, 250, 300, 300);
}
void draw() {
    PImage pepperoni = loadImage("pepperoni.jpg");
pepperoni.resize(30,30);
if(mousePressed){
image(pepperoni,mouseX , mouseY);
}
}
