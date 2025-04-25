package com.codingdojo.savetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.savetravels.models.Travel;
import com.codingdojo.savetravels.repository.TravelRepository;

@Service
public class TravelService {
    private final TravelRepository travelRepository;
    
    public TravelService(TravelRepository travelRepository) {
        this.travelRepository = travelRepository;
    }

    public List<Travel> allTravels() {
        return travelRepository.findAll();
    }

    public Travel createTravel(Travel travel) {
        return travelRepository.save(travel);
    }
    
    public Travel findTravel(Long id) {
    	Optional<Travel> optionalTravel = travelRepository.findById(id);
    	if(optionalTravel.isPresent()) {
    		return optionalTravel.get();
    	}
    	return null;
    }
    public Travel updateTravel(Travel travel) {
        return travelRepository.save(travel);
    }
    
	public void deleteTravel(Travel travel) {
		travelRepository.delete(travel);
	}
}