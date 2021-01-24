package eu.senla.task3.part2;

import java.util.Objects;

public class Cat {
    String nickname = "Kyzia";
    int age = 1;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age >= 0 && age <= 20) {
            this.age = age;
        } else {
            System.out.println("Incorrect value. Cat age from 0 to 20 years!");
        }
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    // переопределенный метод equals (создан idea)
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(nickname, cat.nickname);
    }

    // переопределенный метод toStirng (создан idea)
    public String toString() {
        return "Cat{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                '}';
    }
    // переопределенный метод toString (самописанный)
    public String toStringNew (){
        return "Cat " + nickname + " " + age;
    }
}

