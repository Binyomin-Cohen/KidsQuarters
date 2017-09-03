package com.binyomincode.quarters;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by seanc on 03/09/17.
 */
@Entity
public class QuarterEvent {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    long id;
    Double netDifference;
    String cause;

    public QuarterEvent() {
    }

    public QuarterEvent(Double netDifference, String cause) {
        this.netDifference = netDifference;
        this.cause = cause;
    }

    public Double getNetDifference() {
        return netDifference;
    }

    public void setNetDifference(Double netDifference) {
        this.netDifference = netDifference;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }
}
