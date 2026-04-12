package class_data;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        // 배열이니까 s로 하는거
        MovieReview[] movieReview= new MovieReview[2];
        for (int i =0; i<movieReview.length;i++){
            movieReview[i]=new MovieReview();
        }
        movieReview[0].title = "프로젝트 헤일메리";
        movieReview[1].title = "인터스텔라";
        movieReview[0].review = "별점 5개 !";
        movieReview[1].review = "인생 영화";

        for (int i =0; i<movieReview.length;i++){
            System.out.println(movieReview[i].title);
            System.out.println(movieReview[i].review);
        }

        for (MovieReview m : movieReview){
            System.out.println(m.title);
            System.out.println(m.review);
        }
    }
}
