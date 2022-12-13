package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;


public class House extends GraphicalObject {

    public House(){
    }

    public void draw(DrawTool drawTool){
        drawTool.setCurrentColor(new Color(213, 213, 32, 255));
        drawTool.drawFilledRectangle(100,420,300,80);
        drawTool.drawFilledTriangle(100,420,250,270,400,420);
    }
}