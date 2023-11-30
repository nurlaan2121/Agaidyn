package lmsReal.servises.Interface;

import lmsReal.Group;
import lmsReal.Student;

public interface Students {
    Group[] addStudentToGroup();
    Group[] updateInfoStudent();
    void getStudentbyFirsName();
    void getAllStudentsbyGruopName();
    void getallStudentsLessons();
    Group [] deleteStudentbyEmail();

}
