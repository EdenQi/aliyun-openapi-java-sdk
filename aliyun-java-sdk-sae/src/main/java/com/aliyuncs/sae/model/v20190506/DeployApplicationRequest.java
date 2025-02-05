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
public class DeployApplicationRequest extends RoaAcsRequest<DeployApplicationResponse> {
	
	public DeployApplicationRequest() {
		super("sae", "2019-05-06", "DeployApplication", "serverless");
		setUriPattern("/pop/v1/sam/app/deployApplication");
		setMethod(MethodType.POST);
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String webContainer;

	private String jarStartArgs;

	private String commandArgs;

	private String readiness;

	private Integer batchWaitTime;

	private String liveness;

	private String envs;

	private String packageVersion;

	private String command;

	private String customHostAlias;

	private String updateStrategy;

	private String jdk;

	private String jarStartOptions;

	private Integer minReadyInstances;

	private String edasContainerVersion;

	private String packageUrl;

	private String appId;

	private String imageUrl;

	public String getWebContainer() {
		return this.webContainer;
	}

	public void setWebContainer(String webContainer) {
		this.webContainer = webContainer;
		if(webContainer != null){
			putQueryParameter("WebContainer", webContainer);
		}
	}

	public String getJarStartArgs() {
		return this.jarStartArgs;
	}

	public void setJarStartArgs(String jarStartArgs) {
		this.jarStartArgs = jarStartArgs;
		if(jarStartArgs != null){
			putQueryParameter("JarStartArgs", jarStartArgs);
		}
	}

	public String getCommandArgs() {
		return this.commandArgs;
	}

	public void setCommandArgs(String commandArgs) {
		this.commandArgs = commandArgs;
		if(commandArgs != null){
			putQueryParameter("CommandArgs", commandArgs);
		}
	}

	public String getReadiness() {
		return this.readiness;
	}

	public void setReadiness(String readiness) {
		this.readiness = readiness;
		if(readiness != null){
			putQueryParameter("Readiness", readiness);
		}
	}

	public Integer getBatchWaitTime() {
		return this.batchWaitTime;
	}

	public void setBatchWaitTime(Integer batchWaitTime) {
		this.batchWaitTime = batchWaitTime;
		if(batchWaitTime != null){
			putQueryParameter("BatchWaitTime", batchWaitTime.toString());
		}
	}

	public String getLiveness() {
		return this.liveness;
	}

	public void setLiveness(String liveness) {
		this.liveness = liveness;
		if(liveness != null){
			putQueryParameter("Liveness", liveness);
		}
	}

	public String getEnvs() {
		return this.envs;
	}

	public void setEnvs(String envs) {
		this.envs = envs;
		if(envs != null){
			putQueryParameter("Envs", envs);
		}
	}

	public String getPackageVersion() {
		return this.packageVersion;
	}

	public void setPackageVersion(String packageVersion) {
		this.packageVersion = packageVersion;
		if(packageVersion != null){
			putQueryParameter("PackageVersion", packageVersion);
		}
	}

	public String getCommand() {
		return this.command;
	}

	public void setCommand(String command) {
		this.command = command;
		if(command != null){
			putQueryParameter("Command", command);
		}
	}

	public String getCustomHostAlias() {
		return this.customHostAlias;
	}

	public void setCustomHostAlias(String customHostAlias) {
		this.customHostAlias = customHostAlias;
		if(customHostAlias != null){
			putQueryParameter("CustomHostAlias", customHostAlias);
		}
	}

	public String getUpdateStrategy() {
		return this.updateStrategy;
	}

	public void setUpdateStrategy(String updateStrategy) {
		this.updateStrategy = updateStrategy;
		if(updateStrategy != null){
			putQueryParameter("UpdateStrategy", updateStrategy);
		}
	}

	public String getJdk() {
		return this.jdk;
	}

	public void setJdk(String jdk) {
		this.jdk = jdk;
		if(jdk != null){
			putQueryParameter("Jdk", jdk);
		}
	}

	public String getJarStartOptions() {
		return this.jarStartOptions;
	}

	public void setJarStartOptions(String jarStartOptions) {
		this.jarStartOptions = jarStartOptions;
		if(jarStartOptions != null){
			putQueryParameter("JarStartOptions", jarStartOptions);
		}
	}

	public Integer getMinReadyInstances() {
		return this.minReadyInstances;
	}

	public void setMinReadyInstances(Integer minReadyInstances) {
		this.minReadyInstances = minReadyInstances;
		if(minReadyInstances != null){
			putQueryParameter("MinReadyInstances", minReadyInstances.toString());
		}
	}

	public String getEdasContainerVersion() {
		return this.edasContainerVersion;
	}

	public void setEdasContainerVersion(String edasContainerVersion) {
		this.edasContainerVersion = edasContainerVersion;
		if(edasContainerVersion != null){
			putQueryParameter("EdasContainerVersion", edasContainerVersion);
		}
	}

	public String getPackageUrl() {
		return this.packageUrl;
	}

	public void setPackageUrl(String packageUrl) {
		this.packageUrl = packageUrl;
		if(packageUrl != null){
			putQueryParameter("PackageUrl", packageUrl);
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

	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
		if(imageUrl != null){
			putQueryParameter("ImageUrl", imageUrl);
		}
	}

	@Override
	public Class<DeployApplicationResponse> getResponseClass() {
		return DeployApplicationResponse.class;
	}

}
