package class_data;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview movieReview1 = new MovieReview();
        MovieReview movieReview2 = new MovieReview();
        movieReview1.title = "프로젝트 헤일메리";
        movieReview2.title = "인터스텔라";
        movieReview1.review = "별점 5개 !";
        movieReview2.review = "인생 영화";
        System.out.println(movieReview1.title);
        System.out.println(movieReview2.title);
        System.out.println(movieReview1.review);
        System.out.println(movieReview2.review);
    }
}
