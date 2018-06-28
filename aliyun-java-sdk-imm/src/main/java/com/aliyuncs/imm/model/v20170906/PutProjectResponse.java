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

package com.aliyuncs.imm.model.v20170906;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.imm.transform.v20170906.PutProjectResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PutProjectResponse extends AcsResponse {

	private String requestId;

	private String project;

	private String createTime;

	private String modifyTime;

	private String serviceRole;

	private Integer cU;

	private String type;

	private List<EnginesItem> engines;

	private List<IndexersItem> indexers;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getProject() {
		return this.project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getModifyTime() {
		return this.modifyTime;
	}

	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getServiceRole() {
		return this.serviceRole;
	}

	public void setServiceRole(String serviceRole) {
		this.serviceRole = serviceRole;
	}

	public Integer getCU() {
		return this.cU;
	}

	public void setCU(Integer cU) {
		this.cU = cU;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<EnginesItem> getEngines() {
		return this.engines;
	}

	public void setEngines(List<EnginesItem> engines) {
		this.engines = engines;
	}

	public List<IndexersItem> getIndexers() {
		return this.indexers;
	}

	public void setIndexers(List<IndexersItem> indexers) {
		this.indexers = indexers;
	}

	public static class EnginesItem {

		private String name;

		private Long jobTtl;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getJobTtl() {
			return this.jobTtl;
		}

		public void setJobTtl(Long jobTtl) {
			this.jobTtl = jobTtl;
		}
	}

	public static class IndexersItem {

		private String name;

		private String status;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public PutProjectResponse getInstance(UnmarshallerContext context) {
		return	PutProjectResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
