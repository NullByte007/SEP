package com.telstra;

import com.telstra.model.User;
import com.telstra.repository.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;
import java.util.Optional;

@SpringBootTest
public class SEPTests {

    @Autowired
    UserRepository userRepository;

    // User Entity Test cases
    // =======================================================================
    @Test
    public void testGetAllUsers(){
        List ulist = userRepository.findAll();
        assertEquals(true, (ulist).size() > 0);
    }

    @Test
    public void testFindUser(){
        String username="aniket";
        User u = userRepository.findByUsername(username).get();
        assertEquals(username,u.getUsername());
    }

    @Test
    public void testUserProfile(){

    }
    @Test
    public void testIncrementUserPoints(){


    }
    @Test
    public void testFindByUsername(){
        String username="aniket";
        User u = userRepository.findByUsername(username).get();
        assertEquals(username,u.getUsername());
    }
    @Test
    public void testFindByEmail(){
        String u_email= "aniket@gmail.com";
        User u = userRepository.findByEmail(u_email).get();
        assertEquals(u_email,u.getEmail());

    }
    @Test
    public void testExistsByEmail(){

    }
    // =======================================================================


    // Comment Entity
    @Autowired
    CommentRepository commentRepository;
    @Test
    public void testCreateComment(){

    }
    @Test
    public void testCommentUpVote(){

    }
    @Test
    public void testCommentDownVote(){

    }

    @Test
    public void testSelectComment(){

    }
    // =======================================================================


    // Followers Entity
    @Autowired
    FollowersRepository followersRepository;

    @Test
    public void testFollow(){

    }
    @Test
    public void testGetFollowers(){

    }

    @Test
    public void testGetFollowing(){

    }

    // =======================================================================

    // Notification
    @Autowired
    NotificationRepository notificationRepository;

    @Test
    public void testSendNotification(){

    }

    @Test
    public void testGetNotification(){

    }

    // =======================================================================

    // Question Entity
    @Autowired
    QuestionRepository questionRepository;

    @Test
    public void testCreateQuestion(){

    }

    @Test
    public void testGetQues(){

    }

    @Test
    public void testGetQuesById(){

    }

    @Test
    public void testQuestionUpVote(){

    }
    @Test
    public void testQuestionDownVote(){

    }

    @Test
    public void testSearchQuestion(){

    }

    // =======================================================================

    // Spam
    @Autowired
    SpamRepository spamRepository;

    @Test
    public void testReportSpam(){

    }

    @Test
    public void testGetSpam(){

    }

    // =======================================================================


    // Tag
    @Autowired
    TagRepository tagRepository;

    @Test
    public void testCreateTag(){

    }

    @Test
    public void testGetAllTags(){

    }

    @Test
    public void testGetTabById(){

    }


}
