package com.devsuperior.movieflix.services;

import com.devsuperior.movieflix.dto.MovieDTO;
import com.devsuperior.movieflix.entities.Movie;
import com.devsuperior.movieflix.repositories.MovieRepository;
import com.devsuperior.movieflix.services.exceptions.ResourceNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class MovieService {

    private static Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private MovieRepository repository;

    @Transactional(readOnly = true)
    public MovieDTO findById(Long id) {
        Optional<Movie> productObj = repository.findById(id);
        Movie entity = productObj.orElseThrow(() -> new ResourceNotFoundException("Entity not Found"));
        return new MovieDTO(entity);
    }
}
