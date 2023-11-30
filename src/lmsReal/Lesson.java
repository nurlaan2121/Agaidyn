package lmsReal;

import java.time.LocalDate;
import java.util.Arrays;

public class Lesson {
    private long id;
    private String lessonName;
    private String techerFullMame;
    private String mentorsFullMame;
    private String descriptionLesson;
    private LocalDate dateStartLesson;
    private LocalDate dateFinishLesson;
    private boolean formatLesson;
    private Student [] students = new Student[0];

    public Lesson() {
    }

    public Lesson(String lessonName, String techerFullMame, String mentorsFullMame, String descriptionLesson, LocalDate dateStartLesson, LocalDate dateFinishLesson, boolean formatLesson, Student[] students,long id) {
        this.lessonName = lessonName;
        this.techerFullMame = techerFullMame;
        this.mentorsFullMame = mentorsFullMame;
        this.descriptionLesson = descriptionLesson;
        this.dateStartLesson = dateStartLesson;
        this.dateFinishLesson = dateFinishLesson;
        this.formatLesson = formatLesson;
        this.id = id;
        this.students = students;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public String getTecherFullMame() {
        return techerFullMame;
    }

    public void setTecherFullMame(String techerFullMame) {
        this.techerFullMame = techerFullMame;
    }

    public String getMentorsFullMame() {
        return mentorsFullMame;
    }

    public void setMentorsFullMame(String mentorsFullMame) {
        this.mentorsFullMame = mentorsFullMame;
    }

    public String getDescriptionLesson() {
        return descriptionLesson;
    }

    public void setDescriptionLesson(String descriptionLesson) {
        this.descriptionLesson = descriptionLesson;
    }

    public LocalDate getDateStartLesson() {
        return dateStartLesson;
    }

    public void setDateStartLesson(LocalDate dateStartLesson) {
        this.dateStartLesson = dateStartLesson;
    }

    public LocalDate getDateFinishLesson() {
        return dateFinishLesson;
    }

    public void setDateFinishLesson(LocalDate dateFinishLesson) {
        this.dateFinishLesson = dateFinishLesson;
    }

    public boolean isFormatLesson() {
        return formatLesson;
    }

    public void setFormatLesson(boolean formatLesson) {
        this.formatLesson = formatLesson;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "|  ID=" + id +
                "|  LessonName='" + lessonName + '\'' +
                "|  TecherFullMame='" + techerFullMame + '\'' +
                "|  MentorsFullMame='" + mentorsFullMame + '\'' +
                "|  DescriptionLesson='" + descriptionLesson + '\'' +
                "|  DateStartLesson=" + dateStartLesson +
                "|  DateFinishLesson=" + dateFinishLesson +
                "|  FormatLesson=" + formatLesson +
                "|  Students=" + Arrays.toString(students) + "\n";
    }
}
