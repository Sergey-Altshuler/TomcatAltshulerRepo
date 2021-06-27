package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table (name = "reportCard")
@Entity (name = "reportCard")
public class ReportCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String student_name;
    @Column
    private String student_surname;
    @Column
    private String course_name;
    @Column
    private String coachYouHaveWorked;
    @Column
    private int mark;
    @Column
    private String review;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReportCard that = (ReportCard) o;
        return id == that.id && mark == that.mark && Objects.equals(student_name, that.student_name) && Objects.equals(student_surname, that.student_surname) && Objects.equals(course_name, that.course_name) && Objects.equals(coachYouHaveWorked, that.coachYouHaveWorked) && Objects.equals(review, that.review);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, student_name, student_surname, course_name, coachYouHaveWorked, mark, review);
    }

    @Override
    public String toString() {
        return "Report_Card{" +
                "id=" + id +
                ", student_name='" + student_name + '\'' +
                ", student_surname='" + student_surname + '\'' +
                ", course_name='" + course_name + '\'' +
                ", coachYouHaveWorked='" + coachYouHaveWorked + '\'' +
                ", mark=" + mark +
                ", review='" + review + '\'' +
                '}';
    }
}
