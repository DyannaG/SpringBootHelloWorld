package com.example.bookstoreBakersButBetter.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "Reviews")

public class Review {
    @Id
    private String reviewId;

    private String bookId;
    private String userId;

    private Float rating;
    private String summary;
   // private LocalDateTime datePosted;
//    private Integer likes;
//    private Integer dislikes;
    private String reviewTitle;
}
