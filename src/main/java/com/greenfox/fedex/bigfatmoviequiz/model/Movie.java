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
    String correctImage;
    String wrong1Image;
    String wrong2Image;

    public Movie() {
    }

    public Movie(String description, String correctTitle, String wrongTitleOne,
        String wrongTitleTwo, String imdbID, String correctImage, String wrong1Image,
        String wrong2Image) {
        this.description = description;
        this.correctTitle = correctTitle;
        this.wrongTitleOne = wrongTitleOne;
        this.wrongTitleTwo = wrongTitleTwo;
        this.imdbID = imdbID;
        this.correctImage = correctImage;
        this.wrong1Image = wrong1Image;
        this.wrong2Image = wrong2Image;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCorrectImage() {
        return correctImage;
    }

    public void setCorrectImage(String correctImage) {
        this.correctImage = correctImage;
    }

    public String getWrong1Image() {
        return wrong1Image;
    }

    public void setWrong1Image(String wrong1Image) {
        this.wrong1Image = wrong1Image;
    }

    public String getWrong2Image() {
        return wrong2Image;
    }

    public void setWrong2Image(String wrong2Image) {
        this.wrong2Image = wrong2Image;
    }
}
