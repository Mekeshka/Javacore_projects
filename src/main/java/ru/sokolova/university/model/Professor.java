package ru.sokolova.university.model;

import ru.sokolova.university.service.Attendable;
import ru.sokolova.university.service.Evaluatable;
import ru.sokolova.university.model.University;

public class Professor implements Attendable, Evaluatable {
    private University university;
    private Student student;
    public University getUniversity(){
        return university;
    }
    public void setUniversity(University university){
        this.university = university;
    }

    public Student getStudent(){
        return student;
    }
    public void setStudent(Student student){
        this.student = student;
    }

    public void evaluateKnowledge(){
        System.out.println("Преподаватель оценивает знания студента");
    }

    @Override
    public void attendLecture() {
        System.out.println("Преподаватель посещает лекции и проводит их");
    }
}
