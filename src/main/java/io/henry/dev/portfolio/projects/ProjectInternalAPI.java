package io.henry.dev.portfolio.projects;

import io.henry.dev.portfolio.projects.model.projections.BasicInformation;

import java.util.Set;

public interface ProjectInternalAPI {

    Set<ProjectDTO> getProjectsByUserId(Long userId);
}
