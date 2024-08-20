package main.java.com.ohgiraffers.understand.chap02;

import java.util.ArrayList;

public class MovieTheater {

 private ArrayList<Movie> movies;

  public MovieTheater() {
     movies = new ArrayList<>();  // 생성자
 }

  public void addMovie(Movie movie){ // 영화 추가 메소드
     movies.add(movie);
  }

  public void showmovielist(){    //영화 목록 조회 메소드
      if(movies.isEmpty()){
          System.out.println("상영되고 있는 영화가 없습니다.");
      } else{
          for(int i = 0; i < movies.size(); i++){
              System.out.println(i + "." + movies.get(i).movieInfo());
          }
      }
  }

  public void reserveSeat(int movieIndex){


  }


}

