/**
 * 
 */
package com.cognizant.mohit.Music_List.service;

/**
 * @author mohit
 *
 */
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cognizant.mohit.Music_List.dto.AlbumDTO;



@Service
public class SpotifyService {

    @Value("${spotify.api.url}")
    private String spotifyApiUrl;
    

 

    private final RestTemplate restTemplate;
    

    // Inject the token via constructor
    public SpotifyService(RestTemplateBuilder restTemplateBuilder,
                          @Value("${spotify.api.token}") String spotifyApiToken) {
        this.restTemplate = restTemplateBuilder
                .defaultHeader(HttpHeaders.AUTHORIZATION, "Bearer " + spotifyApiToken)
                .build();
    }
    
    public Object searchSpotify(String query, String type) {
        // Spotify API endpoint
        
    	String apiUrl = spotifyApiUrl + "/search/";
     


        // Make the GET request to Spotify API
        return restTemplate.getForObject(
                String.format("%s?q=%s&type=%s", apiUrl, query, type),
                Object.class
        );
    }

 
    
    public AlbumDTO getAlbum(String albumId) {
    	   String apiUrl = spotifyApiUrl + "/albums/" + albumId;
    	 return restTemplate.getForObject(apiUrl, AlbumDTO.class);
      
    }
}
