package com.greenfox.fedex.bigfatmoviequiz.model;

import javax.persistence.*;

@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    String description;
    String correctTitle;
    String wrongTitleOne;
    String wrongTitleTwo;
    String imdbID;
    String imageURL;


    public Movie(String description, String correctTitle, String wrongTitleOne, String wrongTitleTwo, String imdbID, String imageURL) {
        this.description = description;
        this.correctTitle = correctTitle;
        this.wrongTitleOne = wrongTitleOne;
        this.wrongTitleTwo = wrongTitleTwo;
        this.imdbID = imdbID;
        this.imageURL = imageURL;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCorrectTitle() {
        return correctTitle;
    }

    public void setCorrectTitle(String correctTitle) {
        this.correctTitle = correctTitle;
    }

    public String getWrongTitleOne() {
        return wrongTitleOne;
    }

    public void setWrongTitleOne(String wrongTitleOne) {
        this.wrongTitleOne = wrongTitleOne;
    }

    public String getWrongTitleTwo() {
        return wrongTitleTwo;
    }

    public void setWrongTitleTwo(String wrongTitleTwo) {
        this.wrongTitleTwo = wrongTitleTwo;
    }

    public String getImdbID() {
        return imdbID;
    }

    public void setImdbID(String imdbID) {
        this.imdbID = imdbID;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
