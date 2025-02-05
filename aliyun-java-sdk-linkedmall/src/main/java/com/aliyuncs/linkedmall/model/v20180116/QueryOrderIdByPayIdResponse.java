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

package com.aliyuncs.linkedmall.model.v20180116;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkedmall.transform.v20180116.QueryOrderIdByPayIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryOrderIdByPayIdResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private List<LmOrderIdsItem> lmOrderIds;

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

	public List<LmOrderIdsItem> getLmOrderIds() {
		return this.lmOrderIds;
	}

	public void setLmOrderIds(List<LmOrderIdsItem> lmOrderIds) {
		this.lmOrderIds = lmOrderIds;
	}

	public static class LmOrderIdsItem {

		private Long lmOrderId;

		public Long getLmOrderId() {
			return this.lmOrderId;
		}

		public void setLmOrderId(Long lmOrderId) {
			this.lmOrderId = lmOrderId;
		}
	}

	@Override
	public QueryOrderIdByPayIdResponse getInstance(UnmarshallerContext context) {
		return	QueryOrderIdByPayIdResponseUnmarshaller.unmarshall(this, context);
	}
}
