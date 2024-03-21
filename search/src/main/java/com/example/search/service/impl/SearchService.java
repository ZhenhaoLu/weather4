package com.example.search.service.impl;

import com.example.search.pojo.dto.DetailsDTO;
import com.example.search.pojo.dto.MyServiceDTO;
import com.example.search.service.ISearchService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SearchService implements ISearchService {
    private final RestTemplate restTemplate;

    @Autowired
    public SearchService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    @Override
    @HystrixCommand(fallbackMethod = "fallbackMethod")
    public MyServiceDTO mergeResults() {
        DetailsDTO detailResponse = this.restTemplate.getForObject("http://gateway/details/port", DetailsDTO.class);
//        System.out.println("detailsGet");
        MyServiceDTO res = this.restTemplate.getForObject("http://gateway/hibernate/employee/0", MyServiceDTO.class);
//        System.out.println("dbGet");
        res.merge(detailResponse);
        return res;
    }

    public MyServiceDTO fallbackMethod(){
        return new MyServiceDTO();
    }
}
