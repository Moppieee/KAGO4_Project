package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;






public class flooooor extends GraphicalObject {

    public flooooor(double xPos,double yPos, double r){
        //in diesem Framework hat jedes Graphicalobject zwei Variablen (sogar mehr), die x,y und radius heißen.
        //Diese können einfach festgelegt werden.
        x = xPos;
        y = yPos;
        radius = r;
    }


    public void draw(DrawTool drawTool){
        drawTool.setCurrentColor(new Color(33, 82, 19,255));
        drawTool.drawFilledRectangle(0,500,600,100);

    }
}