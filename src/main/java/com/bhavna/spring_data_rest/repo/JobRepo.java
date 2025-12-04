package com.bhavna.spring_data_rest.repo;

import com.bhavna.spring_data_rest.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepo extends JpaRepository<JobPost,Integer>
{

}





















//List<JobPost> jobs=new ArrayList<>(Arrays.asList(
//        new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
//                List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")),
//
//
//        new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React", 3,
//                List.of("HTML", "CSS", "JavaScript", "React")),
//
//
//        new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
//                List.of("Python", "Machine Learning", "Data Analysis")),
//
//
//        new JobPost(4, "Network Engineer", "Design and implement computer networks for efficient data communication", 5,
//                List.of("Networking", "Cisco", "Routing", "Switching")),
//
//
//        new JobPost(5, "Mobile App Developer", "Experience in mobile app development for iOS and Android", 3,
//                List.of("iOS Development", "Android Development", "Mobile App"))
//));
//
//public void addjob(JobPost job)
//{
//    jobs.add(job);
//}
//
//public List<JobPost> getAllJobs()
//{
//    return jobs;
//}
//
//public JobPost getJob(int postId)
//{
//    for(JobPost job:jobs)
//    {
//        if(job.getPostId()==postId)
//        {
//            return job;
//        }
//    }
//    return null;
//}
//public JobPost update( JobPost jobpost)
//{
//    for(JobPost job:jobs)
//    {
//        if(job.getPostId()==jobpost.getPostId())
//        {
//            job.setPostId(jobpost.getPostId());
//            job.setPostDesc(jobpost.getPostDesc());
//            job.setPostProf(jobpost.getPostProf());
//            job.setReqExp(jobpost.getReqExp());
//            job.setTechStack(jobpost.getTechStack());
//        }
//    }
//    return jobpost;
//}
//public void delete(int postId)
//{
//    for(JobPost job:jobs)
//    {
//        if(job.getPostId()==postId)
//        {
//            jobs.remove(job);
//        }
//    }
//}