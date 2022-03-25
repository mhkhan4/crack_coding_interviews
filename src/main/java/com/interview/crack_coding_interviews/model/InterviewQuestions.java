package com.interview.crack_coding_interviews.model;


import javax.persistence.*;

@Entity
public class InterviewQuestions {

    @Id
    @SequenceGenerator(
            name = "question_sequence",
            sequenceName = "question_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "question_sequence"
    )
    //id
    private long id;

    @Column(
            name = "question_name",
            nullable = false
    )
    //name of the problem
    private String questionName;

    private String youtubeLink;

    private String javaCode;

    private String javaScriptCode;

    private String discussions;

    //default constructor
    public InterviewQuestions(){}

    //constructor
    public InterviewQuestions(String questionName, String youtubeLink, String javaCode, String discussions, String javaScriptCode){
        this.questionName = questionName;
        this.youtubeLink = youtubeLink;
        this.javaCode = javaCode;
        this.discussions = discussions;
        this.javaScriptCode = javaScriptCode;
    }

    //getter and setter

    //id
    public long getId() {
        return this.id;
    }

    //question name
    public void setQuestionName(String questionName){
        this.questionName = questionName;
    }
    public String getQuestionName(){
        return this.questionName;
    }

    //youtube link
    public String getYoutubeLink() {
        return youtubeLink;
    }

    public void setYoutubeLink(String youtubeLink) {
        this.youtubeLink = youtubeLink;
    }

    //java code
    public String getJavaCode() {
        return javaCode;
    }

    public void setJavaCode(String javaCode) {
        this.javaCode = javaCode;
    }

    //javaScript code


    public String getJavaScriptCode() {
        return javaScriptCode;
    }

    public void setJavaScriptCode(String javaScriptCode) {
        this.javaScriptCode = javaScriptCode;
    }

    //discussions
    public String getDiscussions() {
        return discussions;
    }

    public void setDiscussions(String discussions) {
        this.discussions = discussions;
    }
}
