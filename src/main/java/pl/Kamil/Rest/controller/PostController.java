package pl.Kamil.Rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.Kamil.Rest.model.Post;

import java.util.List;

@RestController

public class PostController {

    @GetMapping("/posts")
    public List<Post> getPosts(){
        throw new IllegalArgumentException("Not implemented yet!");         // jesli nie mamy jeszcze implemtentacji
    }

    @GetMapping("/posts/{id}")
    public Post getSinglePost(@PathVariable long id){
        throw new IllegalArgumentException("Not implemented yet!");         // jesli nie mamy jeszcze implemtentacji
    }


}
