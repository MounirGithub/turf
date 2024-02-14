package com.coursemanager;

import com.coursemanager.controller.CourseController;
import com.coursemanager.model.Course;
import com.coursemanager.model.Partant;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
@AutoConfigureMockMvc
public class CourseControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper;

	@Test
	public void creerCourse_ShouldReturnCourse() throws Exception {
		// Création d'un objet Course de test
		Course course = new Course();
		course.setNom("avengers");
		course.setNumero("75");
		course.setDate(LocalDate.of(4212, 12, 12));
		List<Partant> partants = Arrays.asList(
				new Partant("joe", 1),
				new Partant("batman", 3),
				new Partant("spiderman", 6)
		);
		course.setPartants(partants);

		// Envoi de la requête POST avec l'objet Course converti en JSON
		mockMvc.perform(MockMvcRequestBuilders.post("/courses/sendCourse")
						.contentType(MediaType.APPLICATION_JSON)
						.content(objectMapper.writeValueAsString(course)))
				.andExpect(MockMvcResultMatchers.status().isCreated())
				.andExpect(MockMvcResultMatchers.jsonPath("$.nom").value("avengers"))
				.andExpect(MockMvcResultMatchers.jsonPath("$.numero").value("75"))
				.andExpect(MockMvcResultMatchers.jsonPath("$.partants.length()").value(3))
				.andExpect(MockMvcResultMatchers.jsonPath("$.partants[0].nom").value("joe"))
				.andExpect(MockMvcResultMatchers.jsonPath("$.partants[0].numero").value(1))
				.andExpect(MockMvcResultMatchers.jsonPath("$.partants[1].nom").value("batman"))
				.andExpect(MockMvcResultMatchers.jsonPath("$.partants[1].numero").value(3))
				.andExpect(MockMvcResultMatchers.jsonPath("$.partants[2].nom").value("spiderman"))
				.andExpect(MockMvcResultMatchers.jsonPath("$.partants[2].numero").value(6));
	}
}
