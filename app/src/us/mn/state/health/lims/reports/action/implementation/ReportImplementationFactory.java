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

import org.apache.commons.validator.GenericValidator;
import us.mn.state.health.lims.common.util.StringUtil;
import us.mn.state.health.lims.reports.action.implementation.ReportSpecificationParameters.Parameter;

public class ReportImplementationFactory{
	private static final boolean isLNSP = true;

	public static IReportParameterSetter getParameterSetter(String report){
		if(!GenericValidator.isBlankOrNull(report)){
			if(report.equals("patientARV1")){
				return new ReportSpecificationParameters(Parameter.ACCESSION_RANGE, StringUtil.getMessageForKey("reports.label.patient.ARV.all"),null);
			}else if(report.equals("patientARVInitial1")){
				return new ReportSpecificationParameters(Parameter.ACCESSION_RANGE, StringUtil.getMessageForKey("reports.label.patient.ARV.initial"), null);
			}else if(report.equals("patientARVInitial2")){
				return new ReportSpecificationParameters(Parameter.ACCESSION_RANGE,StringUtil.getMessageForKey("reports.label.patient.ARV.initial"), null);
			}else if(report.equals("patientARVFollowup1")){
				return new ReportSpecificationParameters(Parameter.ACCESSION_RANGE,StringUtil.getMessageForKey("reports.label.patient.ARV.followup"), null);
			}else if(report.equals("patientARVFollowup2")){
				return new ReportSpecificationParameters(Parameter.ACCESSION_RANGE,StringUtil.getMessageForKey("reports.label.patient.ARV.followup"), null);
			}else if(report.equals("patientEID1")){
				return new ReportSpecificationParameters(Parameter.ACCESSION_RANGE,StringUtil.getMessageForKey("reports.label.patient.EID"), null);
			}else if(report.equals("patientEID2")){
				return new ReportSpecificationParameters(Parameter.ACCESSION_RANGE,StringUtil.getMessageForKey("reports.label.patient.EID"), null);
			}else if(report.equals("patientVL1")){
				return new ReportSpecificationParameters(Parameter.ACCESSION_RANGE,StringUtil.getMessageForKey("reports.label.patient.VL"), null);
			}else if(report.equals("patientIndeterminate1")){
				return new ReportSpecificationParameters(Parameter.ACCESSION_RANGE,StringUtil.getMessageForKey("reports.label.patient.indeterminate"), null);
			}else if(report.equals("patientIndeterminate2")){
				return new ReportSpecificationParameters(Parameter.ACCESSION_RANGE,StringUtil.getMessageForKey("reports.label.patient.indeterminate"), null);
			}else if(report.equals("patientIndeterminateByLocation")){
				return new PatientIndeterminateByLocationReport();
			}else if(report.equals("indicatorSectionPerformance")){
				return new ReportSpecificationParameters( Parameter.NO_SPECIFICATION, StringUtil.getMessageForKey("reports.label.indicator.performance"), null );
			}else if(report.equals("patientHaitiClinical") || report.equals("patientHaitiLNSP") || report.equals("patientCILNSP")|| report.equals("patientCILNSP_vreduit")){
				return new PatientClinicalReport();
			}else if(report.equals("indicatorHaitiClinicalHIV")){
				return new IndicatorHIV();
			}else if(report.equals("indicatorHaitiLNSPHIV")){
				return new IndicatorHIVLNSP();
			}else if(report.equals("indicatorCDILNSPHIV")){
				return new IndicatorCDIHIVLNSP();
			}else if(report.equals("indicatorHaitiClinicalAllTests")){
				return new IndicatorAllTestClinical();
			}else if(report.equals("indicatorHaitiLNSPAllTests")){
				return new IndicatorAllTestLNSP();
			}else if(report.equals("CISampleExport")){
				return new ExportProjectByDate();
			}else if(report.equals("referredOut")){
				return new ReferredOutReport();
			}else if(report.equals("HaitiExportReport") || report.equals("HaitiLNSPExportReport")){
				return new ReportSpecificationParameters( Parameter.DATE_RANGE,
                        StringUtil.getMessageForKey("reports.label.project.export") + " " + StringUtil.getContextualMessageForKey("sample.collectionDate"), null);
			}else if(report.equals("indicatorConfirmation")){
				return new ConfirmationReport();
			}else if(isNonConformityByDateReport(report)){
				return new ReportSpecificationParameters( Parameter.DATE_RANGE, StringUtil.getMessageForKey("openreports.nonConformityReport"), null);
			}else if(isNonConformityBySectionReport(report)){
				return new ReportSpecificationParameters( Parameter.DATE_RANGE, StringUtil.getMessageForKey("reports.nonConformity.bySectionReason.title"), null);
			}else if(report.equals("patientSpecialReport")){
				return new ReportSpecificationParameters(Parameter.ACCESSION_RANGE,StringUtil.getMessageForKey("reports.specialRequest.title"), null);
			}else if(report.equals("indicatorHaitiLNSPSiteTestCount")){
				return new IndicatorHaitiSiteTestCountReport();
			}else if(report.equals("retroCIFollowupRequiredByLocation")){
				return new RetroCIFollowupRequiredByLocation();
			}if(report.equals("retroCInonConformityByLabno")){
				return new ReportSpecificationParameters(Parameter.ACCESSION_RANGE, StringUtil.getMessageForKey("reports.label.patient.ARV.all"),null);
			}else if(report.equals("retroCInonConformityNotification")){
				return new RetroCINonConformityNotification();
			}else if(report.equals("patientCollection")){
				return new RetroCIPatientCollectionReport();
			}else if(report.equals("patientAssociated")){
				return new RetroCIPatientAssociatedReport();
			}else if (report.equals("indicatorRealisation") ){
				    return new ReportSpecificationParameters( Parameter.DATE_RANGE, StringUtil.getMessageForKey("report.realisation"), null);
			}else if (report.equals("epiSurveillanceExport") ){
                return new ReportSpecificationParameters( Parameter.DATE_RANGE, StringUtil.getMessageForKey("banner.menu.report.epi.surveillance.export"), null);
            }else if (report.equals( "activityReportByPanel" )){
                return new ActivityReportByPanel();
            }else if (report.equals( "activityReportByTest" )){
                return new ActivityReportByTest();
            }else if (report.equals( "activityReportByTestSection" )){
                return new ActivityReportByTestSection();
            }else if (report.equals( "rejectionReportByPanel" )){
                return new RejectionReportByPanel();
            }else if (report.equals( "rejectionReportByTest" )){
                return new RejectionReportByTest();
            }else if (report.equals( "rejectionReportByTestSection" )){
                return new RejectionReportByTestSection();
            }
		}

		return null;
	}

