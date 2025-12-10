package tech.codoverse.java.repository;

import tech.codoverse.java.models.domain.Student;

/**
 *
 * Student Repository for crud operation(save, update, delete, get)
 *
 * @author pphyo
 * @since 1.0
 */
public interface StudentRepo {

    public static final StudentRepo repo = new StudentRepoImpl();

    Student save(Student student);

    Student update(int id, Student newStudent);

    void delete(int id);

    Student get(int id);

    Student[] getAll();

    int size();

    static StudentRepo getInstance() {
        return repo;
    }

}
