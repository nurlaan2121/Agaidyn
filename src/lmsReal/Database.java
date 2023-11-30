package lmsReal;

import lmsReal.servises.Interface.Lessons;

import java.util.Arrays;

public class Database {
    public static Group [] groups = new Group[0];

    public Database() {
    }
    @Override
    public String toString() {
        return "Database{" +
                ", groups=" + Arrays.toString(groups) +
                '}';
    }
}
