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

package com.aliyuncs.sae.model.v20190506;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sae.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class BindSlbRequest extends RoaAcsRequest<BindSlbResponse> {
	
	public BindSlbRequest() {
		super("sae", "2019-05-06", "BindSlb", "serverless");
		setUriPattern("/pop/v1/sam/app/slb");
		setMethod(MethodType.POST);
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String intranet;

	private String appId;

	private String internet;

	public String getIntranet() {
		return this.intranet;
	}

	public void setIntranet(String intranet) {
		this.intranet = intranet;
		if(intranet != null){
			putQueryParameter("Intranet", intranet);
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	public String getInternet() {
		return this.internet;
	}

	public void setInternet(String internet) {
		this.internet = internet;
		if(internet != null){
			putQueryParameter("Internet", internet);
		}
	}

	@Override
	public Class<BindSlbResponse> getResponseClass() {
		return BindSlbResponse.class;
	}

}
