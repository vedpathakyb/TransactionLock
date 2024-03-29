package com;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="emp")
public class emp
{
        @Id
        private int id;
        private String name;
        int getId(){return this.id;}
        String getName(){return this.name;}
        void setId(int i){this.id=i;}
        void setName(String t){this.name=t;}
}


