public class Person_Main {
    public static void main(String[] args) {              //создали метод мэйн - точку входа программы

        Person person_1 = new Person("Иванов Иван Иванович", 35);                   //создали объект person_1
        Person person_2 = new Person();                   //создали объект person_2



        person_1.fullName = "Иванов Иван Иванович";      //присвоили значение переменной "fullName" типа String
        person_2.fullName = "Петров Петр Петрович";      //присвоили значение переменной "fullName" типа String

        person_1.age = 35;                               //присвоили значение переменной "age" типа int
        person_2.age = 44;                               //присвоили значение переменной "age" типа int


        person_1.move();                                 //вызываем метод move для объекта person_1
        person_2.move();                                 //вызываем метод move для объекта person_2
        System.out.println();

        person_1.talk();                                 //вызываем метод talk для объекта person_1
        person_2.talk();                                 //вызываем метод talk для объекта person_2
    }

}
