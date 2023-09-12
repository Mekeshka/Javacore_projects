package ru.sokolova.university._main;

import ru.sokolova.university.model.Professor;
import ru.sokolova.university.model.Student;
import ru.sokolova.university.model.University;
import ru.sokolova.university.service.AttendDemonstrator;
import ru.sokolova.university.service.ProfessorDemonstrator;
import ru.sokolova.university.service.StudentDemonstrator;


public class _Main {
    public static void main(String[] args) {
        Professor prof1 = new Professor();
        University uni = new University();
        Student stud1 = new Student();
        prof1.setUniversity(uni);
        uni.setProfessor(prof1);
        uni.setStudent(stud1);
        stud1.setProfessor(prof1);
        stud1.setUniversity(uni);
        ProfessorDemonstrator professorDemonstrator = new ProfessorDemonstrator();
        StudentDemonstrator studentDemonstrator = new StudentDemonstrator();
        AttendDemonstrator attendDemonstrator = new AttendDemonstrator();
        attendDemonstrator.demonstrateAttend(stud1);
        attendDemonstrator.demonstrateAttend(prof1);
        studentDemonstrator.demonstratePass(stud1);
        professorDemonstrator.demonstrateEvaluate(prof1);
    }
}

