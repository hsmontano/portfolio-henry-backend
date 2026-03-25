package io.henry.dev.portfolio.projects.mapper;

import io.henry.dev.portfolio.projects.ProjectDTO;
import io.henry.dev.portfolio.projects.model.ProjectEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProjectMapper {

    ProjectDTO projectToProjectDTO(ProjectEntity project);
    ProjectEntity projectDTOToProject(ProjectDTO projectDTO);
}
