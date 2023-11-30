package lmsReal;

import lmsReal.servises.Interface.Lessons;

import java.util.Arrays;

public class Group {
    private long id;
    private String groupName;
    private String groupDescription;
    private String lenguage;
    private Lesson [] lessons = new Lesson[0];
    public Student [] students = new Student[0];

    public Group() {
    }

    public Group(String groupName, String groupDescription, Lesson[] lessons, Student[] students,String lenguage,long id) {
        this.groupName = groupName;
        this.groupDescription = groupDescription;
        this.lessons = lessons;
        this.students = students;
        this.lenguage = lenguage;
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupDescription() {
        return groupDescription;
    }

    public void setGroupDescription(String groupDescription) {
        this.groupDescription = groupDescription;
    }

    public Lesson[] getLessons() {
        return lessons;
    }

    public void setLessons(Lesson lesson) {
        lessons = Arrays.copyOf(lessons,lessons.length+1);
        lessons[lessons.length-1] = lesson;
    }
    public void setLessonss111(Lesson [] lessonss ){
        this.lessons =  lessonss;

    }
    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student student) {
        students = Arrays.copyOf(students,students.length+1);
        students[students.length-1] = student;
    }
    public void setStudents111(Student[] students){
        this.students = students;

    }    public String getLenguage() {
        return lenguage;
    }

    public void setLenguage(String lenguage) {
        this.lenguage = lenguage;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Group{" +
                "|  GroupName='" + groupName + '\'' +
                "|  GroupDescription='" + groupDescription + '\'' +
                "|  Lenguage='" + lenguage + '\'' +
                "|  Lessons=" + Arrays.toString(lessons) +
                "|  Students=" + Arrays.toString(students) + "\n";
    }
}
