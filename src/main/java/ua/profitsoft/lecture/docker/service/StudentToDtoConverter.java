package ua.profitsoft.lecture.docker.service;

import org.springframework.stereotype.Component;
import ua.profitsoft.lecture.docker.data.StudentViewDto;
import ua.profitsoft.lecture.docker.domain.Student;

/**
 * @author Anton Leliuk
 */
@Component
public class StudentToDtoConverter {

    public StudentViewDto convert(Student s) {
        return new StudentViewDto(s.getId(), s.getSurname(), s.getName(), s.getBirthDate());
    }
}
