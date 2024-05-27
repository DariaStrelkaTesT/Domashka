public class Worker {
    public static void main(String[] args) {

    }
// Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//Конструктор класса должен заполнять эти поля при создании объекта.
//Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
            private String name;
            private String position;
            private String email;
            private String phoneNumber;
            private int salary;
            private int age;

            Worker(String name, String position, String email, String phoneNumber, int salary, int age) {
                this.name = name;
                this.position = position;
                this.email = email;
                this.phoneNumber = phoneNumber;
                this.salary = salary;
                this.age = age;
            }

            public void info() {
                System.out.println("ФИО:" + name + ";должность:" + position + ";email:" + email + ";телефон:" + phoneNumber +
                        ";зарплата:" + salary + ";возраст:" + age);


            }
        }

