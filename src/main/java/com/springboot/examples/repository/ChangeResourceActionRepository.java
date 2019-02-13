package com.springboot.examples.repository;



import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.examples.model.ChangeResourceAction;



public interface ChangeResourceActionRepository extends JpaRepository<ChangeResourceAction, Long> {
	
	/*
	 * List<ChangeResourceAction> findTopByReviewerCommentIsNotNull(Sort sort);
	 * 
	 * List<ChangeResourceAction>
	 * findTopByReviewerCommentIsNotNullOrderByChangeResourceActionIdChangeActionDateDesc
	 * ();
	 * 
	 * List<ChangeResourceAction> findAllByReviewerCommentIsNotNull(Sort sort);
	 * 
	 * List<ChangeResourceAction> findByChangeResourceActionIdChangeId(int
	 * changeId);
	 * 
	 * List<ChangeResourceAction>
	 * findTopByChangeResourceActionIdChangeActionDateAndReviewerCommentIsNotNull(
	 * Sort sort);
	 */
	
	List<ChangeResourceAction> findTopByChangeResourceActionIdChangeIdAndReviewerCommentIsNotNullOrderByChangeResourceActionIdChangeActionDateDesc(int changeId);
	
	List<ChangeResourceAction> findTopByChangeResourceActionIdChangeIdAndReviewerCommentIsNotNull(int changeId, Sort sort);
}

