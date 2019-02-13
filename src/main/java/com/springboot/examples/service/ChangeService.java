package com.springboot.examples.service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.springboot.examples.model.ChangeRecord;
import com.springboot.examples.model.ChangeResourceAction;
import com.springboot.examples.model.ChangeResourceActionId;
import com.springboot.examples.repository.ChangeRepository;
import com.springboot.examples.repository.ChangeResourceActionRepository;

@Service
public class ChangeService {

	
	@Autowired
	ChangeRepository changeRepository;
	
	@Autowired
	ChangeResourceActionRepository craRepository;
	
//	public boolean save() {
//		try{
//			ChangeRecord changeRecord = new ChangeRecord(2, "changeName4", "changeProcedure4", "rollbackProcedure", 1, "", 1, "evidenceOfText", true, true, 1, "impactConfigOtherText", 1, new Date(), new Date(), 1, "testingProcedure");
//			ChangeResourceAction changeResourceAction = new ChangeResourceAction(new ChangeResourceActionId(2,2,new Timestamp(System.currentTimeMillis())), 1,"reviewerComment1", "approverComment1", "closureComment1", "testingResult1");
//			changeResourceAction.setChangeRecord(changeRecord);
//			changeRecord.getChangeActions().add(changeResourceAction);
//			changeRepository.save(changeRecord);
//			return true;
//		}
//		catch(Exception ex) {
//			return false;
//		}
//	}
	
	public boolean savenew() {
		try{
			ChangeRecord changeRecord = new ChangeRecord("changeNamenew", "changeProcedure4", "rollbackProcedure", 1, "", 1, "evidenceOfText", true, true, 1, "impactConfigOtherText", 1, new Date(), new Date(), 1, "testingProcedure");
			ChangeResourceAction cra = new ChangeResourceAction(new ChangeResourceActionId(3,new Timestamp(System.currentTimeMillis())), 1,"reviewerCommentnew", "approverComment1", "closureComment1", "testingResult1");
			
			cra.setChangeRecord(changeRecord);
			changeRecord.getChangeActions().add(cra);
			changeRepository.save(changeRecord);
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	public void getReviewerComment(int chngId) {
		try{
//			List<ChangeResourceAction> actions0 = craRepository.findByChangeResourceActionIdChangeId(chngId);
//			List<ChangeResourceAction> actions = craRepository.findTopByReviewerCommentIsNotNullOrderByChangeResourceActionIdChangeActionDateDesc();
//			List<ChangeResourceAction> actions1 = craRepository.findTopByReviewerCommentIsNotNull(Sort.by(Sort.Direction.ASC, "changeResourceActionId.changeActionDate"));
//			List<ChangeResourceAction> actions2 = craRepository.findAllByReviewerCommentIsNotNull(Sort.by(Sort.Direction.ASC, "changeResourceActionId.changeActionDate"));
//			List<ChangeResourceAction> actions3 = craRepository.findTopByChangeResourceActionIdChangeActionDateAndReviewerCommentIsNotNull(Sort.by(Sort.Direction.ASC, "changeResourceActionId.changeActionDate"));
			
			List<ChangeResourceAction> actions0 = craRepository.findTopByChangeResourceActionIdChangeIdAndReviewerCommentIsNotNull(chngId, Sort.by(Sort.Direction.ASC, "changeResourceActionId.changeActionDate"));
			
			for(ChangeResourceAction action:actions0) {
				System.out.println(action.toString());
			}
//			List<ChangeResourceAction> actions1 = craRepository.findTopByChangeResourceActionIdChangeIdAndReviewerCommentIsNotNullOrderByChangeResourceActionIdChangeActionDateDesc(chngId);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public void fetchLocation(int chngId) {
		try{
			
			List<ChangeRecord> actions0 = changeRepository.findByChangeId(chngId);
			
			for(ChangeRecord action:actions0) {
				System.out.println("-->"+action.toString());
			}
//			List<ChangeResourceAction> actions1 = craRepository.findTopByChangeResourceActionIdChangeIdAndReviewerCommentIsNotNullOrderByChangeResourceActionIdChangeActionDateDesc(chngId);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public boolean update(ChangeRecord changeRecord) {
		try{
			Optional<ChangeRecord> cr = changeRepository.findById(changeRecord.getChangeId());
			if(cr.isPresent()){
				ChangeResourceAction cra = new ChangeResourceAction(new ChangeResourceActionId(3,new Timestamp(System.currentTimeMillis())), 1,null, "approverComment1", "closureComment1", "testingResult1");
				cra.setChangeRecord(cr.get());
				changeRecord.getChangeActions().add(cra);
				craRepository.save(cra);
				
				
				
				
				
				return true;
			}else{
				return false;
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}
}