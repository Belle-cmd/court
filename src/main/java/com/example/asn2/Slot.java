package com.example.asn2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Comparator;

public class Slot {
    private LocalDate date;
    private DayOfWeek weekDate;
    private int courtNum;
    private String time;

    /**
     * Constructor method
     */
    public Slot(LocalDate date, DayOfWeek weekDate, int courtNum, String time) {
        this.date = date;
        this.weekDate = weekDate;
        this.courtNum = courtNum;
        this.time = time;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public DayOfWeek getWeekDate() {
        return weekDate;
    }

    public void setWeekDate(DayOfWeek weekDate) {
        this.weekDate = weekDate;
    }

    public int getCourtNum() {
        return courtNum;
    }

    public void setCourtNum(int courtNum) {
        this.courtNum = courtNum;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String toString() {
        return "Court " + this.courtNum + "\n" +
                date + "\n" +
                this.weekDate + " at " + this.time;
    }
}
