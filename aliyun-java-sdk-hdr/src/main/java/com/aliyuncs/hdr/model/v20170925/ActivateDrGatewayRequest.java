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

package com.aliyuncs.hdr.model.v20170925;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.hdr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ActivateDrGatewayRequest extends RpcAcsRequest<ActivateDrGatewayResponse> {
	
	public ActivateDrGatewayRequest() {
		super("hdr", "2017-09-25", "ActivateDrGateway", "hdr");
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String ipAddress;

	private String gatewayVersion;

	private Long activationCode;

	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
		if(ipAddress != null){
			putQueryParameter("IpAddress", ipAddress);
		}
	}

	public String getGatewayVersion() {
		return this.gatewayVersion;
	}

	public void setGatewayVersion(String gatewayVersion) {
		this.gatewayVersion = gatewayVersion;
		if(gatewayVersion != null){
			putQueryParameter("GatewayVersion", gatewayVersion);
		}
	}

	public Long getActivationCode() {
		return this.activationCode;
	}

	public void setActivationCode(Long activationCode) {
		this.activationCode = activationCode;
		if(activationCode != null){
			putQueryParameter("ActivationCode", activationCode.toString());
		}
	}

	@Override
	public Class<ActivateDrGatewayResponse> getResponseClass() {
		return ActivateDrGatewayResponse.class;
	}

}
