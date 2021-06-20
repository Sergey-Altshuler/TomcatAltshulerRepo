package com.example.supply;

import com.example.model.Coach;
import com.example.model.Student;
import com.example.model.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeneratorForDB {
    private final static List<Coach> coachList = new ArrayList<>();
    private final static List<Student> studentList = new ArrayList<>();
    private final static List<Task> taskList = new ArrayList<>();

    private final static List<String> names = List.of("Сергей", "Андрей", "Дима", "Гена", "Павел", "Денис", "Илья", "Егор", "Михаил");
    private final static List<String> titles = List.of("C++", "Ruby", "Android", "Java", "JS", "Pascal", "HTML-CSS", "Ruby");
    private final static List<String> difficulties = List.of("very easy", "easy", "medium", "hard", "extremely hard");
    private final static List<String> profLevels = List.of("middle", "middle+", "senior", "senior+");
    private final static List<String> descriptions = List.of("write a program", "fix bugs", "create an application");

    public static List<Coach> getCoachList() {
        return coachList;
    }

    public static List<Student> getStudentList() {
        return studentList;
    }

    public static List<Task> getTaskList() {
        return taskList;
    }

    public static void generate() {
        generateCoach(new Random().nextInt(10) + 10);
        generateTask(new Random().nextInt(10) + 10);
        generateStudent(new Random().nextInt(10) + 10);
    }

    private static void generateCoach(int number) {
        for (int i = 0; i < number; i++) {
            String name = names.get(new Random().nextInt(names.size()));
            int salary = new Random().nextInt(2500) + 1000;
            String profLevel = profLevels.get(new Random().nextInt(profLevels.size()));
            coachList.add(Coach.builder().name(name).salary(salary).profLevel(profLevel).build());
        }
    }

    private static void generateStudent(int number) {
        for (int i = 0; i < number; i++) {
            String name = names.get(new Random().nextInt(names.size()));
            int age = new Random().nextInt(20) + 20;
            studentList.add(Student.builder().name(name).age(age).build());
        }
    }

    private static void generateTask(int number) {
        for (int i = 0; i < number; i++) {
            String title = titles.get(new Random().nextInt(titles.size()));
            String difficulty = difficulties.get(new Random().nextInt(difficulties.size()));
            String description = descriptions.get(new Random().nextInt(descriptions.size()));
            taskList.add(Task.builder().title(title).description(description).difficulty(difficulty).build());
        }
    }
}
