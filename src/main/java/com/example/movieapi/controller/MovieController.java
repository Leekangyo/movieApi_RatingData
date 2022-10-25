package com.example.movieapi.controller;

import com.example.movieapi.dto.MoviesResponseDto;
import com.example.movieapi.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class MovieController {

    private final MovieService movieService;

    @GetMapping(value = "/")
    public String movieSearch(){
        return "movie/movieSearch";
    }

    @RequestMapping(value = "/movie", method = RequestMethod.GET)
    public @ResponseBody MoviesResponseDto movieResult(@RequestParam("keyword") String text){
        return movieService.getInfo(text);
    }
}
