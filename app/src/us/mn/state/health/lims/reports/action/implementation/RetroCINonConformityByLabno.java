/**
 * The contents of this file are subject to the Mozilla Public License
 * Version 1.1 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations under
 * the License.
 *
 * The Original Code is OpenELIS code.
 *
 * Copyright (C) CIRG, University of Washington, Seattle WA.  All Rights Reserved.
 *
 */
package us.mn.state.health.lims.reports.action.implementation;

import java.util.List;

import us.mn.state.health.lims.common.util.StringUtil;
import us.mn.state.health.lims.observationhistory.valueholder.ObservationHistory;

public class RetroCINonConformityByLabno extends PatientARVReport implements  IReportCreator {

	@Override
	protected void createReportParameters() {
		super.createReportParameters();
		reportParameters.put("showSerologie", Boolean.FALSE);
		reportParameters.put("showVirologie", Boolean.TRUE);	
	}

	@Override
    protected String reportFileName(){
    	return "retroCInonConformityByLabno";
    }

	protected String getReportNameForReport(){
		//assume that we'll not get this
		return "Bilan-Suivi";
			
	}

	protected boolean allowSample(){
		List<ObservationHistory> historyList = observationHistoryDAO.getAll(reportPatient, reportSample, OBSERVATION_PROJECT_ID);
		
		for( ObservationHistory history : historyList){
			if("FollowUpARV_Id".equals(history.getValue())){
				reportParameters.put("studyName", StringUtil.getMessageForKey("reports.label.patient.ARV.followup"));
				return true;
			}else if("InitialARV_Id".equals(history.getValue())){
				reportParameters.put("studyName", StringUtil.getMessageForKey("reports.label.patient.ARV.initial"));	
				return true;
			}
			else if("VL_Id".equals(history.getValue())){
				reportParameters.put("studyName", StringUtil.getMessageForKey("reports.label.patient.VL"));	
				return true;
			}
		}
		
		return false;
	}

	protected String getProjectId() {
		return ANTIRETROVIRAL_STUDY_ID+":"+ANTIRETROVIRAL_FOLLOW_UP_STUDY_ID+":"+VL_STUDY_ID;
	}

}
