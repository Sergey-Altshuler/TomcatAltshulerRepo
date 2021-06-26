package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table  (name = "coaches")
@Entity (name = "coach")
public class Coach implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String nameAndSurname;
    @ManyToOne (cascade = CascadeType.PERSIST)
    @JoinColumn(name = "course_id")
    private Course course;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coach coach = (Coach) o;
        return id == coach.id && Objects.equals(nameAndSurname, coach.nameAndSurname) && Objects.equals(course, coach.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameAndSurname, course);
    }

    @Override
    public String toString() {
        return "Coach{" +
                "id=" + id +
                ", nameAndSurname='" + nameAndSurname + '\'' +
                ", course=" + course.getTitle() +
                '}';
    }
}
