package ru.sokolova.university.model;
import ru.sokolova.university.model.Professor;

public class University {
    private Professor professor;
    private Student student;

    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
        }
    public Student getStudent () {
        return student;
    }
    public void setStudent (Student student){
        this.student = student;
    }
}









