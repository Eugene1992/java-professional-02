package stream;

import java.time.LocalDate;

public class Statistics {
    private LocalDate date;
    private float numberOne;
    private float numberTwo;
    private float numberThree;
    private float numberFour;
    private float numberFive;
    private float numberSix;

    public Statistics(){}
    public Statistics(LocalDate date, float numberOne, float numberTwo, float numberThree, float numberFour, float numberFive, float numberSix) {
        this.date = date;
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
        this.numberThree = numberThree;
        this.numberFour = numberFour;
        this.numberFive = numberFive;
        this.numberSix = numberSix;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public float getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(float numberOne) {
        this.numberOne = numberOne;
    }

    public float getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(float numberTwo) {
        this.numberTwo = numberTwo;
    }

    public float getNumberThree() {
        return numberThree;
    }

    public void setNumberThree(float numberThree) {
        this.numberThree = numberThree;
    }

    public float getNumberFour() {
        return numberFour;
    }

    public void setNumberFour(float numberFour) {
        this.numberFour = numberFour;
    }

    public float getNumberFive() {
        return numberFive;
    }

    public void setNumberFive(float numberFive) {
        this.numberFive = numberFive;
    }

    public float getNumberSix() {
        return numberSix;
    }

    public void setNumberSix(float numberSix) {
        this.numberSix = numberSix;
    }

    @Override
    public String toString() {
        return "Statistics{" +
                "date=" + date +
                ", numberOne=" + numberOne +
                ", numberTwo=" + numberTwo +
                ", numberThree=" + numberThree +
                ", numberFour=" + numberFour +
                ", numberFive=" + numberFive +
                ", numberSix=" + numberSix +
                '}';
    }
}
