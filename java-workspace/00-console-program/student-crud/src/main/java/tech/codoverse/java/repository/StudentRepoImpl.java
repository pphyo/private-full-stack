package tech.codoverse.java.repository;

import java.util.Arrays;

import tech.codoverse.java.models.domain.Student;
import tech.codoverse.java.utils.StudentUtils;

public class StudentRepoImpl implements StudentRepo {

    private Student[] database = new Student[0];

    StudentRepoImpl() {
    }

    @Override
    public Student save(Student student) {
        // get original length
        int originalLength = database.length;

        // create temp array with + 1 length from database
        var temp = Arrays.copyOf(database, originalLength + 1);

        // insert to last index
        temp[temp.length - 1] = student;

        // change ref
        database = temp;

        // return inserted data
        return temp[temp.length - 1];
    }

    @Override
    public Student update(int id, Student newStudent) {
        return database[getIndex(id)] = newStudent;
    }

    @Override
    public void delete(int id) {

        var index = getIndex(id);
        StudentUtils.checkIndex(index);

        var temp = new Student[database.length - 1];

        for (int i = 0; i < temp.length; i++) {
            if (index == i) {
                continue;
            } else if (index > i) {
                temp[i] = database[i];
            } else {
                temp[i] = database[i - 1];
            }
        }
        database = temp;
    }

    @Override
    public Student get(int id) {
        return database[getIndex(id)];
    }

    @Override
    public Student[] getAll() {
        Student[] result = database;
        return result;
    }

    @Override
    public int size() {
        return database.length;
    }

    private int getIndex(int id) {
        for (int i = 0; i < database.length; i++) {
            if (database[i].getId() == id)
                return i;
        }
        return -1;
    }

}
