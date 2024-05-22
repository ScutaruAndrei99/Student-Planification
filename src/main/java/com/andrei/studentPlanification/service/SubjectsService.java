package com.andrei.studentPlanification.service;

import com.andrei.studentPlanification.dto.SubjectsDto;
import lombok.AllArgsConstructor;
import com.andrei.studentPlanification.mapper.SubjectsMapper;
import com.andrei.studentPlanification.model.Subjects;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import com.andrei.studentPlanification.repository.SubjectsRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class SubjectsService {

    private SubjectsRepository subjectsRepository;

    public List<SubjectsDto> getAllSubjects() {
        return subjectsRepository.findAll()
                .stream()
                .map(SubjectsMapper.mapper::convertEntityToDto)
                .toList();
    }

    public List<SubjectsDto> getSubjectsById(int id) {
        return subjectsRepository.findById(id)
                .stream()
                .map(SubjectsMapper.mapper::convertEntityToDto)
                .toList();
    }

    public void modifySubjects(int id, SubjectsDto newSubjectDto) {
        Subjects existingSujbect = subjectsRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Does not exist!"));

        Subjects newSubjects = SubjectsMapper.mapper.convertDtoToEntity(newSubjectDto);
        existingSujbect.setNameSubject(newSubjects.getNameSubject());
        existingSujbect.setYearId(newSubjectDto.getYear_id());
        subjectsRepository.save(existingSujbect);
    }

    public String deleteSubjectsById(int id) {
        Optional<Subjects> subjects = subjectsRepository.findById(id);
        if (subjects.isPresent()) {
            subjectsRepository.deleteById(id);
            return "Deleted";
        } else {
            return "Not Found";
        }
    }

    public void deleteAllSubjects() {
        subjectsRepository.deleteAll();
    }
}
