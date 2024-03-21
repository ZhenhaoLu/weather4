package com.example.search.controller;

import com.example.search.pojo.dto.DetailsDTO;
import com.example.search.pojo.dto.MyServiceDTO;
import com.example.search.service.ISearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SearchController {

    private final ISearchService searchService;

    @Autowired
    public SearchController(ISearchService searchService){
        this.searchService = searchService;
    }

    @GetMapping("/weather/search")
    public ResponseEntity<MyServiceDTO> getDetails() {
        //TODO
//        DetailsDTO detailResponse = this.restTemplate.getForObject("http://gateway/details/port", DetailsDTO.class);
//        System.out.println("detailsGet");
//        MyServiceDTO res = this.restTemplate.getForObject("http://gateway/hibernate/employee/0", MyServiceDTO.class);
//        System.out.println("dbGet");
//        res.merge(detailResponse);
        return new ResponseEntity<>(this.searchService.mergeResults(), HttpStatus.OK);
    }
}
