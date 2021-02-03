package inheritance.example1;

public class SingerMain {

    public static void main(String[] args) {
        Singer singer = new Singer();
        System.out.println(singer.yearsOfExperience);
        singer.singCommonSong();

        System.out.println("--------------");

        Cicinas cicinas = new Cicinas();
        cicinas.singCommonSong();
        System.out.println(cicinas.yearsOfExperience);
        System.out.println(cicinas.isSmiling());
        cicinas.singLikeCicinas();

        System.out.println("------------");

        Radzi radzi = new Radzi();
        radzi.singLikeRadzi();
        radzi.singCommonSong();
        System.out.println(radzi.yearsOfExperience);

        System.out.println("------------");

        CicinasChild cicinasChild = new CicinasChild();
        cicinasChild.singLikeCicinas();

    }
}