package whz.pti.eva.praktikum_02.grade.service;

import whz.pti.eva.praktikum_02.grade.domain.Grade;

import java.util.List;

public interface GradeService {

    List<Grade> listAllGrades();
    void addGrade(String lecture, String grade);
    double calculateAverage();


}
