package ru.bfu.ipmit.lab3;

public interface Shape {
    double getArea(); //возвращает площадь геометрической фигуры
    double getPerimeter(); //возвращает периметр геометрической фигуры
    ShapeType getType(); //возвращает тип геометрической фигуры из перечисления ShapeType
}
