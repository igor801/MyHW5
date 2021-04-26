package ru.geekbrains.lesson;
//1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//2. Конструктор класса должен заполнять эти поля при создании объекта.
//3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
//4. Создать массив из 5 сотрудников.
//Пример:
//Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
//persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
// потом для каждой ячейки массива задаем объект
//persArray[1] = new Person(...);
//...
//persArray[4] = new Person(...);
//
//5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.

public class Staff {
    private String fullName;
    private String position;
    private String email;
    private int numberPhone;
    private int pay;
    private int age;

    public Staff(String fullName, String position, String email, int numberPhone, int pay, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.numberPhone = numberPhone;
        this.pay = pay;
        this.age = age;
    }
    public void info() {
        String infoMessege = "Staff: %s\nPosition: %s\nEmail: %s\nNumberPhone: %s\nPay: %s\nAge: %d\n\n";
        System.out.printf(infoMessege, fullName, position, email, numberPhone, pay, age);
    }
    public int getAge () {
        return age;
    }
}
