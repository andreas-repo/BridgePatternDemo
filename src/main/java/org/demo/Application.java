package org.demo;

import org.demo.api.impl.GreenCircle;
import org.demo.api.impl.RedCircle;
import org.demo.model.Shape;
import org.demo.model.extended.Circle;

public class Application {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedCircle(), 100,100, 10 );
        Shape greenCircle = new Circle(new GreenCircle(), 100,100, 10);

        redCircle.draw();
        greenCircle.draw();
    }
}
