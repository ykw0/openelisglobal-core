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
 * Copyright (C) The Minnesota Department of Health.  All Rights Reserved.
 *
 * Contributor(s): CIRG, University of Washington, Seattle WA.
 */
package us.mn.state.health.lims.sample.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.DynaBean;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.validator.GenericValidator;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import us.mn.state.health.lims.patient.valueholder.ObservationData;

import us.mn.state.health.lims.common.action.BaseActionForm;
import us.mn.state.health.lims.common.formfields.FormFields;
import us.mn.state.health.lims.common.formfields.FormFields.Field;
import us.mn.state.health.lims.common.services.StatusService;
import us.mn.state.health.lims.common.services.SampleAddService.SampleTestCollection;
import us.mn.state.health.lims.common.services.StatusService.SampleStatus;
import us.mn.state.health.lims.common.util.DateUtil;
import us.mn.state.health.lims.observationhistory.valueholder.ObservationHistory;
import us.mn.state.health.lims.patient.saving.Accessioner;
import us.mn.state.health.lims.patient.saving.SampleEntry;
import us.mn.state.health.lims.patient.saving.SampleEntryAfterPatientEntry;
import us.mn.state.health.lims.patient.saving.SampleSecondEntry;
import us.mn.state.health.lims.sample.action.util.SamplePatientUpdateData;
import us.mn.state.health.lims.sample.valueholder.Sample;
import us.mn.state.health.lims.sampleitem.valueholder.SampleItem;
import us.mn.state.health.lims.test.valueholder.Test;
import us.mn.state.health.lims.typeofsample.valueholder.TypeOfSample;


public class SampleEntryByProjectSaveAction extends BaseSampleEntryAction {

    @Override
    protected ActionForward performAction(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        String forward = FWD_SUCCESS;
        Accessioner accessioner;
        accessioner = new SampleSecondEntry((DynaBean) form, currentUserId, request);
        if (accessioner.canAccession()) {
            forward = handleSave(request, accessioner);
            if (forward != null) {
                return mapping.findForward(forward);
            }
        }
        accessioner = new SampleEntry((DynaBean) form, currentUserId, request);
        if (accessioner.canAccession()) {
            forward = handleSave(request, accessioner);
            if (forward != null) {
                return mapping.findForward(forward);
            }
        }
        accessioner = new SampleEntryAfterPatientEntry((DynaBean) form, currentUserId, request);
        if (accessioner.canAccession()) {
            forward = handleSave(request, accessioner);
            if (forward != null) {
                return mapping.findForward(forward);
            }
        }
        logAndAddMessage(request, "performAction", "errors.UpdateException");
        return mapping.findForward(FWD_FAIL);
    }

	public SampleItem getSampleItem(Sample sample, TypeOfSample typeofsample){
		SampleItem item = new SampleItem();
		item.setSample(sample);
		item.setTypeOfSample(typeofsample);
		item.setSortOrder(Integer.toString(1));
		item.setStatusId(StatusService.getInstance().getStatusID(SampleStatus.Entered));

		return item;

	}

	@Override
	protected String getPageTitleKey() {
		return "sample.entry.title";
	}

	@Override
	protected String getPageSubtitleKey() {
		return "sample.entry.title";
	}
	
	protected void loadSamplesTestsCollection(BaseActionForm dynaForm){
	if(FormFields.getInstance().useField(Field.InitialSampleCondition)) return;
		
		//DynaActionForm dynaForm = (DynaActionForm) form;
	String xml=(String)dynaForm.get( "sampleXML" );
	System.out.println("AMANI:"+xml);
	ObservationData observations=(ObservationData)dynaForm.get( "observations" );
	try {
		Document sampleDom = DocumentHelper.parseText(xml);

		for (Iterator i = sampleDom.getRootElement().elementIterator("sample"); i.hasNext();) {
		//	sampleItemIdIndex++;

			Element sampleItem = (Element) i.next();
			String initialSampleConditionIdString = sampleItem.attributeValue("initialConditionIds");
			if (!GenericValidator.isBlankOrNull(initialSampleConditionIdString)) {
				String[] initialSampleConditionIds = initialSampleConditionIdString.split(",");
				for(int j=0;j<initialSampleConditionIds.length;j++)
				observations.setInitialSampleConditionINNs(j, initialSampleConditionIds[j]);
			}
		}
		
	  } catch (DocumentException e) {
		e.printStackTrace();
	  }
	//  dynaForm.set("orbservations", observations);
	
		
	}
}
