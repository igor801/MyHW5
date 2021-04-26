package ru.geekbrains.lesson;
//1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
////2. Конструктор класса должен заполнять эти поля при создании объекта.
////3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
////4. Создать массив из 5 сотрудников.
////Пример:
////Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
////persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
//// потом для каждой ячейки массива задаем объект
////persArray[1] = new Person(...);
////...
////persArray[4] = new Person(...);
////
////5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.

public class MyHW5 {
    public static void main(String[] args) {
        Staff[] staffs = {
                new Staff("Nick Bolov", "Engineer", "mail@mail", 892184654, 70000, 26),
                new Staff("Nick Bolov2", "Engineer2", "mail@mail2", 892184652, 70002, 22),
                new Staff("Nick Bolov3", "Engineer3", "mail@mail3", 892184653, 70003, 23),
                new Staff("Nick Bolov4", "Engineer4", "mail@mail4", 892184654, 70004, 24),
                new Staff("Nick Bolov5", "Engineer5", "mail@mail5", 892184655, 70005, 25)};
        for (Staff staff : staffs) {
            if (staff.getAge() < 40) {
                staff.info();
            }
        }
    }
}