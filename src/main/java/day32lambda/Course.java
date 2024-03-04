package day32lambda;

public class Course {

    //Senaryo: Lambdayi object’lerle kullanmayi ogrenelim.
    // Class icerisinde pasif ve aktif ozellikler olusturalim

    /*
        Icinde
        1) private variable'lar (kapsulleme-encapsulation)
        2) parametreli ve parametresiz constructor'lar
        3) getter'lar -Private değişkenlere erişim sağlamak için-
        4) setter'lar -Private değişkenleri değiştirmek için-
        5) toString() methodu -Objenin içeriğini okunabilir bir formatta döndürmek için-
        barindiran classlara POJO class denir

        POJO==>Plain Old Java Object -Düz Eski Java Nesnesi

        Birçok uygulamada, veriyi bir katmandan diğerine taşımak için POJO sınıfları kullanılır. (API)
    */
    //   1) private variable'lar (kapsulleme-encapsulation)
    private String season;
    private String courseName;
    private int averageScore;
    private int numberOfStudent;

    //  2) parametreli ve parametresiz constructor'lar
    public Course() {
    }

    public Course(String season, String courseName, int averageScore, int numberOfStudent) {
        this.season = season;
        this.courseName = courseName;
        this.averageScore = averageScore;
        this.numberOfStudent = numberOfStudent;
    }
    //  3) getter'lar -Private değişkenlere erişim sağlamak için-
    //  4) setter'lar -Private değişkenleri değiştirmek için-


    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(int averageScore) {
        this.averageScore = averageScore;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }
    //  5) toString() methodu

    @Override
    public String toString() {
        return "Course{" +
                "season='" + season + '\'' +
                ", courseName='" + courseName + '\'' +
                ", averageScrore=" + averageScore +
                ", numberOfStudent=" + numberOfStudent +
                '}';
    }
}
