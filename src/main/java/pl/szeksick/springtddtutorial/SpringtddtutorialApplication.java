package pl.szeksick.springtddtutorial;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringtddtutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringtddtutorialApplication.class, args);
	}

    @Bean
    public CommandLineRunner setup(ToDoRepository toDoRepository) {
        return (args) -> {
            toDoRepository.save(new ToDo("Dodać nowy test", true));
            toDoRepository.save(new ToDo("Test przechodzi negatywnie", true));
            toDoRepository.save(new ToDo("Modyfikacja kodu", false));
            toDoRepository.save(new ToDo("Test przechodzi pozytywnie", true));
        };
    }

}
