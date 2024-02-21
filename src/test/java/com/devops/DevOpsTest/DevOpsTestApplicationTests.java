package com.devops.DevOpsTest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
class DevOpsTestApplicationTests {

	@Autowired
	private MockMvc mvc;

	@Test
	public void givenStudentInfo_whenGetStudent_thenStatus200()
			throws Exception {


		mvc.perform(get("/student")
						.contentType(MediaType.ALL))
				.andExpect(status().isOk())
				.andExpect(content()
						.contentTypeCompatibleWith(MediaType.APPLICATION_JSON));
	}
}
