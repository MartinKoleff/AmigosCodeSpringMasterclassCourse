package com.koleff.coursePractise.jsonplaceholder;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(
        value = "jsonplaceholder",
        url = "https://jsonplaceholder.typicode.com/"
)
public interface JsonPlaceHolderClient {
    @RequestMapping(
            path = "posts",
            method = RequestMethod.GET
    )
    List<Post> getPosts();

    @RequestMapping(
            path = "posts/{postId}",
            method = RequestMethod.GET
    )
    Post getPost(@PathVariable("postId") Integer postId);

}
