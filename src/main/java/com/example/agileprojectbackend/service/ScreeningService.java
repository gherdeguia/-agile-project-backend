package com.example.agileprojectbackend.service;

import com.example.agileprojectbackend.model.Movie;
import com.example.agileprojectbackend.model.Screening;
import com.example.agileprojectbackend.model.Seat;
import com.example.agileprojectbackend.repository.MovieRepository;
import com.example.agileprojectbackend.repository.ScreeningRepository;
import com.example.agileprojectbackend.repository.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScreeningService {
    @Autowired
    private ScreeningRepository screeningRepository;
    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private SeatRepository seatRepository;

    public List<Screening> getAllScreeningService() {
        return screeningRepository.findAll();
    }

    public Screening getScreeningById (Integer screening_id){
        return screeningRepository.findById(screening_id).orElseThrow(null);
    }

    public List<Screening> getScreeningListByCinemaAndMovieName(Integer cinemaID, String movieName) {
        List<Movie> searchedMovie = movieRepository.findByCinemaId(cinemaID);
        Movie getMovie = searchedMovie.stream().filter( movie -> movie.getName().equals(movieName)).findFirst()
                .orElseThrow(null);

        return getScreeningListByCinemaMovie(cinemaID, getMovie.getId());
//        return null;
    }

    private List<Screening> getScreeningListByCinemaMovie(Integer cinemaID, Integer id) {
        return null;
    }


//    public List<Seat> getSeatByScreeningID (Integer screening_id){
//        return seatRepository.findByScreeningId(screening_id);
//    }
}
