<%@ page language="java"
	contentType="text/html; charset=utf-8"
	import="org.apache.struts.action.*,
			us.mn.state.health.lims.common.action.IActionConstants"
 %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-tiles" prefix="tiles" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<%--action is set in BaseAction--%>

 <% if (request.getAttribute(IActionConstants.ACTION_KEY) != null) { %>
 <form name='<%=(String)request.getAttribute(IActionConstants.FORM_NAME) %>' action='<%=(String)request.getAttribute(IActionConstants.ACTION_KEY) %>' onsubmit="return submitForm(this);" method="POST">
 <% } %>

	<table cellpadding="0" cellspacing="1" width="100%" height="100%" border="0">
	
			<tr valign="top">
				<td>
					<%--tiles:insert attribute="error"/--%>
				</td>
			</tr>
			<tr valign="top">
				<td>
					<tiles:insert attribute="preSelectionHeader"/>
				</td>
			</tr>
			<tr valign="top">
				<td>
					<tiles:insert attribute="header"/>
				</td>
			</tr>
			<tr valign="top">
				<td>
					<tiles:insert attribute="body"/>
				</td>
			</tr>
			<tr valign="bottom">
				<td>
					<tiles:insert attribute="footer"/>
				</td>
			</tr>

	</table>
<% if (request.getAttribute(IActionConstants.ACTION_KEY) != null) { %>
</form>
<% } %>
