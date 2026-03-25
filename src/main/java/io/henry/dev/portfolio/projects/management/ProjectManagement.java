package io.henry.dev.portfolio.projects.management;

import io.henry.dev.portfolio.projects.ProjectDTO;
import io.henry.dev.portfolio.projects.ProjectExternalAPI;
import io.henry.dev.portfolio.projects.ProjectInternalAPI;
import io.henry.dev.portfolio.projects.mapper.ProjectMapper;
import io.henry.dev.portfolio.projects.model.ProjectEntity;
import io.henry.dev.portfolio.projects.model.projections.BasicInformation;
import io.henry.dev.portfolio.projects.repository.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class ProjectManagement implements ProjectExternalAPI, ProjectInternalAPI {

    private final ProjectRepository projectRepository;
    private final ProjectMapper projectMapper;

    public ProjectManagement(ProjectRepository projectRepository,  ProjectMapper projectMapper) {
        this.projectRepository = projectRepository;
        this.projectMapper = projectMapper;
    }

    @Override
    public ProjectDTO addProject(ProjectDTO project) {
        if (project.id() != null) {
            ProjectEntity existing = projectRepository.findById(project.id())
                    .orElseThrow(() -> new IllegalArgumentException("Project not found: " + project.id()));
            return projectMapper.projectToProjectDTO(projectRepository.save(existing));
        } else {
            ProjectEntity projectEntity = projectMapper.projectDTOToProject(project);
            return projectMapper.projectToProjectDTO(projectRepository.save(projectEntity));
        }

    }

    @Override
    public Set<ProjectDTO> getProjectsByUserId(Long userId) {
        return this.projectRepository.findByUserId(userId)
                .stream()
                .map(projectMapper::projectToProjectDTO)
                .collect(Collectors.toSet());
    }
}
