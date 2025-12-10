package tech.codoverse.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import tech.codoverse.java.models.domain.Gender;
import tech.codoverse.java.models.domain.Grade;
import tech.codoverse.java.models.domain.Student;
import tech.codoverse.java.repository.StudentRepo;

@TestMethodOrder(OrderAnnotation.class)
public class StudentServiceTest {

    private StudentRepo repo = StudentRepo.getInstance();

    @Test
    @Order(1)
    void testForSave() {
        var madi = new Student();
        madi.setId(1);
        madi.setName("Madi");
        madi.setGender(Gender.FEMALE);
        madi.setGrade(Grade.G_FOUR);
        madi.setPhone("09200300400");

        var savedMadi = repo.save(madi);

        assertNotNull(savedMadi);

        assertEquals(madi.getId(), savedMadi.getId());
        assertEquals(madi.getName(), savedMadi.getName());
        assertEquals(madi.getGender(), savedMadi.getGender());
        assertEquals(madi.getGrade(), savedMadi.getGrade());
        assertEquals(madi.getPhone(), savedMadi.getPhone());

        assertEquals(1, repo.size());

        var thuta = new Student();
        thuta.setId(2);
        thuta.setName("Thuta");
        thuta.setGender(Gender.MALE);
        thuta.setGrade(Grade.G_SEVEN);
        thuta.setPhone("09400394294");

        var savedThuta = repo.save(thuta);

        assertNotNull(savedThuta);

        assertEquals(thuta.getId(), savedThuta.getId());
        assertEquals(thuta.getName(), savedThuta.getName());
        assertEquals(thuta.getGender(), savedThuta.getGender());
        assertEquals(thuta.getGrade(), savedThuta.getGrade());
        assertEquals(thuta.getPhone(), savedThuta.getPhone());

        assertEquals(2, repo.size());

    }

    @Test
    void test() {
        assertEquals(2, repo.size());

        repo.delete(2);

        assertEquals(1, repo.size());

        repo.delete(1);

        assertEquals(0, repo.size());

        Executable exec = new Executable() {
            @Override
            public void execute() throws Throwable {
                repo.delete(1);
            }
        };

        assertThrows(IllegalArgumentException.class, exec);
    }

}
