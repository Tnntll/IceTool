package com.rh.icetool.javaBean;

/**
 * Created by Jeremy on 2017-02-09.
 */
public class Goods {
    private int num;
    private String date;
    private String person;
    private String kind;
    private int factory;
    private String cost;
    private int count;
    private String sum;

    public Goods() {
    }

    public Goods(int num, String date, String person, String kind, int factory, String cost, int count, String sum) {
        this.num = num;
        this.date = date;
        this.person = person;
        this.kind = kind;
        this.factory = factory;
        this.cost = cost;
        this.count = count;
        this.sum = sum;
    }

    public int getFactory() {
        return factory;
    }

    public void setFactory(int factory) {
        this.factory = factory;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "num=" + num +
                ", date='" + date + '\'' +
                ", person='" + person + '\'' +
                ", kind='" + kind + '\'' +
                ", factory=" + factory +
                ", cost='" + cost + '\'' +
                ", count=" + count +
                ", sum=" + sum +
                '}';
    }
}
