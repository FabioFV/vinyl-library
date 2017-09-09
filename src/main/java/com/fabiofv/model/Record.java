package com.fabiofv.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

/**
 * Created by fabioferreras on 7/9/17.
 */
@Entity
public class Record
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 100)
    private String title;

    @Column(length = 500)
    private String description;

    @Column(name = "RELEASE_DATE")
    private Date releaseDate;

    @Column(columnDefinition = "INT(1)")
    private boolean owned;

    @Column(name = "BUY_DATE")
    private Date buyDate;

    @Column(name = "NUM_OF_DISCS")
    private int numOfDiscs;

    private int size;
    private double speed;

    @ManyToOne
    @JoinColumn(name = "VINYL_TYPE_ID")
    private VinylType type;

    @ManyToOne
    @JoinColumn(name = "GENRE_ID")
    private Genre genre;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "RECORD_SONG")
    List<Song> songs;

    @OneToMany()
    @JoinTable(name = "RECORD_ARTIST")
    List<Artist> artists;

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public Date getReleaseDate()
    {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate)
    {
        this.releaseDate = releaseDate;
    }

    public boolean isOwned()
    {
        return owned;
    }

    public void setOwned(boolean owned)
    {
        this.owned = owned;
    }

    public Date getBuyDate()
    {
        return buyDate;
    }

    public void setBuyDate(Date buyDate)
    {
        this.buyDate = buyDate;
    }

    public int getNumOfDiscs()
    {
        return numOfDiscs;
    }

    public void setNumOfDiscs(int numOfDiscs)
    {
        this.numOfDiscs = numOfDiscs;
    }

    public int getSize()
    {
        return size;
    }

    public void setSize(int size)
    {
        this.size = size;
    }

    public double getSpeed()
    {
        return speed;
    }

    public void setSpeed(double speed)
    {
        this.speed = speed;
    }

    public VinylType getType()
    {
        return type;
    }

    public void setType(VinylType type)
    {
        this.type = type;
    }

    public Genre getGenre()
    {
        return genre;
    }

    public void setGenre(Genre genre)
    {
        this.genre = genre;
    }

    public List<Song> getSongs()
    {
        return songs;
    }

    public void setSongs(List<Song> songs)
    {
        this.songs = songs;
    }

    public List<Artist> getArtists()
    {
        return artists;
    }

    public void setArtists(List<Artist> artists)
    {
        this.artists = artists;
    }
}
