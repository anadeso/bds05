package com.devsuperior.movieflix.dto;

import com.devsuperior.movieflix.entities.Review;

public class ReviewDTO {

    private String text;
    private Long id;
    private UserDTO user;

    public ReviewDTO() {

    }

    public ReviewDTO(String text, Long id) {
        this.text = text;
        this.id = id;
    }

    public ReviewDTO(Review entity) {
        this.text = entity.getText();
        this.id = entity.getId();
        this.user = new UserDTO(entity.getUser());
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }
}
