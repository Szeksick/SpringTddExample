package pl.szeksick.springtddtutorial;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ToDoServiceTest {

    @Autowired
    private ToDoRepository toDoRepository;

    @Test
    void getAllToDos(){
        ToDo todoSample = new ToDo("Do zrobienia przyklad 1", true);
        toDoRepository.save(todoSample);
        ToDoService toDoService = new ToDoService(toDoRepository);

        ToDo firstToDo = toDoService.findAll().get(0);

        assertEquals(todoSample.getText(), firstToDo .getText());
        assertEquals(todoSample.isCompleted(), firstToDo .isCompleted());
        assertEquals(todoSample.getId(), firstToDo .getId());
    }
}
