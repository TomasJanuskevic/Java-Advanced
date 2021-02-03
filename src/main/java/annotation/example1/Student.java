package annotation.example1;


import javax.persistence.*;

@Entity
@StudentInfo(studentName = "Mario", studentAdress = "Barakas")
public class Student {

    @Id
    @GeneratedValue
    private Integer id;

    @Transient
    private String tempName;

    @Column(name = "FIRST_NAME")
    private String name;

}
