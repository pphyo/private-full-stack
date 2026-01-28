package tech.codoverse.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

import tech.codoverse.model.entities.BaseEntity;

public class Repository<T extends BaseEntity> {

    private List<T> database = new ArrayList<>();

    public void save(T item) {
        database.add(Objects.requireNonNull(item));
    }

    public void delete(String id) {
        database.stream()
                .filter(i -> i.getId().equals(id))
                .findFirst()
                .ifPresent(i -> database.remove(database.indexOf(i)));
    }

    public List<T> findAll() {
        return Collections.unmodifiableList(database);
    }

    public Optional<T> findById(String id) {
        return database.stream().filter(i -> i.getId().equals(id)).findFirst();
    }

    public Stream<T> stream() {
        return database.stream();
    }
}
