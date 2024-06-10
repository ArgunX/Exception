package Exeption;

public class MyRunTimeExeption extends RuntimeException{
    /**
     * @apiNote Проверяет целостность строки.
     * @param arrLength
     */
    public MyRunTimeExeption(int arrLength) {
        super("Недостаточно данных. \n" +
                "Введено записей: " + arrLength+"\nТребуется записей: 6");
    }
}