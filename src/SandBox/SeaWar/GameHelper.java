package SandBox.SeaWar;

import java.io.*;
import java.util.ArrayList;

public class GameHelper {

    private static final String alphabet = "abcdefg";
    private int gridLength = 7;
    private int gridSize = 49;
    private int[] grid = new int[gridSize];
    private int comCount = 0;

    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.print(prompt + " ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) return null;
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        return inputLine.toLowerCase();
    }

    public ArrayList<String> placeDotCom(int comSize) {
        ArrayList<String> alphaCells = new ArrayList<String>();
        String[] alphacoords = new String[comSize];             //хранит координаты типа ф6
        String temp = null;                                     //временная строка для конкатенации
        int[] coords = new int[comSize];                        //координаты текущего сайта
        int attempts = 0;                                       //Счетчик текущих попыток
        boolean success = false;                                //Нашлли подходящее местоположение?
        int location = 0;                                       //Текущее начальное местоположение

        comCount++;                                             //Энный сайт для размещения
        int incr = 1;                                           //Устанавливаем горизонтальный инкремент
        if ((comCount % 2) == 1) {                              //Если нечетный (размещаем вертикально)
            incr = gridLength;                                  //Устанавливаем вертикальный инкремент
        }
        while (!success & attempts++ < 200) {                   //Главный поисковый цикл (32)
            location = (int) (Math.random() * gridSize);        //Получаем случайную стартовую точку
            //System.out.println("пробуем" + location);         //
            int x = 0;                                          //Энная позиция в сайте который нужно разместить
            success = true;                                     //Предполагаем успешный ход
            while (success && x < comSize) {                    //Ищем соседнюю неиспользованную ячейку
                if (grid[location] == 0) {                      //Если ещё не используется
                    coords[x++] = location;                     //Сохраняем местоположение
                    location += incr;                           //пробуем следующую соседнюю ячейку
                    if (location >= gridSize) {                 //Вышли за рамки - низ
                        success = false;                        //неудача
                    }
                    if (x > 0 && (location % gridLength == 0)) {//вышли за рамки - правый край
                        success = false;                        //неудача
                    }
                } else {                                        //нашли уже использующееся местоположение
                    //System.out.println("Используется" + location);
                    success = false;                            //неудача
                }
            }
        }                                                       //конец while

        int x = 0;                                              //переводим местоположение в символьные координаты
        int row = 0;
        int column = 0;
        //System.out.println("\n");
        while (x < comSize) {
            grid[coords[x]] = 1;                                //помечаем ячейки в каждой сетке как "использованные"
            row = (int) (coords[x] / gridLength);               //Получаем значение строки
            column = coords[x] % gridLength;                    //Получаем числовое значение столбца
            temp = String.valueOf(alphabet.charAt(column));     //Преобрауем его в строковый символ

            alphaCells.add(temp.concat(Integer.toString(row)));
            x++;
            System.out.println(" coord"+ x+ " = " + alphaCells.get(x-1));   //говорит о том где именно находится сайт
        }
        System.out.println("\n");
        return alphaCells;
    }
}



