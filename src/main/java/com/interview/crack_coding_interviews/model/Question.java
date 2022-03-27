package com.interview.crack_coding_interviews.model;


import javax.persistence.*;

@Entity
public class Question {

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
    private long id;

    @Column(
            name = "question_name",
            nullable = false
    )
    //name of the problem
    private String questionName;

    private String questionDescription;
    private String type;

    private String subType;

    private String youtubeLink;

    private String javaCode;

    private String javaScriptCode;

    private String discussions;

    //default constructor
    public Question(){}

    //constructor
    public Question(String questionName, String youtubeLink, String javaCode, String discussions, String javaScriptCode, String type, String subType, String questionDescription){
        this.questionName = questionName;
        this.questionDescription = questionDescription;
        this.youtubeLink = youtubeLink;
        this.javaCode = javaCode;
        this.discussions = discussions;
        this.javaScriptCode = javaScriptCode;
        this.type = type;
        this.subType = subType;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    public String getQuestionDescription() {
        return questionDescription;
    }

    public void setQuestionDescription(String questionDescription) {
        this.questionDescription = questionDescription;
    }
}
