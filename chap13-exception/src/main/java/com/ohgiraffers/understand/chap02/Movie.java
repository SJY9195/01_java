package main.java.com.ohgiraffers.understand.chap02;

public class Movie {

    private String title;

    private String runningtime;

    private int numberoftotalseats;

    private int numberofreservedseats;

    public Movie(String title, String runningtime, int numberoftotalseats) {
        this.title = title;
        this.runningtime = runningtime;
        this.numberoftotalseats = numberoftotalseats;
        this.numberofreservedseats = 0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRunningtime() {
        return runningtime;
    }

    public void setRunningtime(String runningtime) {
        this.runningtime = runningtime;
    }

    public int getNumberoftotalseats() {
        return numberoftotalseats;
    }

    public void setNumberoftotalseats(int numberoftotalseats) {
        this.numberoftotalseats = numberoftotalseats;
    }

    public int getNumberofreservedseats() {
        return numberofreservedseats;
    }

    public void setNumberofreservedseats(int numberofreservedseats) {
        this.numberofreservedseats = numberofreservedseats;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", runningtime='" + runningtime + '\'' +
                ", numberoftotalseats=" + numberoftotalseats +
                ", numberofreservedseats=" + numberofreservedseats +
                '}';
    }

    public int availableSeats() {     // 남은 좌석 수
        return numberoftotalseats - numberofreservedseats;
    }

    public String movieInfo(){
        return "영화 제목 : " + title + "상영 시간 : " + runningtime + "남은 좌석 : " + availableSeats() + "/" + numberoftotalseats;
    }



}