	private static boolean isNonConformityByDateReport(String report){
		return report.equals("retroCINonConformityByDate") ||
				report.equals("haitiNonConformityByDate") ||
				report.equals("haitiClinicalNonConformityByDate");
	}

	private static boolean isNonConformityBySectionReport(String report){
		return report.equals("retroCInonConformityBySectionReason") ||
				report.equals("haitiNonConformityBySectionReason") ||
				report.equals("haitiClinicalNonConformityBySectionReason");
	}

	public static IReportCreator getReportCreator(String report){
		if(!GenericValidator.isBlankOrNull(report)){
			if(report.equals("patientARV1")){
				return new PatientARVVersion1Report();
			}else if(report.equals("patientARVInitial1")){
				return new PatientARVInitialVersion1Report();
			}else if(report.equals("patientARVInitial2")){
				return new PatientARVInitialVersion2Report();
			}else if(report.equals("patientARVFollowup1")){
				return new PatientARVFollowupVersion1Report();
			}else if(report.equals("patientARVFollowup2")){
				return new PatientARVFollowupVersion2Report();
			}else if(report.equals("patientEID1")){
				return new PatientEIDVersion1Report();
			}else if(report.equals("patientEID2")){
				return new PatientEIDVersion2Report();
			}else if(report.equals("patientVL1")){
				return new PatientVLVersion1Report();
			}else if(report.equals("patientIndeterminate1")){
				return new PatientIndeterminateVersion1Report();
			}else if(report.equals("patientIndeterminate2")){
				return new PatientIndeterminateVersion2Report();
			}else if(report.equals("patientIndeterminateByLocation")){
				return new PatientIndeterminateByLocationReport();
			}else if(report.equals("indicatorSectionPerformance")){
				return new IndicatorSectionPerformanceReport();
			}else if(report.equals("patientHaitiClinical")){
				return new PatientClinicalReport(!isLNSP);
			}else if(report.equals("patientHaitiLNSP")){
				return new PatientClinicalReport(isLNSP);
			}else if(report.equals("patientCILNSP")){
				return new PatientCILNSPClinical();
			}else if(report.equals("patientCILNSP_vreduit")){
				return new PatientCILNSPClinical_vreduit();
			}else if(report.equals("indicatorHaitiClinicalHIV")){
				return new IndicatorHIV();
			}else if(report.equals("indicatorHaitiLNSPHIV")){
				return new IndicatorHIVLNSP();
			}else if(report.equals("indicatorHaitiClinicalAllTests")){
				return new IndicatorAllTestClinical();
			}else if(report.equals("indicatorHaitiLNSPAllTests")){
				return new IndicatorAllTestLNSP();
			}else if(report.equals("CISampleExport")){
				return new ExportProjectByDate();
			}else if(report.equals("referredOut")){
				return new ReferredOutReport();
			}else if(report.equals("HaitiExportReport")){
				return new HaitiExportReport();
			}else if(report.equals("HaitiLNSPExportReport")){
				return new HaitiLNSPExportReport();
			}else if(report.equals("indicatorConfirmation")){
				return new ConfirmationReport();
			}else if(report.equals("retroCINonConformityByDate")){
				return new RetroCINonConformityByDate();
			}else if(report.equals("haitiNonConformityByDate")){
				return new HaitiNonConformityByDate();
			}else if(report.equals("haitiClinicalNonConformityByDate")){
				return new HaitiNonConformityByDate();
			}else if(report.equals("retroCInonConformityBySectionReason")){
				return new RetroCINonConformityBySectionReason();
			}else if(report.equals("retroCInonConformityByLabno")){
				return new RetroCINonConformityByLabno();
			}else if(report.equals("haitiNonConformityBySectionReason")){
				return new HaitiNonConformityBySectionReason();
			}else if(report.equals("haitiClinicalNonConformityBySectionReason")){
				return new HaitiNonConformityBySectionReason();
			}else if(report.equals("indicatorHaitiLNSPSiteTestCount")){
				return new IndicatorHaitiSiteTestCountReport();
			}else if(report.equals("retroCIFollowupRequiredByLocation")){
				return new RetroCIFollowupRequiredByLocation();
			}else if(report.equals("patientSpecialReport")){
				return new PatientSpecialRequestReport();
			}else if(report.equals("retroCInonConformityNotification")){
				return new RetroCINonConformityNotification();
			}else if(report.equals("patientCollection")){
				return new RetroCIPatientCollectionReport();
			}else if(report.equals("patientAssociated")){
				return new RetroCIPatientAssociatedReport();
			}else if(report.equals("indicatorCDILNSPHIV")){
				return new IndicatorCDIHIVLNSP();
			}else if(report.equals("validationBacklog")){
				return new ValidationBacklogReport();
			}else if(report.equals("indicatorRealisation")){
				return new IPCIRealisationReport();
            }else if(report.equals( "epiSurveillanceExport" )){
                return new HaitiLnspEpiExportReport();
            }else if (report.equals( "activityReportByPanel" )){
                return new ActivityReportByPanel();
            }else if (report.equals( "activityReportByTest" )){
                return new ActivityReportByTest();
            }else if (report.equals( "activityReportByTestSection" )){
                return new ActivityReportByTestSection();
            }else if (report.equals( "rejectionReportByPanel" )){
                return new RejectionReportByPanel();
            }else if (report.equals( "rejectionReportByTest" )){
                return new RejectionReportByTest();
            }else if (report.equals( "rejectionReportByTestSection" )){
                return new RejectionReportByTestSection();
            }
		}

		return null;

	}

}
