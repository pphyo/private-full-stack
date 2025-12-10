package tech.codoverse.java;

import tech.codoverse.java.models.domain.Gender;
import tech.codoverse.java.models.domain.Grade;
import tech.codoverse.java.models.domain.Student;
import tech.codoverse.java.repository.StudentRepo;
import tech.codoverse.java.utils.PrintTable;

public class StudentCrudApp {

    void main() {
        var madi = new Student();
        madi.setId(1);
        madi.setName("Madi");
        madi.setGender(Gender.FEMALE);
        madi.setGrade(Grade.G_FOUR);
        madi.setPhone("09200300400");

        var thuta = new Student();
        thuta.setId(2);
        thuta.setName("Nyan Thuta Tun");
        thuta.setGender(Gender.MALE);
        thuta.setGrade(Grade.G_SEVEN);
        thuta.setPhone("09400394294");

        StudentRepo repo = StudentRepo.getInstance();
        repo.save(madi);
        repo.save(thuta);

        var out = new PrintTable(repo.getAll());
        out.printTable();
    }

}