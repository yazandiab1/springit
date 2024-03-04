package com.yazan.springit.controller;

import com.yazan.springit.domain.Link;
import com.yazan.springit.repository.LinkRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//@RestController

@Controller
@RequestMapping("/links")
public class LinkController {

    @GetMapping("/foo")
    public String foo(Model model) {
        model.addAttribute("pageTitle","Foo page");
        return "foo";
    }

//    private LinkRepository linkRepository;
//    public  LinkController(LinkRepository linkRepository) {
//        this.linkRepository = linkRepository;
//    }
//
//    @GetMapping("/")
//    public List<Link> list() {
//        return linkRepository.findAll();
//    }
//
//    @PostMapping("/create")
//    public Link create(@ModelAttribute Link link) {
//        return linkRepository.save(link);
//    }
//
//    @GetMapping("/{id}")
//    public Optional<Link> read(@PathVariable Long id) {
//        return linkRepository.findById(id);
//    }
//
//    @PutMapping("/{id}")
//    public Link update(@PathVariable long id, @ModelAttribute Link link) {
//        return linkRepository.save(link);
//    }
//
//    @DeleteMapping("/{id}")
//    public void delete(@PathVariable Long id) {
//        linkRepository.deleteById(id);
//    }


}
