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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.webplus.transform.v20190320.DescribeInstanceHealthResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceHealthResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private InstanceHealth instanceHealth;

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

	public InstanceHealth getInstanceHealth() {
		return this.instanceHealth;
	}

	public void setInstanceHealth(InstanceHealth instanceHealth) {
		this.instanceHealth = instanceHealth;
	}

	public static class InstanceHealth {

		private String instanceId;

		private String agentStatus;

		private String appStatus;

		private Long disconnectedTime;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getAgentStatus() {
			return this.agentStatus;
		}

		public void setAgentStatus(String agentStatus) {
			this.agentStatus = agentStatus;
		}

		public String getAppStatus() {
			return this.appStatus;
		}

		public void setAppStatus(String appStatus) {
			this.appStatus = appStatus;
		}

		public Long getDisconnectedTime() {
			return this.disconnectedTime;
		}

		public void setDisconnectedTime(Long disconnectedTime) {
			this.disconnectedTime = disconnectedTime;
		}
	}

	@Override
	public DescribeInstanceHealthResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceHealthResponseUnmarshaller.unmarshall(this, context);
	}
}
