package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;


public class House extends GraphicalObject {

    public House(){
        x = 100;
    }

    public void draw(DrawTool drawTool){
        drawTool.setCurrentColor(new Color(213, 213, 32, 255));  //farbe
        drawTool.drawFilledRectangle(x,420,300,80);    //wändeoderso
        drawTool.drawFilledTriangle(x,420,x+150,270,x+300,420);  //dach.
    }

    public void update(double dt){
        //update und so i guess
        x = x +30*dt;
        if ( x > 800){
            x = -200;
        }
    }
}
