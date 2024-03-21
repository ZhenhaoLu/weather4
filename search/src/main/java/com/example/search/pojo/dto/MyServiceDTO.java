package com.example.search.pojo.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MyServiceDTO {

    private Integer id;
    private String name;
    private Integer age;
    private Integer salary;
    private Integer dept_id;
    private Integer code;
    private String timestamp;
    private String data;

    public void merge(DetailsDTO detailsDTO){
        this.code = detailsDTO.getCode();
        this.timestamp = detailsDTO.getTimestamp();
        this.data = detailsDTO.getData();
    }

}
