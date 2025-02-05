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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.ListAlertDingDingGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAlertDingDingGroupResponse extends AcsResponse {

	private List<AlertDingDingGroup> alertDingDingGroupList;

	public List<AlertDingDingGroup> getAlertDingDingGroupList() {
		return this.alertDingDingGroupList;
	}

	public void setAlertDingDingGroupList(List<AlertDingDingGroup> alertDingDingGroupList) {
		this.alertDingDingGroupList = alertDingDingGroupList;
	}

	public static class AlertDingDingGroup {

		private Long id;

		private String gmtCreate;

		private String gmtModified;

		private String bizId;

		private String name;

		private String description;

		private String webHookUrl;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getWebHookUrl() {
			return this.webHookUrl;
		}

		public void setWebHookUrl(String webHookUrl) {
			this.webHookUrl = webHookUrl;
		}
	}

	@Override
	public ListAlertDingDingGroupResponse getInstance(UnmarshallerContext context) {
		return	ListAlertDingDingGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
