package whz.pti.eva.praktikum_02.grade.boundary;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import whz.pti.eva.praktikum_02.grade.domain.Grade;
import whz.pti.eva.praktikum_02.grade.service.GradeService;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class GradeController {

    @Resource
    private GradeService gradeService;

    @RequestMapping(value = "/grades")
    public String listAllGrades(Model model) {
        List<Grade> listOfGrades =  gradeService.listAllGrades();
        double average = gradeService.calculateAverage();

        model.addAttribute("listOfGrades", listOfGrades);
        model.addAttribute("average", average);

        return "grades";

    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addPost(@RequestParam String lecture, @RequestParam String grade, Model model) {

        model.addAttribute("lecture", lecture);
        model.addAttribute("grade", grade);
        gradeService.addGrade(lecture, grade);
        return "redirect:grades";
    }



}
