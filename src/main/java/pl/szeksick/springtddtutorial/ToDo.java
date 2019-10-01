package pl.szeksick.springtddtutorial;

import javax.persistence.Entity;

@Entity
public class ToDo {
    private Long id;
    private String text;
    private boolean completed;

    public ToDo(Long id, String text, boolean completed) {
        this.id = id;
        this.text = text;
        this.completed = completed;
    }
}
