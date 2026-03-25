package io.henry.dev.portfolio.projects.repository;

import io.henry.dev.portfolio.projects.model.ProjectEntity;
import io.henry.dev.portfolio.projects.model.projections.BasicInformation;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface ProjectRepository extends CrudRepository<ProjectEntity, Long> {
    Set<ProjectEntity> findByUserId(Long userId);
}
