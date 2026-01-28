package tech.codoverse.model.entities;

import java.time.LocalDateTime;
import java.util.UUID;

public abstract class BaseEntity {

    private String id;
    private LocalDateTime createdAt;

    public BaseEntity() {
        this.id = UUID.randomUUID().toString();
        this.createdAt = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

}
