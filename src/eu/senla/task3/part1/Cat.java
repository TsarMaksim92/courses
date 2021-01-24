package eu.senla.task3.part1;

public class Cat {
    String nickname = "Bakster";
    int age = 4;

    public Cat() {

    }

    public Cat(String tempName, int tempAge) {
        nickname = tempName;
        age = tempAge;
    }

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
}

