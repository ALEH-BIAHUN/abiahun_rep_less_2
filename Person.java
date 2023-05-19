public class Person {
    public String fullName;                               //создали переменную "fullName" типа String
    public int age;                                       // создали переменную "age" типа int

    Person(String fullName, int age) {              //создали конструтор Person(fullName, age)
        this.fullName = fullName;
        this.age = age;
    }
    Person() {                                      //создали конструктор Person()
    }
    public void move() {
        System.out.println("Двигается " + this.fullName + "," + " ему " + this.age);
    }
    public void talk() {                                    //создали метод talk
        System.out.println("Говорит " + this.fullName);
    }
}

