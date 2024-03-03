package com.yazan.springit.repository;

import com.yazan.springit.domain.Link;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LinkRepository extends JpaRepository<Link,Long> {

    Link findByTitle(String title);

}
