package ua.profitsoft.lecture.docker.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.profitsoft.lecture.docker.data.StudentViewDto;
import ua.profitsoft.lecture.docker.service.StudentService;

import java.util.List;

/**
 * @author Anton Leliuk
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public List<StudentViewDto> list() {
        return studentService.list();
    }
}
