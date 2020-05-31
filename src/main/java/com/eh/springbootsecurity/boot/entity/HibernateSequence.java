package com.eh.springbootsecurity.boot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hibernate_sequence")
public class HibernateSequence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name = "next_val")
    private int nextVal;

    public int getNextVal() {
        return nextVal;
    }

    public void setNextVal(int nextVal) {
        this.nextVal = nextVal;
    }
}
