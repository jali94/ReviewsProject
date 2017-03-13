package review;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class ReviewRepository { 
	
	
	private Map<Long, Review> reviews = new HashMap<Long, Review>();
	
	//constructor
	public ReviewRepository () {
 	    long id = 1l;
		
		Review review = new Review(1, "Dragonball Z", "/images/DragonBallZ.jpg", "Cartoon show", "Action packed Anime");
		reviews.put(id, review);
		
		reviews.put(2l, new Review(2, "Jordan 5", "/images/jordan5.jpg", "Designer shoes", "To keep you fresh even in dad jeans"));
		reviews.put(3l, new Review(3, "Dubai", "/images/dubai.jpg", "Vacation spot", "best Summer destination especially if you dont have your summer body yet"));
		reviews.put(4l, new Review(4, "Barkley Foamposite", "/images/foamposite.jpg", "Historical Shoes", "Throwback shoes, but your grandpa definately doesnt have a pair, these are exclusive"));
		reviews.put(5l, new Review(5, "BMW i8", "/images/bmw.jpg", "supercars of the world", "Best affordable supercar of the century"));
		reviews.put(6l, new Review(6, "Audemars Piguet", "/images/AudemarPiguet.jpg", "Luxury watches", "Best watch in the world"));
	}
	
	public Collection<Review> findAll() {
			
		return reviews.values(); 
	}
	
	public Review findOne(Long id) {
		
		return reviews.get(id);
	}
	

}