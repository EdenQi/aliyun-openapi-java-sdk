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

package com.aliyuncs.webplus.model.v20190320;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.webplus.transform.v20190320.DescribeChangesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeChangesResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<Change> changes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<Change> getChanges() {
		return this.changes;
	}

	public void setChanges(List<Change> changes) {
		this.changes = changes;
	}

	public static class Change {

		private String changeId;

		private String envId;

		private String changeName;

		private String changeDescription;

		private Boolean changeFinished;

		private Boolean changeSucceed;

		private Boolean changeAborted;

		private Boolean changePaused;

		private Boolean changeTimedout;

		private Long createTime;

		private Long updateTime;

		private Long finishTime;

		private String actionName;

		private String createUsername;

		private String changeMessage;

		public String getChangeId() {
			return this.changeId;
		}

		public void setChangeId(String changeId) {
			this.changeId = changeId;
		}

		public String getEnvId() {
			return this.envId;
		}

		public void setEnvId(String envId) {
			this.envId = envId;
		}

		public String getChangeName() {
			return this.changeName;
		}

		public void setChangeName(String changeName) {
			this.changeName = changeName;
		}

		public String getChangeDescription() {
			return this.changeDescription;
		}

		public void setChangeDescription(String changeDescription) {
			this.changeDescription = changeDescription;
		}

		public Boolean getChangeFinished() {
			return this.changeFinished;
		}

		public void setChangeFinished(Boolean changeFinished) {
			this.changeFinished = changeFinished;
		}

		public Boolean getChangeSucceed() {
			return this.changeSucceed;
		}

		public void setChangeSucceed(Boolean changeSucceed) {
			this.changeSucceed = changeSucceed;
		}

		public Boolean getChangeAborted() {
			return this.changeAborted;
		}

		public void setChangeAborted(Boolean changeAborted) {
			this.changeAborted = changeAborted;
		}

		public Boolean getChangePaused() {
			return this.changePaused;
		}

		public void setChangePaused(Boolean changePaused) {
			this.changePaused = changePaused;
		}

		public Boolean getChangeTimedout() {
			return this.changeTimedout;
		}

		public void setChangeTimedout(Boolean changeTimedout) {
			this.changeTimedout = changeTimedout;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public Long getFinishTime() {
			return this.finishTime;
		}

		public void setFinishTime(Long finishTime) {
			this.finishTime = finishTime;
		}

		public String getBizActionName() {
			return this.actionName;
		}

		public void setBizActionName(String actionName) {
			this.actionName = actionName;
		}

		/**
		 * @deprecated use getBizActionName instead of this.
		 */
		@Deprecated
		public String getActionName() {
			return this.actionName;
		}

		/**
		 * @deprecated use setBizActionName instead of this.
		 */
		@Deprecated
		public void setActionName(String actionName) {
			this.actionName = actionName;
		}

		public String getCreateUsername() {
			return this.createUsername;
		}

		public void setCreateUsername(String createUsername) {
			this.createUsername = createUsername;
		}

		public String getChangeMessage() {
			return this.changeMessage;
		}

		public void setChangeMessage(String changeMessage) {
			this.changeMessage = changeMessage;
		}
	}

	@Override
	public DescribeChangesResponse getInstance(UnmarshallerContext context) {
		return	DescribeChangesResponseUnmarshaller.unmarshall(this, context);
	}
}
