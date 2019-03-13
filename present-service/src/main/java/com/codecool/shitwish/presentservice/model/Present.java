package com.codecool.shitwish.presentservice.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.net.URL;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Present {

    @Id
    @GeneratedValue
    protected Integer id;

    protected String title;

    protected Integer price;

    @Column(columnDefinition = "TEXT")
    protected String description;

    @Column(columnDefinition = "TEXT")
    protected URL image;

}
