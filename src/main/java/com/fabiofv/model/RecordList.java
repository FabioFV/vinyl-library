package com.fabiofv.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by fabioferreras on 8/9/17.
 */
@Entity
public class RecordList
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 100)
    private String name;

    @Column(length = 500)
    private String description;

    @OneToMany
    @JoinTable(name = "LIST_RECORD")
    private List<Record> list;

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public List<Record> getList()
    {
        return list;
    }

    public void setList(List<Record> list)
    {
        this.list = list;
    }
}
