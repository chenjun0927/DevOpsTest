package com.devops.DevOpsTest.student.controller;

import com.devops.DevOpsTest.student.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest
public class StudentControllerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void givenStudentInfo_whenGetStudent_thenStatus200()
            throws Exception {


        mvc.perform(get("/student")
                        .contentType(MediaType.ALL))
                .andExpect(status().isOk())
                .andExpect(content()
                        .contentTypeCompatibleWith(MediaType.APPLICATION_JSON));//.
                //andExpect(ResultMatcher("$[0].name", is("Peter")));
    }
}
