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
public class SearchRetcodeAppByPageRequest extends RpcAcsRequest<SearchRetcodeAppByPageResponse> {
	
	public SearchRetcodeAppByPageRequest() {
		super("ARMS", "2019-08-08", "SearchRetcodeAppByPage", "arms");
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String retcodeAppName;

	private Integer pageSize;

	private Integer pageNumber;

	public String getRetcodeAppName() {
		return this.retcodeAppName;
	}

	public void setRetcodeAppName(String retcodeAppName) {
		this.retcodeAppName = retcodeAppName;
		if(retcodeAppName != null){
			putQueryParameter("RetcodeAppName", retcodeAppName);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	@Override
	public Class<SearchRetcodeAppByPageResponse> getResponseClass() {
		return SearchRetcodeAppByPageResponse.class;
	}

}
