package my_project.control;

import KAGO_framework.control.ViewController;
import my_project.model.Ball;
import my_project.model.Cloud;
import my_project.model.House;
import my_project.model.flooooor;

/**
 * Ein Objekt der Klasse ProgramController dient dazu das Programm zu steuern. Die updateProgram - Methode wird
 * mit jeder Frame im laufenden Programm aufgerufen.
 */
public class ProgramController {

    //Attribute


    // Referenzen
    private ViewController viewController;  // diese Referenz soll auf ein Objekt der Klasse viewController zeigen. Über dieses Objekt wird das Fenster gesteuert.

    /**
     * Konstruktor
     * Dieser legt das Objekt der Klasse ProgramController an, das den Programmfluss steuert.
     * Damit der ProgramController auf das Fenster zugreifen kann, benötigt er eine Referenz auf das Objekt
     * der Klasse viewController. Diese wird als Parameter übergeben.
     * @param viewController das viewController-Objekt des Programms
     */
    public ProgramController(ViewController viewController){
        this.viewController = viewController;
    }

    /**
     * Diese Methode wird genau ein mal nach Programmstart aufgerufen.
     * Sie erstellt die leeren Datenstrukturen, zu Beginn nur eine Queue
     */
    public void startProgram() {
        // Erstelle ein Objekt der Klasse Ball und lasse es zeichnen
        Ball ball1 = new Ball(150,150);
        viewController.draw(ball1);

        House house1 = new House();
        viewController.draw(house1);

        Cloud c1 = new Cloud(100,50,40);
        viewController.draw(c1);

        Cloud c2 = new Cloud(400,80,50);
        viewController.draw(c2);

        Cloud c3 = new Cloud(300,10,20);
        viewController.draw(c3);


        flooooor f1 = new flooooor(0,0,0);
        viewController.draw(f1);

    }

    /**
     * Aufruf mit jeder Frame
     * @param dt Zeit seit letzter Frame
     */
    public void updateProgram(double dt){

    }
}
