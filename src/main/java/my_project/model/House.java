package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;


public class House extends GraphicalObject {

    public House(){
    }

    public void draw(DrawTool drawTool){
        drawTool.drawRectangle(300,300,300,80);
        drawTool.drawTriangle(300,300,150,150,200,200);
    }
}