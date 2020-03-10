package SandBox.SeaWar;

import java.util.ArrayList;

public class DotCom {
    //переменные экземпляра класса дотком:
    private ArrayList<String> locationCells; //аррау лист с ячейками описывающие местоположение
    private String name; //имя сайта

    public void setLocationCells(ArrayList<String> loc) { //сеттер, который обновляет местоположение сайта, (случайный адре, предоставляемый методом plaseDotCom() из класса GameHelper/
        locationCells = loc;
    }

    public void setName(String n) { //простой сеттер на имя
        name = n;
    }

    public String checkYourself(String userInput) {
        String result = "мимо";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index); //применяем метод remove() из ArrayList для удаления элемента. проверяем все ли адреса разгаданы.

            if (locationCells.isEmpty()) { //isEmpty() возвращает true если список не содержит элементов.
                result = "потопил";
                System.out.println("Вы потопили" + name + "  :  ( ");
            } else {
                result = "Попал";
            } //конец if
        } //конец if
        return result;
    } //конец метода
} //конец класса
