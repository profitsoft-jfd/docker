package ua.profitsoft.lecture.docker.data;

import java.time.LocalDate;

/**
 * @author Anton Leliuk
 */
public record StudentViewDto(Long id, String surname, String name, LocalDate birthDate) {
}
