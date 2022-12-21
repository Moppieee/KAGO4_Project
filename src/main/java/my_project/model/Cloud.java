package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;






public class Cloud extends GraphicalObject {

    public Cloud(double xPos,double yPos, double r){
        //in diesem Framework hat jedes Graphicalobject zwei Variablen (sogar mehr), die x,y und radius heißen.
        //Diese können einfach festgelegt werden.
        x = xPos;
        y = yPos;
        radius = r;
    }


    public void draw(DrawTool drawTool){
    drawTool.setCurrentColor(new Color(200,200,200));
    drawTool.drawFilledCircle(x,y,radius);
    drawTool.drawFilledCircle(x+radius/2,y+radius/2,radius);
    drawTool.drawFilledCircle(x+radius,y,radius);
    }

    public void update(double dt){
       //update und so i guess
        x = x +30*dt;
        if ( x > 800){
            x = -200;
        }
    }
}