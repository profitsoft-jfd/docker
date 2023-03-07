package ua.profitsoft.lecture.docker.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.profitsoft.lecture.docker.dao.StudentRepository;
import ua.profitsoft.lecture.docker.data.StudentViewDto;
import ua.profitsoft.lecture.docker.mapper.StudentViewMapper;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Anton Leliuk
 */
@Slf4j
@RequiredArgsConstructor
@Service
public class StudentService {
    private final StudentRepository repository;

    @Transactional(readOnly = true)
    public List<StudentViewDto> list() {
        return repository.findAll()
                .stream()
                .map(StudentViewMapper.INSTANCE::convert)
                .collect(Collectors.toList());
    }
}
