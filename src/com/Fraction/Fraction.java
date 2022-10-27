package com.Fraction;

public class Fraction {
    private int num;
    private int denum;

    //Конструктор по умолчанию(нет вводных)
    public Fraction(){
        num = 1;
        denum = 1;
    }

    //Конструктор с параметрами
    public Fraction(int num, int denum) {

        // this - "я,моё" для класса, хранит адрес где в памяти хранится объект
        // помогает при совпадении имён, не плодит имена
        this.num = num;
        if(denum!=0){
            this.denum = denum;
        }else{
            this.denum = 1; //Плохой вариант, искусственное вмешательство
        }
        divideWhileCan(this);
    }

    //Первый способ вывода объекта(Обращение к базовому классу Object)
    @Override
    public String toString() {
        return num +"/" + denum;
    }

    //Второй способ вывода объекта(Самостоятельно вызывается)
    public void printFraction(){
        System.out.println(num +"/" + denum);
    }

    // fraction.num - сработает, если нет private(плохой вариант, дырка в системе)

    //Умножение на коэфицент(смысла нет, но ладно)
    public void multyKoeff(int k){
        if(k!=0){ // Проверка на невозможное значение
            denum *= k;
        }
        num *= k;
        divideWhileCan(this);
    }


    //умножение дробь на дробь+ запрос значений другой дроби
    public Fraction multyFraction(Fraction Fraction2){
        Fraction result = new Fraction();
        result.num = num * Fraction2.num;
        result.denum = denum * Fraction2.denum;
        divideWhileCan(result);
        return result;
    }

    //геттеры и сеттеры(для работы с закрытыми полями), одно поле - один геттер, сеттер
    //геттер - получение значение из класса
    public int getNum() {
        return num;
    }
    public int getDenum() {
        return denum;
    }

    public void setNum(int num) {

        this.num = num;
        divideWhileCan(this);
    }

    //сеттер - получение значения в класс
    public void setDenum(int denum) {
        if(denum!=0){
            this.denum = denum;
        }else{
            this.denum = 1; //Плохой вариант, искусственное вмешательство
        }
        divideWhileCan(this);
    }

    //Деление дробей
    public Fraction demultyFraction(Fraction Fraction2){
        Fraction result = new Fraction();
        result.num = num * Fraction2.denum;
        result.denum = denum * Fraction2.num;
        divideWhileCan(result);
        return result;
    }
    public Fraction minusFraction(Fraction Fraction2){
        Fraction result = new Fraction();
        result.num = num * Fraction2.denum-Fraction2.num*denum;
        result.denum = denum * Fraction2.denum;
        divideWhileCan(result);
        return result;
    }
    public Fraction plusFraction(Fraction Fraction2){
        Fraction result = new Fraction();
        result.num = num * Fraction2.denum+Fraction2.num*denum;
        result.denum = denum * Fraction2.denum;
        divideWhileCan(result);
        return result;
    }
    public void divideWhileCan(Fraction fraction){
        int min;
        if(fraction.num>fraction.denum){
            min = fraction.denum;
        }else{
            min = fraction.num;
        }
        for(int i = min;i>1;i--){
            if (fraction.num%i==0 && fraction.denum%i==0){
                fraction.num /= i;
                fraction.denum /= i;
            }
        }
    }
}
