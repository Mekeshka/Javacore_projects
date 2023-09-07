package ru.sokolova.university.model;

import ru.sokolova.university.service.Attendable;
import ru.sokolova.university.service.Passable;

public class Student implements Attendable, Passable {

    private Professor professor;
    private University university;
    public University getUniversity(){
        return university;
    }
    public void setUniversity(University university){
        this.university = university;
    }

    public Professor getProfessor(){
        return professor;
    }
    public void setProfessor(Professor professor){
        this.professor = professor;
    }

    public void passExam(){
        System.out.println("Студент сдает экзамен");
    }

    public void attendLecture() {
        System.out.println("Студент посещает лекции и слушает их");
    }

}
