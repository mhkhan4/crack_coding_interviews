package com.interview.crack_coding_interviews.repository;

import com.interview.crack_coding_interviews.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IQuestionRepository extends JpaRepository<Question, Long> {

}
