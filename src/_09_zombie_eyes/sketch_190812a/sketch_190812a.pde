void setup(){
PImage cat = loadImage("cat.png");
size(600,600);
cat.resize(600, 600);
image(cat, 0, 0);
}
void draw(){
  if(mousePressed){
    println(mouseX+" "+mouseY);
  }
  noStroke();
  fill(mouseX, mouseY, mouseX);
  ellipse(369, 200, 20, 20);
  ellipse(464, 196, 20, 20);
  
  
}
