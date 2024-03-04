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

import java.time.LocalDateTime;
import java.util.Optional;

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
            link.setCreationDate(LocalDateTime.now());
            linkRepository.save( link );


            Comment comment = new Comment("body of comment", link);
            commentRepository.save( comment );
            link.addComment(comment);

            Optional<Link> optionalLink = linkRepository.findById(link.getId());
            Link retrievedLink = optionalLink.orElse(null); // Convert Optional<Link> to Link

            if (retrievedLink != null) {
                // Link was found, do something with it
                System.out.println( retrievedLink.getUrl() );
                System.out.println( retrievedLink.getCreationDate() );
            } else {
                // Link with the specified ID was not found
                System.out.println( "there is a problem in get this link !" );
            }
        };
    }

}
