package goorm.attendancebook.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseSessionDto {
    private String course;
    private LocalDate date;
    private List<PlayerSessionDto> students;
}