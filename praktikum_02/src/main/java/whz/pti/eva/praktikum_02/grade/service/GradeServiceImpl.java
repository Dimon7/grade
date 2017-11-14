package whz.pti.eva.praktikum_02.grade.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import whz.pti.eva.praktikum_02.grade.domain.Grade;
import whz.pti.eva.praktikum_02.grade.domain.GradeRepository;

import java.util.List;

@Service
public class GradeServiceImpl implements GradeService{

    @Autowired
    private GradeRepository gradeRepository;


    @Override
    public List<Grade> listAllGrades() {
        return gradeRepository.findAll();
    }

    @Override
    public void addGrade(String lecture, String grade) {
        Grade g = new Grade(lecture, grade);

        gradeRepository.save(g);
    }

    @Override
    public double calculateAverage() {
        double sum = 0;
        int i = 0;
        List<Grade> gr = gradeRepository.findAll();

        for (; i < gr.size(); i++){
            sum += Double.parseDouble( gr.get(i).getGrade() );
        }

        return sum/i;
    }




}
