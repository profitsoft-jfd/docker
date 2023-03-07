package ua.profitsoft.lecture.docker.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ua.profitsoft.lecture.docker.data.StudentViewDto;
import ua.profitsoft.lecture.docker.domain.Student;

/**
 * @author Anton Leliuk
 */
@Mapper
public interface StudentViewMapper {

    StudentViewMapper INSTANCE = Mappers.getMapper(StudentViewMapper.class);

    StudentViewDto convert(Student student);
}
