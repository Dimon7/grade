package whz.pti.eva.praktikum_02.grade.domain;


import javax.persistence.*;

@Entity
@Table(name="Grade_table")
public class Grade {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String lecture;
    private String grade;

    public Grade(){}

    public Grade(String lecture, String grade){
        this.lecture = lecture;
        this.grade = grade;
    }

    public String getLecture() {
        return lecture;
    }

    public String getGrade() {
        return grade;
    }


}
