package ua.profitsoft.lecture.docker.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.profitsoft.lecture.docker.domain.Student;

/**
 * @author Anton Leliuk
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
