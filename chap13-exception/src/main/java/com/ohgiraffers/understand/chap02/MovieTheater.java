package main.java.com.ohgiraffers.understand.chap02;

import java.util.ArrayList;

public class MovieTheater {

    private ArrayList<Movie> movies;  // <> 안에는 리스트가 저장할 수 있는 요소의 타입을 넣어줘야한다!! Movie는 참조자료형이다!

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
              System.out.println((i + 1) + "." + movies.get(i).movieInfo());
          }
      }
  }

    @Override
    public String toString() {
        return "현재 상영중인 영화목록 : " + movies ;    //반드시 toString() 메소드는 문자열을 반환시켜야 하므로 return 뒤에 String을 써야한다!
    }

    public void movielist() {
            for ( Movie movie : movies ){
                System.out.println(movie);
            }
    }

    public void reserveSeat(int movieIndex){
      if(movieIndex >= 0 && movieIndex < movies.size()){
          Movie movie = movies.get(movieIndex);
            if(movie.reserveSeat()){
                System.out.println("예매를 성공하셨습니다!");
            }
            else{
                System.out.println("죄송합니다. 좌석이 모두 찼습니다. 다시 예매를 해주세요.");
            }
          } else {
          System.out.println("번호를 잘못 누르셨습니다.");
      }



      }

  }



