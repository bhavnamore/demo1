package com.bhavna.spring_data_rest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class JobPost
{
    @Id
    private int postId;
    private String postProf;
    private String postDesc;
    private int reqExp;
    private List<String> techStack;

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getPostProf() {
        return postProf;
    }

    public void setPostProf(String postProf) {
        this.postProf = postProf;
    }

    public String getPostDesc() {
        return postDesc;
    }

    public void setPostDesc(String postDesc) {
        this.postDesc = postDesc;
    }

    public int getReqExp() {
        return reqExp;
    }

    public void setReqExp(int reqExp) {
        this.reqExp = reqExp;
    }

    public List<String> getTechStack() {
        return techStack;
    }

    public void setTechStack(List<String> techStack) {
        this.techStack = techStack;
    }

    @Override
    public String toString() {
        return "JobPost{" +
                "postId=" + postId +
                ", postProf='" + postProf + '\'' +
                ", postDesc='" + postDesc + '\'' +
                ", reqExp=" + reqExp +
                ", techStack=" + techStack +
                '}';
    }

}
