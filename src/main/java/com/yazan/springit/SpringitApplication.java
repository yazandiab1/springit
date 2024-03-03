package com.yazan.springit;

import com.yazan.springit.domain.Comment;
import com.yazan.springit.domain.Link;
import com.yazan.springit.repository.CommentRepository;
import com.yazan.springit.repository.LinkRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringitApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringitApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(LinkRepository linkRepository, CommentRepository commentRepository) {
        return  args -> {
            Link link = new Link("first title","first url");
            linkRepository.save( link );

            Comment comment = new Comment("body of comment", link);
            commentRepository.save( comment );
            link.addComment(comment);


        };
    }

}
