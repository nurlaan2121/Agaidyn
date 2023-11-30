package lmsReal.servises;

import lmsReal.Database;
import lmsReal.GeneratorId;
import lmsReal.Group;
import lmsReal.Lesson;
import lmsReal.servises.Interface.Lessons;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LessonMethods implements Lessons {
    Lesson lessons = new Lesson();

    @Override
    public Group[] addLessontoGroup() {
        Lesson lesson = new Lesson();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write group name: ");
        String name11 = scanner.nextLine();
        for (int i = 0; i < Database.groups.length; i++) {
            if (name11.equalsIgnoreCase(Database.groups[i].getGroupName())) {
                while (true) {
                    System.out.println("Write lesson: ");
                    String nameLesson = scanner.nextLine();
                    if (nameLesson.length() > 3) {
                        lesson.setLessonName(nameLesson);
                        break;
                    }
                }
                while (true) {
                    System.out.println("Write deckription: ");
                    String nameLesson = scanner.nextLine();
                    if (nameLesson.length() > 3) {
                        lesson.setDescriptionLesson(nameLesson);
                        break;
                    }
                }
                while (true) {
                    System.out.println("Write full name mentor: ");
                    String nameLesson = scanner.nextLine();
                    if (nameLesson.length() > 3) {
                        lesson.setMentorsFullMame(nameLesson);
                        break;
                    }
                }
                while (true) {
                    System.out.println("Write date start lesson: (2023 4 15) ");
                    try {
                        lesson.setDateStartLesson(LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
                        break;
                    } catch (InputMismatchException | DateTimeException exception) {
                        System.out.println("DATA JAZ: ");
                        scanner.next();
                    }
                }
                while (true) {
                    try {
                        System.out.println("Write date finish: (2023 9 15)");
                        lesson.setDateFinishLesson(LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
                        break;

                    } catch (InputMismatchException | DateTimeException exception) {
                        System.out.println("Data jash");
                        scanner.next();
                    }
                }
                while (true) {
                    try {
                        System.out.println("Write format lesson (online||offline): ");
                        String online = scanner.nextLine();
                        if (online.equalsIgnoreCase("online")) {
                            lesson.setFormatLesson(true);
                            break;
                        } else if (online.equalsIgnoreCase("offline")) {
                            lesson.setFormatLesson(false);
                            break;
                        }
                    } catch (InputMismatchException exception) {
                        System.out.println("Data jash");
                    }
                }
                while (true) {
                    System.out.println("Write full name teacher: ");
                    String name = scanner.nextLine();
                    if (name.length() > 3) {
                        lesson.setTecherFullMame(name);
                        break;
                    }
                }
                lesson.setId(GeneratorId.generatorforlesson());
                lesson.setStudents(Database.groups[i].getStudents());
                Database.groups[i].setLessons(lesson);


                System.out.println("Success added!");
            }
        }
        return Database.groups;
    }

    @Override
    public void getLessonByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write name lesson: ");
        String name = scanner.nextLine();
        for (int i = 0; i < Database.groups.length; i++) {
            for (int j = 0; j < Database.groups[i].getLessons().length; j++) {
                if (name.equalsIgnoreCase(Database.groups[i].getLessons()[j].getLessonName())) {
                    System.out.println(Database.groups[i].getLessons()[j]);
                }
            }
        }
    }

    @Override
    public void getAlllessonByGroupName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write name group: ");
        String strin = scanner.nextLine();
        for (int i = 0; i < Database.groups.length; i++) {
            for (int j = 0; j < Database.groups[i].getLessons().length; j++) {
                if (strin.equalsIgnoreCase(Database.groups[i].getGroupName())) {
                    System.out.println(Arrays.toString(Database.groups[i].getLessons()));
                }
            }
        }
    }
    @Override
    public Group[] deleteLessonByID() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < Database.groups.length; i++) {
            System.out.println(Arrays.toString(Database.groups[i].getLessons()));
        }

        System.out.println("Write ID lesson for delete: ");
        long id = scanner.nextInt();
        for (int i = 0; i < Database.groups.length; i++) {
            Lesson[] lessons1 = Database.groups[i].getLessons();
            for (int j = 0; j < lessons1.length; j++) {
                if (lessons1[j].getId() == id){
                    for (int k = j; k < lessons1.length-1; k++) {
                        lessons1[k] = lessons1[k+1];
                    }
                    Database.groups[i].setLessonss111(Arrays.copyOf(lessons1,lessons1.length-1));
                    break;
                }
            }
        }
        return Database.groups;
    }

    @Override
    public Group[] deleteGroupByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write name group for delete");
        String name = scanner.nextLine();
        for (int i = 0; i < Database.groups.length; i++) {
            if (name.equalsIgnoreCase(Database.groups[i].getGroupName())) {
                for (int j = i; j < Database.groups.length - 1; j++) {
                    Database.groups[j] = Database.groups[j + 1];
                }
            }
        }
        return Database.groups = Arrays.copyOf(Database.groups, Database.groups.length - 1);
    }

    @Override
    public void getAllLessonStudenta() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write email student:");
        String name = scanner.nextLine();
        for (int i = 0; i < Database.groups.length; i++) {
            for (int k = 0; k < Database.groups[i].getStudents().length; k++) {
                if (Database.groups[i].getStudents()[k].getEmail().equalsIgnoreCase(name)) {
                    for (int j = 0; j < Database.groups[i].getLessons().length; j++) {
                        System.out.println(Database.groups[i].getLessons()[j].getLessonName());
                    }
                }
            }
        }
    }
}
