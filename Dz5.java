package ru.geekbrains.lesson1.git;

class Person {
    private String fio;
    private String post;
    private String email;
    private String tel;
    private double salary;
    private int age;

    Person(String fio, String post, String email, String tel, double salary, int age) {
        this.fio = fio;
        this.post = post;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        if(age >= 18) {
            this.age = age;
        } else {
            System.out.println("Сотрудник должен быть старше 18 лет");
        }
    }

    int GetAge() {
        return age;
    }

    void Show() {
        System.out.println(fio + " " + post + " " +  email + " " + tel + " " + salary + " " + age);
    }
}



public class Dz5 {

    public static void main(String[] args) {

        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "844444444", 30000, 30);
        persArray[1] = new Person("Petrov Petr", "Technic", "petr1@mailbox.com", "8888888888", 45000, 41);
        persArray[2] = new Person("Sergeev Sergey", "Engineer2", "sergey@mailbox.com", "89999999", 250000, 55);
        persArray[3] = new Person("Fedorov Fedor", "Engineer3", "fedor@mailbox.com", "8666666666", 27000, 39);
        persArray[4] = new Person("Stepnov Stepan", "Engineer4", "stepan@mailbox.com", "82222222222", 390000, 44);

        for(Person item : persArray) {
            if(item.GetAge() > 40) item.Show();
        }
    }
}