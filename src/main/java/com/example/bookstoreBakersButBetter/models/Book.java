package com.example.bookstoreBakersButBetter.models;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Book {

    @Id
    private String id;
    private String name;
    private String author;
    private String genre;
    private String publishDate;
    //review code so if this breaks its my fault - ella
    private List<String> reviewIds;
}
