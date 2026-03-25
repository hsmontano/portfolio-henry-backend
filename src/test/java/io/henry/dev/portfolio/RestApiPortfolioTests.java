/*package io.henry.dev.portfolio;

import io.henry.dev.portfolio.projects.ProjectDTO;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class RestApiPortfolioTests {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    @Order(1)
    void shouldAddNewProject() {
        ProjectDTO project = new ProjectDTO(null, "Project 1", "Link 1", "Description 1", "Image 1", null);
        project = restTemplate.postForObject("/api/projects", project, ProjectDTO.class);
        assertNotNull(project.id());
    }

}*/
