package lmsReal.servises.Interface;

import lmsReal.Group;
import lmsReal.Lesson;
import lmsReal.servises.LessonMethods;

public interface Lessons {
    Group []  addLessontoGroup();
    void getLessonByName();
    void getAlllessonByGroupName();
    Group []deleteLessonByID();
    Group [] deleteGroupByName();
    void getAllLessonStudenta();

}
