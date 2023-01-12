package uga.m2gi.bo;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Random;

public class Villain  {

    public String name;
    public String otherName;
    public int level;
    public String picture;

    public String powers;

}
