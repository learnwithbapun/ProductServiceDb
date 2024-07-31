package com.amex.productservicedb.representinginheritance.mappedsuperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "msc_ta")
public class Ta extends User {
    private int  numbersOfSession;
    private  double averageRatings;
}
