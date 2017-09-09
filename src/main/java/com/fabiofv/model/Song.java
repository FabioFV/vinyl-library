package com.fabiofv.model;

import javax.persistence.*;

/**
 * Created by fabioferreras on 7/9/17.
 */
@Entity
public class Song
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 100)
    private String title;

    private int minutes;
    private int seconds;
}
