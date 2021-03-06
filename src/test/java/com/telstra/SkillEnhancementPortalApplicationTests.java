package com.telstra;

import com.telstra.model.Question;
import com.telstra.model.Tag;
import com.telstra.model.User;
import com.telstra.repository.QuestionRepository;
import com.telstra.repository.TagRepository;
import com.telstra.repository.UserRepository;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class SkillEnhancementPortalApplicationTests {

    @Autowired
    UserRepository userRepository;

    @Autowired
    TagRepository tagRepository;

    @Test
    @Order(1)
    public void testFindByUsername() {
        String username = "aniket";
        User p = userRepository.findByUsername(username).get();
        assertEquals(username, p.getUsername());
    }

    @Test
    @Order(2)
    public void testReadAll() {
        List list = userRepository.findAll();
        assertEquals(true, (list).size() > (0));
    }

    @Test
    @Order(3)
    public void testFindById() {
        User u = userRepository.findById(4L).get();
        assertEquals("aniket@gmail.com", u.getEmail());
    }


    @Test
    @Order(4)
    public void testFindByTagId() {
        Long tag = 3L;
        Tag t = tagRepository.findById(tag).get();
        assertNotNull(t.getName());
    }

    @Test
    @Order(5)
    public void testReadAllTag() {
        List list = tagRepository.findAll();
        assertEquals(true, (list).size() > (0));
    }

    @Autowired
    QuestionRepository questionRepository;

    @Test
    @Order(6)
    public void testReadAllQuestion() {
        List list = questionRepository.findAll();
        assertEquals(true, (list).size() > (0));
    }

    @Test
    @Order(7)
    public void testFindByQuestionId() {
        Question question = questionRepository.findById(4L).get();
    }
}
