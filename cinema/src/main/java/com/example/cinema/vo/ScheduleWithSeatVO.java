package com.example.cinema.vo;

import com.example.cinema.po.ScheduleItem;

public class ScheduleWithSeatVO {
    /**
     * 排片
     */
    private ScheduleItem scheduleItem;
    /**
     * 座位
     */
    private int[][] seats;

    public ScheduleItem getScheduleItem() {
        return scheduleItem;
    }

    public void setScheduleItem(ScheduleItem scheduleItem) {
        this.scheduleItem = scheduleItem;
    }

    public int[][] getSeats() {
        return seats;
    }

    public void setSeats(int[][] seats) {
        this.seats = seats;
    }
}
