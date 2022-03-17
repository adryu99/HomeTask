package com.company;
/* Создать функцию, которая строит на экране лестницу

        На вход принимается int равный высоте лестницы
public static void ladder(int numberOfLadders){
        // your code is here
        // один цикл от 1 до numberOfLadders
        //внутри этого цикла другой цикл который будет рассчитывать количество * и 0
        // количество * = номеру ступени
        // количество 0 вычисляем как numberOfLadders - количество *
        }

        Дополнительно реализовать два эксепшена (обработать и вывести на экран)
        1. NegativeNumberException - если на вход пришло отрицательное число
        2. ZeroNumberException - если на вход пришел ноль

        Пример: 4
        Вывод:
        *000
        **00
        ***0
        ****
*/
public class Main {

    public static void main(String[] args) throws inputNegativeException, inputZeroException{
	// write your code here
        ladder(50);
    }

    static void  ladder (int numberOfLadders) throws inputNegativeException, inputZeroException{

        if (numberOfLadders < 0) {
            throw new inputNegativeException();
        }
        if (numberOfLadders == 0) {
            throw new inputZeroException();
        }
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= numberOfLadders; i++){

            for (int j = 0; j < i; j++){
                result.append("*");
            }
            for (int k = 0; k < (numberOfLadders - i); k++){
                result.append("0");
            }
            result.append("\n");
        }
        System.out.println(result);
    }

    static class inputZeroException extends Exception{}
    static class inputNegativeException extends Exception{}
}




/*
static void ladder (int numberOfLadders) throws InputNegativeException, InputZeroException {

        if (numberOfLadders < 0){
            throw new InputNegativeException();
        }
        if (numberOfLadders == 0){
            throw new InputZeroException();
        }
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= numberOfLadders; i++){

            for (int j = 0; j < i; j++){
                result.append("*");
            }
            for (int k = 0; k < (numberOfLadders - i); k++){
                result.append("0");
            }
            result.append("\n");
        }
        System.out.println(result);
    }
    555
 */