/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ImportAppAlertRulesRequest extends RpcAcsRequest<ImportAppAlertRulesResponse> {
	
	public ImportAppAlertRulesRequest() {
		super("ARMS", "2019-08-08", "ImportAppAlertRules", "arms");
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Boolean isAutoStart;

	private String contactGroupIds;

	private String pids;

	private String templateAlertId;

	public Boolean getIsAutoStart() {
		return this.isAutoStart;
	}

	public void setIsAutoStart(Boolean isAutoStart) {
		this.isAutoStart = isAutoStart;
		if(isAutoStart != null){
			putQueryParameter("IsAutoStart", isAutoStart.toString());
		}
	}

	public String getContactGroupIds() {
		return this.contactGroupIds;
	}

	public void setContactGroupIds(String contactGroupIds) {
		this.contactGroupIds = contactGroupIds;
		if(contactGroupIds != null){
			putQueryParameter("ContactGroupIds", contactGroupIds);
		}
	}

	public String getPids() {
		return this.pids;
	}

	public void setPids(String pids) {
		this.pids = pids;
		if(pids != null){
			putQueryParameter("Pids", pids);
		}
	}

	public String getTemplateAlertId() {
		return this.templateAlertId;
	}

	public void setTemplateAlertId(String templateAlertId) {
		this.templateAlertId = templateAlertId;
		if(templateAlertId != null){
			putQueryParameter("TemplateAlertId", templateAlertId);
		}
	}

	@Override
	public Class<ImportAppAlertRulesResponse> getResponseClass() {
		return ImportAppAlertRulesResponse.class;
	}

}
