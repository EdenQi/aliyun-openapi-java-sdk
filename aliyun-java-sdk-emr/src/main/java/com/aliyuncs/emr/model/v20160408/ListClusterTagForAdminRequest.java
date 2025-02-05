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

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.emr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListClusterTagForAdminRequest extends RpcAcsRequest<ListClusterTagForAdminResponse> {
	
	public ListClusterTagForAdminRequest() {
		super("Emr", "2016-04-08", "ListClusterTagForAdmin", "emr");
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Long resourceOwnerId;

	private List<String> clusterIdLists;

	private String userId;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public List<String> getClusterIdLists() {
		return this.clusterIdLists;
	}

	public void setClusterIdLists(List<String> clusterIdLists) {
		this.clusterIdLists = clusterIdLists;	
		if (clusterIdLists != null) {
			for (int i = 0; i < clusterIdLists.size(); i++) {
				putQueryParameter("ClusterIdList." + (i + 1) , clusterIdLists.get(i));
			}
		}	
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
		}
	}

	@Override
	public Class<ListClusterTagForAdminResponse> getResponseClass() {
		return ListClusterTagForAdminResponse.class;
	}

}
