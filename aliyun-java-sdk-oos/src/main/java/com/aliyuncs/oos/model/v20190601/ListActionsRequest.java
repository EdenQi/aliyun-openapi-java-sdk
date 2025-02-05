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

package com.aliyuncs.oos.model.v20190601;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ListActionsRequest extends RpcAcsRequest<ListActionsResponse> {
	
	public ListActionsRequest() {
		super("oos", "2019-06-01", "ListActions", "OOS");
	}

	private String nextToken;

	private Integer maxResults;

	private String oOSActionName;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	public String getOOSActionName() {
		return this.oOSActionName;
	}

	public void setOOSActionName(String oOSActionName) {
		this.oOSActionName = oOSActionName;
		if(oOSActionName != null){
			putQueryParameter("OOSActionName", oOSActionName);
		}
	}

	@Override
	public Class<ListActionsResponse> getResponseClass() {
		return ListActionsResponse.class;
	}

}
