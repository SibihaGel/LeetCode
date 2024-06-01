package stream.filter;

import org.junit.Test;

import java.util.Objects;
import java.util.Random;

public class Students {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public Students (){

    }


    public Students(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Students students = (Students) o;

        if (sex != students.sex) return false;
        if (age != students.age) return false;
        if (course != students.course) return false;
        if (Double.compare(avgGrade, students.avgGrade) != 0) return false;
        return Objects.equals(name, students.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + (int) sex;
        result = 31 * result + age;
        result = 31 * result + course;
        temp = Double.doubleToLongBits(avgGrade);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
